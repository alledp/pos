package entities;

public class Stock {
	
	private String name;
	private String category;
	private int quantity;
	
	public Stock(String name, String category, int quantity) {
		this.name = name;
		this.category = category;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity( int quantity) {
		this.quantity = quantity;
	}
	
	//Metodo exclusivo da classe
	
	public int getItem(Menu item) {
		return this.quantity -= 1;
	}

}
