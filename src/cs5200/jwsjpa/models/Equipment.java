package cs5200.jwsjpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Equipment {

	@Id
	@SequenceGenerator( name = "equipmentSeq", sequenceName = "EQUIPMENT_SEQ", allocationSize = 1, initialValue = 11 )
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="equipmentSeq")
	private int id;
	private String name;
	private String brand;
	private String description;
	private double price;
	private int towerId;
	
	public Equipment() {
	}

	public Equipment(int id, String name, String brand, String description,
			double price, int towerId) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.towerId = towerId;
	}

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTowerId() {
		return towerId;
	}

	public void setTowerId(int towerId) {
		this.towerId = towerId;
	}
	
}
