package nl.apg.model.foo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

import nl.apg.model.bar.BarTO;
import nl.apg.model.bar.BasTO;

public class FooTO {

	private String naam;
	private int aantal;
	private BigDecimal bedrag;
	private Date datum;
	private List<Long> nummers;
	private BarTO bar;
	private Set<BasTO> bass;
	
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

	public BarTO getBar() {
		return bar;
	}

	public void setBar(BarTO bar) {
		this.bar = bar;
	}

	public Set<BasTO> getBass() {
		return bass;
	}

	public void setBass(Set<BasTO> bass) {
		this.bass = bass;
	}
	
}
