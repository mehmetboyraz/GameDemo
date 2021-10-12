import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CheckPlayers {
	public boolean save(Players players) throws RemoteException {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		return client.TCKimlikNoDogrula(players.getNatilionId(), players.getName(),
				players.getLastName(), players.getYearOfBirth());
		 

}
	}
