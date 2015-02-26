package Data;

import Data.IOperatoerDAO.DALException;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFunktionalitet a = new Funktionalitet();

		try {
			System.out.println(a.getOperatoer(12).ini);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			System.out.println(a.ShowOperators());
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
