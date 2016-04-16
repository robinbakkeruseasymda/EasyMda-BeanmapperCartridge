/* generated with BeanMapper */

package nl.apg.model.foo;
 
import java.util.HashSet;
import java.util.Set;

import nl.apg.model.foo.Foo;
import nl.apg.model.foo.FooTO;

import nl.apg.util.mapper.AbstractTestBeanMapper;

import org.junit.Test;
  


public class TestFooTOMapper extends AbstractTestBeanMapper {
	
	@Override
	protected Set<String> ignoreMapToEntityProperties() {
		Set<String> result = new HashSet<>();
		return result;
	}

	@Override
	protected Set<String> ignoreMapFromEntityProperties() {
		Set<String> result = new HashSet<>();
		return result;
	}

	@Test
	public void testMapToEntity() {
		Foo foo1 =(Foo) populate(Foo.class);
		FooTO fooTO = FooTOMapper.mapFromEntity(foo1);
		Foo foo2 = FooTOMapper.mapToEntity(fooTO);
		testEquals(foo1, foo2, ignoreMapToEntityProperties());
	}

	@Test
	public void testMapFromEntity() {
		FooTO fooTO1 =(FooTO) populate(FooTO.class);
		Foo foo1 = FooTOMapper.mapToEntity(fooTO1);
		FooTO fooTO2 = FooTOMapper.mapFromEntity(foo1);
		testEquals(fooTO1, fooTO2, ignoreMapFromEntityProperties());
	}
	
}
