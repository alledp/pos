package entities;

public class Table {
	
	private int id;
	private String location;
	private int size;
	private boolean available;
	
	public Table(int id, String location, int size, boolean available) {
		this.id = id;
		this.location = location;
		this.size = size;
		this.available = available;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	//Metodo exclusivo da classe
	
	public String checkTables() {
		if(available) {
			return "Table No.: " + id + ", " + location + " - available";
		}
		else {
			return "Table No.: " + id + ", " + location + " - reserved";
		}
	}

}
