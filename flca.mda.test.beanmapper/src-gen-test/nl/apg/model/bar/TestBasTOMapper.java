/* generated with BeanMapper */

package nl.apg.model.bar;
 
import java.util.HashSet;
import java.util.Set;

import nl.apg.model.bar.Bas;
import nl.apg.model.bar.BasTO;

import nl.apg.util.mapper.AbstractTestBeanMapper;

import org.junit.Test;
  


public class TestBasTOMapper extends AbstractTestBeanMapper {
	
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
		Bas bas1 =(Bas) populate(Bas.class);
		BasTO basTO = BasTOMapper.mapFromEntity(bas1);
		Bas bas2 = BasTOMapper.mapToEntity(basTO);
		testEquals(bas1, bas2, ignoreMapToEntityProperties());
	}

	@Test
	public void testMapFromEntity() {
		BasTO basTO1 =(BasTO) populate(BasTO.class);
		Bas bas1 = BasTOMapper.mapToEntity(basTO1);
		BasTO basTO2 = BasTOMapper.mapFromEntity(bas1);
		testEquals(basTO1, basTO2, ignoreMapFromEntityProperties());
	}
	
}
