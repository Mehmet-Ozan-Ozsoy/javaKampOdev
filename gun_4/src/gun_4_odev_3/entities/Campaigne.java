package gun_4_odev_3.entities;

import java.time.LocalDate;

import gun_4_odev_3.abstracts.Entity;

public class Campaigne implements Entity {

	public Campaigne() {
		
	}
	
	public Campaigne(int id, String name, LocalDate startDate, LocalDate endDate, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.discountRate = discountRate;
	}
	
	private int id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private double discountRate;
	
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

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
