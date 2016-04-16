package nl.apg.util.mapper;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;

public abstract class AbstractTestBeanMapper {

	private static final String START_PACKAGE = "nl.";
	

	
	/**
	 * Deze kan een Set teruggeven met properties die in de MapTOEntity methode niet gemapped worden
	 * @return Set<String>
	 */
	protected abstract Set<String> ignoreMapToEntityProperties();

	/**
	 * Deze kan een Set teruggeven met properties die in de MapFromEntity methode niet gemapped worden
	 * @return Set<String>
	 */
	protected abstract Set<String> ignoreMapFromEntityProperties();

	protected Object populate(final Class<?> aSourceClass)  {
		//TODO add your bean populator here
		try {
			return aSourceClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected void testEquals(final Object object1, final Object object2, Set<String> ignoreProps) {
		Map<Field, Object> values1 = fillValues(object1);
		Map<Field, Object> values2 = fillValues(object2);
		assertValues(values1, values2, ignoreProps);
	}

	private void assertValues(Map<Field, Object> values1, Map<Field, Object> values2, Set<String> ignoreProps) {
		for (Field field : values1.keySet()) {
			if (ignoreProps == null || !ignoreProps.contains(field.getName())) {
				assertValue(values1, values2, field); 
			}
		}
	}

	private void assertValue(Map<Field, Object> values1, Map<Field, Object> values2, Field field) {
		Object value1 = values1.get(field);
		Object value2 = values2.get(field);
		if (value1 != null && value2 != null) {
			assertValues(field, value1, value2);
		} else if (value1 == null && value2 != null) {
			Assert.fail("property " + field.getName() + " is ongelijk ");
		} else if (value1 != null && value2 == null) {
			Assert.fail("property " + field.getName() + " is ongelijk ");
		}
	}

	@SuppressWarnings("rawtypes")
	private void assertValues(Field field, Object value1, Object value2) {
		if (value1.getClass().isArray() || value1 instanceof Collection) {
			Collection<?> coll1 = (Collection) value1;
			Collection<?> coll2 = (Collection) value2;
			Assert.assertTrue("collection property " + field.getName() + " bevat niet hetzelfde aantal elementen  ", coll1.size() == coll2.size());
		} else if (!isNestedType(value1.getClass())) {
			Assert.assertTrue("property " + field.getName() + " is ongelijk ", value1.equals(value2));
		}
	}
	
	private Map<Field, Object> fillValues(final Object object1) {
		Map<Field, Object> result = new HashMap<Field, Object>();
		for (Field field : getFields(object1.getClass())) {
			result.put(field, getValue(field, object1));
		}
		return result;
	}
	
	private List<Field> getFields(Class<?> aSourceClass) {
		List<Field> result = new ArrayList<Field>();

		Field fields[] = aSourceClass.getDeclaredFields();
		for (Field field : fields) {
			result.add(field);
		}

		return result;
	}
	
	private Object getValue(final Field field, Object aObject) {
		final Method method = getGetter(field, aObject);
		if (method == null) {
			return null;
		} else {
			try {
				return method.invoke(aObject, new Object[] {});
			} catch (IllegalAccessException e) {
				return null;
			} catch (IllegalArgumentException e) {
				return null;
			} catch (InvocationTargetException e) {
				return null;
			}
		}
	}
	
	private Method getGetter(final Field field, final Object object) {
		final String getterName = "get" + capName(field.getName());
		try {
			final Method method = object.getClass().getMethod(getterName, new Class<?>[] {});
			return method;
		} catch (NoSuchMethodException e) {
			return null;
		} catch (SecurityException e) {
			return null;
		}
	}
	
	private String capName(String name) {
		if (name.length() == 0)
			return name;
		else
			return (name.substring(0, 1).toUpperCase() + name.substring(1));
	}
	
	private boolean isNestedType(Class<?> aClass) {
		String fldTypName = aClass.getPackage().getName();
		return fldTypName.startsWith(START_PACKAGE);
	}
	
}
