package entities;

public class Menu {
	
	private MenuType menuType;
	private String item;
	private double price;
	
	public Menu(MenuType menuType, String item, double price) {
		this.menuType = menuType;
		this.item = item;
		this.price = price;
	}

	public MenuType getMenuType() {
		return menuType;
	}

	public void setMenuType(MenuType menuType) {
		this.menuType = menuType;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//Metodo exclusivo da classe
	
	public void sale(double percentage) {
		price = price - price * (percentage/100);
	}
	
}
