package Data;

import java.util.List;

import Data.IOperatoerDAO.DALException;

public class Funktionalitet implements IFunktionalitet {

	IOperatoerDAO OPdata = new OperatoerDAO();
	boolean ADMIN = false;


	@Override
	public void createOperator(OperatoerDTO opr) throws DALException {
		try {
			System.out.println(OPdata.getOperatoer(12));
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public void deleteOperator(OperatoerDTO opr) throws DALException {
		if(isAdmin()) {

		}

	}
	@Override
	public void UpdateOperator(OperatoerDTO opr) throws DALException {
		if(isAdmin()) {

		}

	}
	@Override
	public List<OperatoerDTO> ShowOperators() throws DALException {
		if(isAdmin()) {
			return OPdata.getOperatoerList();	
		}
		return null;

	}
	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {
		if(isAdmin()){
			return	OPdata.getOperatoer(oprId);
		}
		return null;
		
	}
	public boolean isAdmin(){
		
		ADMIN = true;
		
		return ADMIN;
	}
}
