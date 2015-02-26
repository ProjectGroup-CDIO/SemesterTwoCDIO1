package Data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Data.IOperatoerDAO.DALException;

public class OperatoerDAOTest {
	
	OperatoerDAO opr; 

	@Before
	public void setUp() throws Exception {
		opr = new OperatoerDAO();
		
	}

	@Test
	public void testGetOperatoer() {
		try {
			opr.getOperatoer(11);
		} catch (DALException e) {
			System.out.println("Operatoer findes ikke");
			e.printStackTrace();
		}
		//How to test this?
	}

}
