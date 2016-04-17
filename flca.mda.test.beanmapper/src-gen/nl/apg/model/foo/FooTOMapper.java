/* generated with BeanMapper */

package nl.apg.model.foo;
 
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import nl.apg.model.bar.Bar;
import nl.apg.model.bar.BarTO;
import nl.apg.model.bar.BarTOMapper;
import nl.apg.model.bar.Bas;
import nl.apg.model.bar.BasTO;
import nl.apg.model.bar.BasTOMapper;

import nl.apg.model.foo.Foo;
import nl.apg.model.foo.FooTO;
  



public class FooTOMapper {
	/**
	* map entity class to To
	* @param entity, Foo
	* @result FooTO 
	*/
	public static FooTO mapFromEntity(Foo entity) {
		FooTO result = new FooTO();
		mapFromNaam(entity, result);
		mapFromAantal(entity, result);
		mapFromBedrag(entity, result);
		mapFromDatum(entity, result);
		mapFromNummers(entity, result);
		mapFromBar(entity, result);
		mapFromBass(entity, result);		
		return result;
	}
 
	private static void mapFromNaam(final Foo entity, final FooTO result) {
		result.setNaam(entity.getNaam());
	}
 
	private static void mapFromAantal(final Foo entity, final FooTO result) {
		result.setAantal(entity.getAantal());
	}
 
	private static void mapFromBedrag(final Foo entity, final FooTO result) {
		result.setBedrag(entity.getBedrag());
	}
 
	private static void mapFromDatum(final Foo entity, final FooTO result) {
		result.setDatum(entity.getDatum());
	}
 
	private static void mapFromNummers(final Foo entity, final FooTO result) {
		result.setNummers(entity.getNummers());
	}
 
	private static void mapFromBar(final Foo entity, final FooTO result) {
		if (entity.getBar() != null) {
			result.setBar(BarTOMapper.mapFromEntity(entity.getBar()));
			result.getBar().setFoo(result);
		}
	}
 
	private static void mapFromBass(final Foo entity, final FooTO result) {
 		if (entity.getBass() != null) { 
			result.setBass(new HashSet<BasTO>()); 
			for (Bas item : entity.getBass()) {
				BasTO elem = BasTOMapper.mapFromEntity(item);
				elem.setFoo(result);
				result.getBass().add(elem);
			}
		}
	}
 
 
	/**
	* map from To to entity
	* @param sourceTO, FooTO
	* @result Foo 
	*/
	public static Foo mapToEntity(FooTO sourceTO) {
		Foo result = new Foo();
		mapToNaam(sourceTO, result);
		mapToAantal(sourceTO, result);
		mapToBedrag(sourceTO, result);
		mapToDatum(sourceTO, result);
		mapToNummers(sourceTO, result);
		mapToBar(sourceTO, result);
		mapToBass(sourceTO, result);		
		return result;
	}
 
	private static void mapToNaam(final FooTO entity, final Foo result) {
		result.setNaam(entity.getNaam());
	}
 
	private static void mapToAantal(final FooTO entity, final Foo result) {
		result.setAantal(entity.getAantal());
	}
 
	private static void mapToBedrag(final FooTO entity, final Foo result) {
		result.setBedrag(entity.getBedrag());
	}
 
	private static void mapToDatum(final FooTO entity, final Foo result) {
		result.setDatum(entity.getDatum());
	}
 
	private static void mapToNummers(final FooTO entity, final Foo result) {
		result.setNummers(entity.getNummers());
	}
 
	private static void mapToBar(final FooTO entity, final Foo result) {
		if (entity.getBar() != null) {
			result.setBar(BarTOMapper.mapToEntity(entity.getBar()));
			result.getBar().setFoo(result);
		}			
	}
 
	private static void mapToBass(final FooTO entity, final Foo result) {
 		if (entity.getBass() != null) { 
			result.setBass(new HashSet<Bas>()); 
			for (BasTO item : entity.getBass()) {
				Bas elem = BasTOMapper.mapToEntity(item);
				elem.setFoo(result);
				result.getBass().add(elem);
			}
		}		
	}
 
 }

