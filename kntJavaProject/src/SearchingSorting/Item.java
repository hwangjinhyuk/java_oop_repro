package SearchingSorting;

public class Item {
	String ItemName;
	double price;
	int qty;
	public Item(String itemName, double price, int qty) {
		super();
		ItemName = itemName;
		this.price = price;
		this.qty = qty;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	


}
