package Data;

public interface IOperatoerDTO {

	
	/*
	public int getOprId(String cpr) throws DataException;
	public void setOprId(int currentId,int newId) throws DataException;
	public String getOprNavn(int oprId) throws DataException;
	public void setOprNavn(String oprNavn, int oprId) throws DataException;
	public String getIni(int oprId) throws DataException;
	public void setIni(String ini, int oprId) throws DataException;
	public String getPassword(int oprId) throws DataException;
	public void setPassword(String password,int oprId) throws DataException;
	public String getCpr(int oprId) throws DataException;
*/
	
	public class DataException extends Exception{
		String ErrorMessage = "Missing Data!?!?";
		public DataException(String string1) {
			super(string1);
		}
	}
}
