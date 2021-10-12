import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		Players players1 = new Players(1, "mehmet ertuðrul", "Boyraz", "MehmetBoy", 
				1998 , Long.parseLong("11813401694"));


		PlayersManager playersmanager = new PlayersManager(new CheckPlayers());{
			playersmanager.add(players1);
}
		Product product1 = new Product(1, "GümüþKýlýc", 100);
		Product product2 = new Product(2, "AltýnKýlýc", 150);{
			OfferManager offerManager = new OfferManager() {
			
			};
			offerManager.offer15(product1);
			System.out.println(product1.UnitPrice);
			offerManager.offer30(product2);
			System.out.println(product2.UnitPrice);
			
			
			
			
		};
}
}