package Data;

import java.util.List;

import Data.IOperatoerDAO.DALException;

public interface IFunktionalitet {
	

	void createOperator(OperatoerDTO opr)throws DALException;
	void deleteOperator(OperatoerDTO opr)throws DALException;
	OperatoerDTO getOperatoer(int oprId)throws DALException;
	public void UpdateOperator(OperatoerDTO opr)throws DALException;
	public List<OperatoerDTO> ShowOperators()throws DALException;
	

}
