/* generated with BeanMapper */

package nl.apg.model.bar;
 
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;

import nl.apg.model.bar.BarType;
import nl.apg.model.bar.Bas;
import nl.apg.model.bar.BasTO;

import nl.apg.model.foo.Foo;
import nl.apg.model.foo.FooTO;
import nl.apg.model.foo.FooTOMapper;
  



public class BasTOMapper {
	/**
	* map entity class to To
	* @param entity, Bas
	* @result BasTO 
	*/
	public static BasTO mapFromEntity(Bas entity) {
		BasTO result = new BasTO();
		mapFromNaam(entity, result);
		mapFromAantal(entity, result);
		mapFromBedrag(entity, result);
		mapFromDatum(entity, result);
		mapFromNummers(entity, result);
		mapFromOnbekend(entity, result);
		mapFromType(entity, result);
		mapFromFoo(entity, result);		
		return result;
	}
 
	private static void mapFromNaam(final Bas entity, final BasTO result) {
		result.setNaam(entity.getNaam());
	}
 
	private static void mapFromAantal(final Bas entity, final BasTO result) {
		result.setAantal(entity.getAantal());
	}
 
	private static void mapFromBedrag(final Bas entity, final BasTO result) {
		result.setBedrag(entity.getBedrag());
	}
 
	private static void mapFromDatum(final Bas entity, final BasTO result) {
		result.setDatum(entity.getDatum());
	}
 
	private static void mapFromNummers(final Bas entity, final BasTO result) {
		result.setNummers(entity.getNummers());
	}
 
	private static void mapFromOnbekend(final Bas entity, final BasTO result) {
		//TODO unknown property entity.getOnbekend()
	}
 
	private static void mapFromType(final Bas entity, final BasTO result) {
		result.setType(entity.getType());
	}
 
	private static void mapFromFoo(final Bas entity, final BasTO result) {
		// here not mapped because it may give recursive loop
		// result.setFoo(FooTOMapper.mapFromEntity(entity.getFoo()));
	}
 
 
	/**
	* map from To to entity
	* @param sourceTO, BasTO
	* @result Bas 
	*/
	public static Bas mapToEntity(BasTO sourceTO) {
		Bas result = new Bas();
		mapToNaam(sourceTO, result);
		mapToAantal(sourceTO, result);
		mapToBedrag(sourceTO, result);
		mapToDatum(sourceTO, result);
		mapToNummers(sourceTO, result);
		mapToType(sourceTO, result);
		mapToFoo(sourceTO, result);		
		return result;
	}
 
	private static void mapToNaam(final BasTO entity, final Bas result) {
		result.setNaam(entity.getNaam());
	}
 
	private static void mapToAantal(final BasTO entity, final Bas result) {
		result.setAantal(entity.getAantal());
	}
 
	private static void mapToBedrag(final BasTO entity, final Bas result) {
		result.setBedrag(entity.getBedrag());
	}
 
	private static void mapToDatum(final BasTO entity, final Bas result) {
		result.setDatum(entity.getDatum());
	}
 
	private static void mapToNummers(final BasTO entity, final Bas result) {
		result.setNummers(entity.getNummers());
	}
 
	private static void mapToType(final BasTO entity, final Bas result) {
		result.setType(entity.getType());
	}
 
	private static void mapToFoo(final BasTO entity, final Bas result) {
		// here not mapped because it may give recursive loop
		// result.setFoo(FooTOMapper.mapToEntity(entity.getFoo()));			
	}
 
 }

