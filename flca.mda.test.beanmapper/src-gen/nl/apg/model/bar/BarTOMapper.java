/* generated with BeanMapper */

package nl.apg.model.bar;
 
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;

import nl.apg.model.bar.Bar;
import nl.apg.model.bar.BarTO;
import nl.apg.model.bar.BarType;

import nl.apg.model.foo.Foo;
import nl.apg.model.foo.FooTO;
import nl.apg.model.foo.FooTOMapper;
  



public class BarTOMapper {
	/**
	* map entity class to To
	* @param entity, Bar
	* @result BarTO 
	*/
	public static BarTO mapFromEntity(Bar entity) {
		BarTO result = new BarTO();
		mapFromNaam(entity, result);
		mapFromAantal(entity, result);
		mapFromBedrag(entity, result);
		mapFromDatum(entity, result);
		mapFromNummers(entity, result);
		mapFromOnbekend(entity, result);
		mapFromTypeLong(entity, result);
		mapFromType(entity, result);
		mapFromFoo(entity, result);		
		return result;
	}
 
	private static void mapFromNaam(final Bar entity, final BarTO result) {
		result.setNaam(entity.getNaam());
	}
 
	private static void mapFromAantal(final Bar entity, final BarTO result) {
		result.setAantal(entity.getAantal());
	}
 
	private static void mapFromBedrag(final Bar entity, final BarTO result) {
		result.setBedrag(entity.getBedrag());
	}
 
	private static void mapFromDatum(final Bar entity, final BarTO result) {
		result.setDatum(entity.getDatum());
	}
 
	private static void mapFromNummers(final Bar entity, final BarTO result) {
		result.setNummers(entity.getNummers());
	}
 
	private static void mapFromOnbekend(final Bar entity, final BarTO result) {
		//TODO unknown property entity.getOnbekend()
	}
 
	private static void mapFromTypeLong(final Bar entity, final BarTO result) {
		//TODO property entity.getTypeLong() has a different datatype (long ipv Long)
	}
 
	private static void mapFromType(final Bar entity, final BarTO result) {
		result.setType(entity.getType());
	}
 
	private static void mapFromFoo(final Bar entity, final BarTO result) {
		// here not mapped because it may give recursive loop
		// result.setFoo(FooTOMapper.mapFromEntity(entity.getFoo()));
	}
 
 
	/**
	* map from To to entity
	* @param sourceTO, BarTO
	* @result Bar 
	*/
	public static Bar mapToEntity(BarTO sourceTO) {
		Bar result = new Bar();
		mapToNaam(sourceTO, result);
		mapToAantal(sourceTO, result);
		mapToBedrag(sourceTO, result);
		mapToDatum(sourceTO, result);
		mapToNummers(sourceTO, result);
		mapToTypeLong(sourceTO, result);
		mapToType(sourceTO, result);
		mapToFoo(sourceTO, result);		
		return result;
	}
 
	private static void mapToNaam(final BarTO entity, final Bar result) {
		result.setNaam(entity.getNaam());
	}
 
	private static void mapToAantal(final BarTO entity, final Bar result) {
		result.setAantal(entity.getAantal());
	}
 
	private static void mapToBedrag(final BarTO entity, final Bar result) {
		result.setBedrag(entity.getBedrag());
	}
 
	private static void mapToDatum(final BarTO entity, final Bar result) {
		result.setDatum(entity.getDatum());
	}
 
	private static void mapToNummers(final BarTO entity, final Bar result) {
		result.setNummers(entity.getNummers());
	}
 
	private static void mapToTypeLong(final BarTO entity, final Bar result) {
	}
 
	private static void mapToType(final BarTO entity, final Bar result) {
		result.setType(entity.getType());
	}
 
	private static void mapToFoo(final BarTO entity, final Bar result) {
		// here not mapped because it may give recursive loop
		// result.setFoo(FooTOMapper.mapToEntity(entity.getFoo()));			
	}
 
 }

