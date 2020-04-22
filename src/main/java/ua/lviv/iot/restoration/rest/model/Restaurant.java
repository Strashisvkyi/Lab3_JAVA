package ua.lviv.iot.restoration.rest.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "restaurants")
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private int ratingInStars;
	
	@Column
	private String location;
	
	@OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER)
	@JsonIgnoreProperties("restaurant")
	private Set<Table> tables;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRatingInStars() {
		return ratingInStars;
	}

	public void setRatingInStars(int ratingInStars) {
		this.ratingInStars = ratingInStars;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Table> getTables() {
		return tables;
	}

	public void setTables(Set<Table> tables) {
		this.tables = tables;
	}

	public Restaurant(int ratingInStars, String location, Set<Table> tables) {
		super();
		this.ratingInStars = ratingInStars;
		this.location = location;
		this.tables = tables;
	}

	public Restaurant() {
	}

}
