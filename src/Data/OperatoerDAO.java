package Data;

import java.util.ArrayList;
import java.util.List;



public class OperatoerDAO implements IOperatoerDAO {

	IOperatoerDTO e = new OperatoerDTO(0, null, null, null, null);
	
	

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

	
	
	private ArrayList<Operatoer> DATAList;
 	public OperatoerDAO(){

		DATAList = new ArrayList<Operatoer>();

		// ADD POEPLE

		DATAList.add(new Operatoer(10,"Lars Larsen","LaLa","123456-7890","123"));
		DATAList.add(new Operatoer(11,"Helmut huthut","HeHu","012345-6789","123"));
		DATAList.add(new Operatoer(12,"Peder Person","PePe","111111-2222","123"));
		DATAList.add(new Operatoer(13,"Test Testason","Tete","222222-3333","123"));


	}

	
	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OperatoerDTO> getOperatoerList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOperatoer(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOperatoer(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub

	}

}
