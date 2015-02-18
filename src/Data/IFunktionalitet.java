package Data;

import Data.IOperatoerDAO.DALException;

public interface IFunktionalitet {

	void createOperator(OperatoerDTO opr)throws DALException;
	void deleteOperator(OperatoerDTO opr)throws DALException;
	public void UpdateOperator(OperatoerDTO opr)throws DALException;
	public void ShowOperators()throws DALException;
	

}
