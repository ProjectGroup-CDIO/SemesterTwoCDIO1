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
	public void setOprId(int currentoprId, int newoprId) throws DataException {
		int i = 0;
		while(true){
			try{
				if(operatoer.get(i).oprId == currentoprId){
					operatoer.get(i).oprId = newoprId;
				}
			}catch(IndexOutOfBoundsException e){
				throw new DataException("Fandt ikke et oprId der passsede");


			}
		}
	}
	public String getOprNavn(int oprId) throws DataException {
		int i = 0;
		while(true){
			try{
				if(operatoer.get(i).oprId == oprId){
					return operatoer.get(i).oprNavn;
				}
			}catch(IndexOutOfBoundsException e){
				throw new DataException("Fandt ikke et oprId der passsede");


			}
		}
	}
	public void setOprNavn(String oprNavn, int oprId) throws DataException {
		int i = 0;
		while(true){
			try{
				if(operatoer.get(i).oprId == oprId){
					operatoer.get(i).oprNavn = oprNavn;
				}
			}catch(IndexOutOfBoundsException e){
				throw new DataException("Fandt ikke et oprId der passsede");


			}
		}
	}
	public String getIni(int oprId) throws DataException {
		int i = 0;
		while(true){
			try{
				if(operatoer.get(i).oprId == oprId){
					return operatoer.get(i).ini;
				}
			}catch(IndexOutOfBoundsException e){
				throw new DataException("Fandt ikke et oprId der passsede");


			}
		}
	}
	public void setIni(String ini, int oprId) throws DataException {
		int i = 0;
		while(true){
			try{
				if(operatoer.get(i).oprId == oprId){
					operatoer.get(i).ini = ini;
				}
			}catch(IndexOutOfBoundsException e){
				throw new DataException("Fandt ikke et oprId der passsede");


			}
		}


	}
	public String getPassword(int oprId) throws DataException {
		int i = 0;
		while(true){
			try{
				if(operatoer.get(i).oprId == oprId){
					return operatoer.get(i).password;
				}
			}catch(IndexOutOfBoundsException e){
				throw new DataException("Fandt ikke et oprId der passsede");


			}
		}

	}
	public void setPassword(String password,int oprId) throws DataException {
		int i = 0;
		while(true){
			try{
				if(operatoer.get(i).oprId == oprId){
					operatoer.get(i).password = password;
				}
			}catch(IndexOutOfBoundsException e){
				throw new DataException("Fandt ikke et oprId der passsede");


			}
		}
	}
	public String getCpr(int oprId) throws DataException {
		int i = 0;
		while(true){
			try{
				if(operatoer.get(i).oprId == oprId){
					return operatoer.get(i).cpr;
				}
			}catch(IndexOutOfBoundsException e){
				throw new DataException("Fandt ikke et oprId der passsede");


			}
		}

	}


}
