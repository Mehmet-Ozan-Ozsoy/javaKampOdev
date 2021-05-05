package gun_4_odev_3.entities;

import java.time.LocalDate;

import gun_4_odev_3.abstracts.Entity;

public class Game implements Entity {

	public Game() {
		
	}
	
	public Game(int id, String name, String genre, String manufacturer, String productCode, LocalDate releaseDate, String ignScore, String details, int unitsInStock, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.manufacturer = manufacturer;
		this.productCode = productCode;
		this.releaseDate = releaseDate;
		this.ignScore = ignScore;
		this.details = details;
		this.unitsInStock = unitsInStock;
		this.unitPrice = unitPrice;
	}
	
	private int id;
	private String name;
	private String genre;
	private String manufacturer;
	private String productCode;	
	private LocalDate releaseDate;
	private String ignScore;
	private String details;
	private int unitsInStock;
	private double unitPrice;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getIgnScore() {
		return ignScore;
	}

	public void setIgnScore(String ignScore) {
		this.ignScore = ignScore;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}	
}
