package flca.mda.api.util;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mda.template.BeanMapperConstants;
import mda.template.TidBeanMapper;

public class BeanMapperTypeUtils extends TypeUtils {

	
	public boolean hasOtherProperty(Fw fw, List<Fw> otherFws) {
		for (Fw otherFw : otherFws) {
			if (fw.name().equals(otherFw.name())) {
				return true;
			}
		}
		return false;
	}
	
	public Fw getOtherFw(Fw fw, List<Fw> otherFws) {
		for (Fw otherFw : otherFws) {
			if (fw.name().equals(otherFw.name())) {
				return otherFw;
			}
		}
		return null;
	}

	public boolean isSameType(Fw a, Fw b) {
		if (a.isCollection() && b.isCollection()) {
			return a.genericType().equals(b.genericType());
		} else {
			return a.type().equals(b.type());
		}
	}
	
	/**
	 * Deze is true als deze property een nested class is die met dezelfde package begint als de 
	 * owner class. (Dus als ownner met bijv "nl." begint en nested class ook met "nl.) 
	 * @param fw
	 * @return
	 */
	public boolean belongsTo(Class<?> parentClass, Fw fw) {
		String parentTypName = parentClass.getPackage().getName();
		String token1 = parentTypName.substring(0, parentTypName.indexOf("."));
		
		if (fw.isSimple()) {
			return false;
		} else if (fw.isCollection()) {
			String fldTypName = fw.genericType().getPackage().getName();
			return fldTypName.startsWith(token1);
		} else {
			String fldTypName = fw.type().getPackage().getName();
			return fldTypName.startsWith(token1);
		}
	}
	

	public String getMethodName(Class<?> targetClass, Class<?> returnType, Class<?> ... arguments) {
		Method methods[] = targetClass.getDeclaredMethods();
		for (int i=0; i<methods.length; i++) {
			Method m = methods[i];
			if (getMethodArgumentsMatch(m, arguments) && returnType.equals(m.getReturnType())) {
				return m.getName();
			}
		}
		return null;
	}
	
	private boolean getMethodArgumentsMatch(Method method, Class<?> ...  arguments) {
		Class<?> methodArgs[] = method.getParameterTypes();
		if (arguments.length == methodArgs.length) {
			int i=0;
			for (Class<?> clz : arguments) {
				if (!clz.equals(methodArgs[i++])) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	private static Set<Class<?>> GENERATED_CLASSES = new HashSet<>();
	private static Set<Class<?>> MAPPED_CLASSES = new HashSet<>();
	
	public void recursiveGenerate(Class<?> aClass1, Class<?> aClass2, boolean initialize) {
		if (initialize) {
			GENERATED_CLASSES = new  HashSet<>();
		}

		if (!GENERATED_CLASSES.contains(aClass1)) {
			GENERATED_CLASSES.add(aClass1);
			generate(aClass1, BeanMapperConstants.getTemplate(TidBeanMapper.BEANMAPPER_TO), aClass2);  
			generate(aClass1, BeanMapperConstants.getTemplate(TidBeanMapper.TEST_BEANMAPPER_TO), aClass2);  
		}
	}
	
	public void addToMappedClasses(Class<?> aClass) {
		MAPPED_CLASSES.add(aClass);
	}
	
	public boolean isAlreadyMapped(Class<?> aClass) {
		return MAPPED_CLASSES.contains(aClass);
	}
}
