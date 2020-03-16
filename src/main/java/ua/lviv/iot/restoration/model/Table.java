package ua.lviv.iot.restoration.model;

public class Table {
	private boolean isFree;
	private boolean isClean;
	private int numberOfSeats;

	public boolean isClean() {
		return isClean;
	}

	public Table(int numberOfSeats) {
		isFree = true;
		isClean = true;
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}

}
