package nl.apg.model.foo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

import nl.apg.model.bar.Bar;
import nl.apg.model.bar.Bas;

public class Foo {

	private String naam;
	private int aantal;
	private BigDecimal bedrag;
	private Date datum;
	private List<Long> nummers;
	private Bar bar;
	private Set<Bas> bass;
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getAantal() {
		return aantal;
	}
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}
	public BigDecimal getBedrag() {
		return bedrag;
	}
	public void setBedrag(BigDecimal bedrag) {
		this.bedrag = bedrag;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public List<Long> getNummers() {
		return nummers;
	}
	public void setNummers(List<Long> nummers) {
		this.nummers = nummers;
	}
	public Bar getBar() {
		return bar;
	}
	public void setBar(Bar bar) {
		this.bar = bar;
	}
	public Set<Bas> getBass() {
		return bass;
	}
	public void setBass(Set<Bas> bass) {
		this.bass = bass;
	}

	
}
