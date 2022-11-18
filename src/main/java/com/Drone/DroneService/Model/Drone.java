package com.Drone.DroneService.Model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_drone")
public class Drone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name = "serial_no", columnDefinition = "VARCHAR(100) NOT NULL")
	private String serialNumber;
	
	@Column(name = "model", columnDefinition = "VARCHAR(50) NOT NULL") // Lightweight, Middleweight, Cruiserweight,Heavyweight
	private String model;
	
	@Column(name = "weight_limit", columnDefinition = "VARCHAR(10) NOT NULL")
	private double weightLimit;
	
	@Column(name = "battery",precision =2, scale = 0)
	private BigDecimal battery;
	
	@Column(name = "drone_state", columnDefinition = "VARCHAR(20) NOT NULL") // IDLE, LOADING, LOADED, DELIVERING,DELIVERED,RETURNING
	private String state;
	
	public Drone() {
		
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getWeightLimit() {
		return weightLimit;
	}

	public void setWeightLimit(double weightLimit) {
		this.weightLimit = weightLimit;
	}

	public BigDecimal getBattery() {
		return battery;
	}

	public void setBattery(BigDecimal battery) {
		this.battery = battery;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}
