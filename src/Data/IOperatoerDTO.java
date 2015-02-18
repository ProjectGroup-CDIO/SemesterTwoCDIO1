package Data;

public interface IOperatoerDTO {

	public int getOprId(String cpr) throws DataException;
	public void setOprId(int oprId);
	public String getOprNavn();
	public void setOprNavn(String oprNavn);
	public String getIni();
	public void setIni(String ini);
	public String getPassword();
	public void setPassword(String password);
	public String getCpr();

	public class DataException extends Exception{
		String ErrorMessage = "Missing Data!?!?";
		public DataException(String string1) {
			super(string1);
		}
	}
}
