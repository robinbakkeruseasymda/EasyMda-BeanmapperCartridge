package nl.apg.model.bar;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import nl.apg.model.foo.FooTO;

public class BasTO {

	private String naam;
	private int aantal;
	private BigDecimal bedrag;
	private Date datum;
	private List<Long> nummers;
	private String onbekend;
	private BarType type;
	private FooTO foo;
	
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

	public String getOnbekend() {
		return onbekend;
	}

	public void setOnbekend(String onbekend) {
		this.onbekend = onbekend;
	}


	public FooTO getFoo() {
		return foo;
	}

	public void setFoo(FooTO fooTO) {
		this.foo = fooTO;
	}


	public BarType getType() {
		return type;
	}

	public void setType(BarType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aantal;
		result = prime * result + ((bedrag == null) ? 0 : bedrag.hashCode());
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((naam == null) ? 0 : naam.hashCode());
		result = prime * result + ((nummers == null) ? 0 : nummers.hashCode());
		result = prime * result + ((onbekend == null) ? 0 : onbekend.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasTO other = (BasTO) obj;
		if (aantal != other.aantal)
			return false;
		if (bedrag == null) {
			if (other.bedrag != null)
				return false;
		} else if (!bedrag.equals(other.bedrag))
			return false;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (naam == null) {
			if (other.naam != null)
				return false;
		} else if (!naam.equals(other.naam))
			return false;
		if (nummers == null) {
			if (other.nummers != null)
				return false;
		} else if (!nummers.equals(other.nummers))
			return false;
		return true;
	}
	

	
}
