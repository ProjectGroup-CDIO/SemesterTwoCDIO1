package Data;

import java.util.List;

import Data.IOperatoerDAO.DALException;

public class Funktionalitet implements IFunktionalitet {
	
	IOperatoerDAO OPdata = new OperatoerDAO();
	
	

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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void UpdateOperator(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<OperatoerDTO> ShowOperators() throws DALException {
		return OPdata.getOperatoerList();
		
	}
	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {
		
	return	OPdata.getOperatoer(oprId);
	
	}

}
