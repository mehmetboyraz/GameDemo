
public class Product {
	int id;
	String ProductName;
	int UnitPrice;
	public Product(int id, String productName, int unitPrice) {
		super();
		this.id = id;
		ProductName = productName;
		UnitPrice = unitPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		UnitPrice = unitPrice;
	}
	
}
