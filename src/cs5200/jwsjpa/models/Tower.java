package cs5200.jwsjpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Tower {

	@Id
	@SequenceGenerator( name = "towerSeq", sequenceName = "TOWER_SEQ", allocationSize = 1, initialValue = 5)
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="towerSeq")
	private int id;
	private String name;
	private double height;
	private int sides;
	private int siteId;
	
	public Tower() {
	}

	public Tower(int id, String name, double height, int sides, int siteId) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.sides = sides;
		this.siteId = siteId;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	
	
	
}
