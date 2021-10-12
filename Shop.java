
public class Shop{


	public void add(Product product) {
		System.out.println("Yeni Ürün Eklendi ;"+ product.ProductName);
	}
	public void delete(Product product) {
		System.out.println("Ürün Silindi ;"+product.ProductName);
	}
	public void Update(Product product) {
		System.out.println("Ürün Güncellendi ;"+product.ProductName);
	}

	}

