package Data;

import java.util.List;

import Data.IOperatoerDAO.DALException;

public class Funktionalitet implements IFunktionalitet {

	IOperatoerDAO OPdata = new OperatoerDAO();
	boolean ADMIN = false;


	@Override
	public void createOperator(OperatoerDTO opr) throws DALException {
		try {
			OPdata.createOperatoer(opr);
			
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Check if the operator has been created correctly
		*Checks if the given Operatoer has been created by checking 
		*if the given opr matches with an excisting opr in the list of
		*operatoers.
		*/ 
		if(OPdata.getOperatoer(opr.oprId) == opr){
			System.out.println("Succes - new opr has been created.");
		}else{
			System.out.println("Faliure - found no opr that matched with a opr in the list.");
		}
	}
	@Override
	public void deleteOperator(OperatoerDTO opr) throws DALException {
		if(isAdmin()) {
		OPdata.deleteOperatoer(opr);
		}

	}
	@Override
	public void updateOperator(OperatoerDTO opr) throws DALException {
		if(isAdmin()) {
		OPdata.updateOperatoer(opr);
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
