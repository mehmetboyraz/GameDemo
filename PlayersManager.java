import java.rmi.RemoteException;

public class PlayersManager{
	CheckPlayers checkPlayers;
	public PlayersManager(CheckPlayers checkPlayers) {
	this.checkPlayers=checkPlayers;
	}
	
	
	public void add(Players players) throws RemoteException {
		if(checkPlayers.save(players)) {
		System.out.println("Oyuncu eklendi; " + players.NickName );
		}else {
			System.out.println("Kimlik bilgileriniz belgeniz ile uyumlu de�il.");
		}
		
	};

	public void delete(Players players) {
		System.out.println("Oyuncu silindi; " + players.NickName );
	};

	public void update(Players players) {
		System.out.println("Oyuncu g�ncellendi; " + players.NickName );
	};
	public void blok(Players players) {
		System.out.println("Oyuncu bu alan i�in engellendi; " + players.NickName );
	};









}

