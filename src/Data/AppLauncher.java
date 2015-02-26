package Data;

import Data.IOperatoerDAO.DALException;

public class AppLauncher {
	
	public static void main(String[] args) throws DALException{
		Applikation app = new Applikation();
		
		app.App();
	}

}
