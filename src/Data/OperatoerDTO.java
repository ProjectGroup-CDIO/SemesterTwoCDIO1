package Data;

import java.util.ArrayList;


public class OperatoerDTO implements IOperatoerDTO{
	
	private class Operatoer{
		int oprId;                     
		String oprNavn;                
		String ini;                 
		String cpr;                 
		String password;
		
		public Operatoer(int oprId, String oprNavn, String ini, String cpr, String password){
			super();
			this.oprId = oprId;
			this.oprNavn = oprNavn;
			this.ini = ini;
			this.cpr = cpr;
			this.password = password;
			
		}
	}
	
	
	private ArrayList<Operatoer> operatoer ; 

	public OperatoerDTO(){
		
		operatoer = new ArrayList<Operatoer>();

		// Tilf¿j personer
		
		operatoer.add(new Operatoer(10,"Lars Larsen","LaLa","123456-7890","123"));
		operatoer.add(new Operatoer(11,"Helmut huthut","HeHu","012345-6789","123"));
		operatoer.add(new Operatoer(12,"Peder Person","PePe","111111-2222","123"));
		operatoer.add(new Operatoer(13,"Test Testason","Tete","222222-3333","123"));
		

	}

	
	public int getOprId(String cpr)throws DataException {
		int i = 0;
		while(true){
			try {
				if (operatoer.get(i).cpr.equals(cpr)){
					return operatoer.get(i).oprId;
				}
			}catch(IndexOutOfBoundsException e){
				throw new DataException("Fandt ikke et cpr nr der passsede");
			}
			i++;

		}
		
	}
	public void setOprId(int oprId) {
		this.oprId = oprId;
	}
	public String getOprNavn() {
		return oprNavn;
	}
	public void setOprNavn(String oprNavn) {
		this.oprNavn = oprNavn;
	}
	public String getIni() {
		return ini;
	}
	public void setIni(String ini) {
		this.ini = ini;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpr() {
		return cpr;
	}




}
