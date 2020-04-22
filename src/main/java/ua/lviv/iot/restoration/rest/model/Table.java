package ua.lviv.iot.restoration.rest.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "tables")
public class Table {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	@Column
	private int naturalIlluminationInPercents;
	
	@Column
	private boolean free;
	
	@Column
	private boolean clean;
	
	@Column
	private int numberOfSeats;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Waiter_Table", joinColumns = {
			@JoinColumn(name = "table_id", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "waiter_id", nullable = false) })
	@JsonIgnoreProperties("tables")
	private Set<Waiter> waiters;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnoreProperties("tables")
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;

	public Table(boolean free, boolean clean, int numberOfSeats) {
		this.free = free;
		this.clean = clean;
		this.numberOfSeats = numberOfSeats;
	}

	public Table() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNaturalIlluminationInPercents() {
		return naturalIlluminationInPercents;
	}

	public void setNaturalIlluminationInPercents(int naturalIlluminationInPercents) {
		this.naturalIlluminationInPercents = naturalIlluminationInPercents;
	}

	public Set<Waiter> getWaiters() {
		return waiters;
	}

	public void setWaiters(Set<Waiter> waiters) {
		this.waiters = waiters;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}
