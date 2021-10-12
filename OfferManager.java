
public class OfferManager  implements OfferServýce{


	@Override
	public int offer15(Product product) {
		product.UnitPrice=(product.UnitPrice-((product.UnitPrice/100)*15));
		return product.UnitPrice;
	}

	@Override
	public int offer30(Product product) {
		product.UnitPrice=(product.UnitPrice-((product.UnitPrice/100)*30));
		return product.UnitPrice;
	}

}
