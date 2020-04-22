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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "waiters")
public class Waiter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private int yearsOfExperience;
	@Column
	private int age;
	@Column
	String name;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Waiter_Table", joinColumns = {
			@JoinColumn(name = "waiter_id", nullable = true) }, inverseJoinColumns = {
					@JoinColumn(name = "table_id", nullable = true) })
	@JsonIgnoreProperties("waiters")
	private Set<Table> tables;

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Waiter(int yearsOfExperience, int age, String name) {
		super();
		this.yearsOfExperience = yearsOfExperience;
		this.age = age;
		this.name = name;
	}

	public Waiter() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Table> getTables() {
		return tables;
	}

	public void setTables(Set<Table> tables) {
		this.tables = tables;
	}

}
