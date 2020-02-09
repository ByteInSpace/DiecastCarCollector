package de.byteinspace.diecastcollector.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToOne
	private Company company;
//	private Series series;
	private int numberSerie;
	private int ovp;
	private int carCondition; 
	private int ovpCondition; 
	private int year;
	private int numberYear;
	private String codeNumber; // GHC54-D521
	private String packageNumber; // 21A
	@ManyToOne
	private Country country;
//	private Date dateOfBuy;
	private double priceInEuro;
	private String colorMainCasting;
	private String colorUnderFloor;
	private String colorGlas;
	private String colorWheel;
	private String tampo;
	
	protected Car() {
		
	}
	
	
	
	public Car(String name) {
		super();
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
//	public Series getSeries() {
//		return series;
//	}
//	public void setSeries(Series series) {
//		this.series = series;
//	}
	public int getNumberSerie() {
		return numberSerie;
	}
	public void setNumberSerie(int numberSerie) {
		this.numberSerie = numberSerie;
	}
	public int isOvp() {
		return ovp;
	}
	public void setOvp(int ovp) {
		this.ovp = ovp;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getNumberYear() {
		return numberYear;
	}
	public void setNumberYear(int numberYear) {
		this.numberYear = numberYear;
	}
		
	public String getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}

	public int getOvp() {
		return ovp;
	}

	public String getPackageNumber() {
		return packageNumber;
	}
	public void setPackageNumber(String packageNumber) {
		this.packageNumber = packageNumber;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
//	public Date getDateOfBuy() {
//		return dateOfBuy;
//	}
//	public void setDateOfBuy(Date dateOfBuy) {
//		this.dateOfBuy = dateOfBuy;
//	}
	public double getPriceInEuro() {
		return priceInEuro;
	}
	public void setPriceInEuro(double priceInEuro) {
		this.priceInEuro = priceInEuro;
	}
	public String getColorMainCasting() {
		return colorMainCasting;
	}
	public void setColorMainCasting(String colorMainCasting) {
		this.colorMainCasting = colorMainCasting;
	}
	public String getColorUnderFloor() {
		return colorUnderFloor;
	}
	public void setColorUnderFloor(String colorUnderFloor) {
		this.colorUnderFloor = colorUnderFloor;
	}
	public String getColorGlas() {
		return colorGlas;
	}
	public void setColorGlas(String colorGlas) {
		this.colorGlas = colorGlas;
	}
	public String getColorWheel() {
		return colorWheel;
	}
	public void setColorWheel(String colorWheel) {
		this.colorWheel = colorWheel;
	}
	public String getTampo() {
		return tampo;
	}
	public void setTampo(String tampo) {
		this.tampo = tampo;
	}

	public int getCarCondition() {
		return carCondition;
	}

	public void setCarCondition(int carCondition) {
		this.carCondition = carCondition;
	}

	public int getOvpCondition() {
		return ovpCondition;
	}

	public void setOvpCondition(int ovpCondition) {
		this.ovpCondition = ovpCondition;
	}
	
	
	
}
