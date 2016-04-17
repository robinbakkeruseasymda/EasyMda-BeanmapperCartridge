/* generated with BeanMapper */

package nl.apg.model.bar;
 
import flca.xlsx.util.Xlsx;
import flca.xlsx.util.XlsxDataWriter;

import java.util.HashSet;
import java.util.Set;

import nl.apg.model.bar.Bar;
import nl.apg.model.bar.BarTO;

import nl.apg.util.mapper.AbstractTestBeanMapper;

import org.junit.Test;
  


public class TestBarTOMapper extends AbstractTestBeanMapper {

	private static final byte SHEET1 = 0;

	/*
	* Run this test once than move the generated excel files to src/test/resource and fill with testdata
	*/
	@Test 
	public void makeExcelTemplates() {
		XlsxDataWriter.writeXlsxFile("/tmp/Bar.xlsx", );
		XlsxDataWriter.writeXlsxFile("/tmp/BarTO.xlsx", );
	}
		
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
		Bar bar1 =(Bar) populate(Bar.class);
		BarTO barTO = BarTOMapper.mapFromEntity(bar1);
		Bar bar2 = BarTOMapper.mapToEntity(barTO);
		testEquals(bar1, bar2, ignoreMapToEntityProperties());
	}

	@Test
	public void testMapFromEntity() {
		BarTO barTO1 =(BarTO) populate(BarTO.class);
		Bar bar1 = BarTOMapper.mapToEntity(barTO1);
		BarTO barTO2 = BarTOMapper.mapFromEntity(bar1);
		testEquals(barTO1, barTO2, ignoreMapFromEntityProperties());
	}
	
}
