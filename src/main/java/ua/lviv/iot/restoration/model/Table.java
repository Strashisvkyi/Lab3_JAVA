package ua.lviv.iot.restoration.model;

public class Table {
	private int id;
	private boolean free;
	private boolean clean;
	private int numberOfSeats;

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
}
