package cs5200.jwsjpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Site {

	@Id
	@SequenceGenerator(name = "siteSeq", sequenceName = "SITE_SEQ", allocationSize = 1, initialValue = 3)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "siteSeq")
	private int id;
	private String name;
	private double latitude;
	private double longitude;

	public Site() {

	}

	public Site(int id, String name, double latitude, double longitude) {
		super();
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
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

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}
