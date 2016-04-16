package nl.apg.model.bar;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import nl.apg.model.foo.Foo;

public class Bar {

	private String naam;
	private int aantal;
	private BigDecimal bedrag;
	private Date datum;
	private List<Long> nummers;
	private long typeLong; //deze heeft in BarTO ander type
//	private Long[] klantIds;
	private BarType type;
	private Foo foo;
	
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
	public Foo getFoo() {
		return foo;
	}
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	public BarType getType() {
		return type;
	}
	public void setType(BarType type) {
		this.type = type;
	}
	public long getTypeLong() {
		return typeLong;
	}
	public void setTypeLong(long typeLong) {
		this.typeLong = typeLong;
	}
	
}
