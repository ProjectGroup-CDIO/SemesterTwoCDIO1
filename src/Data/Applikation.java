package Data;
import java.io.ObjectInputStream.GetField;

import Data.IOperatoerDAO.DALException;

import java.util.Scanner;
/*
 * This is the runable applikation
 * From here we will build up the applikation so that the entire project works
 * Here we are to create the UI and get userinputs
 * Userinputs are used in the IFunk and through this send through the system
 * 
 */
public class Applikation extends Funktionalitet  {

	IFunktionalitet funktion = new Funktionalitet();
	Scanner tastatur = new java.util.Scanner(System.in);
	UserCommandLog UpdateData = new UserCommandLog();

	public void App() throws DALException {
		System.out.println("______________________________________");
		System.out.println();
		System.out.println("Indtast bruger ID og derefter password");
		System.out.println("");
		System.out.println("Exit program, enter 20");

		ProgramRestart();
	}



	private void ProgramRestart() throws DALException{
		System.out.println("Indtast bruger ID");
		while(tastatur.hasNext()){

			String BrugerId = tastatur.nextLine();
			System.out.println("Indtast password");
			String BrugerPass = tastatur.nextLine();
			if(BrugerPass.equals(funktion.getOperatoer(Integer.parseInt(BrugerId)).password)){
				System.out.println("Acces Granted");
				System.out.println("Mulgiheder: 1,2,3,4,5");
				System.out.println("skrive 1,2,3,4 eller 5");


				if(Integer.parseInt(BrugerId) < 11){
					funktion.isAdmin(true);
					System.out.println("Admin set succes");
				}else{
					funktion.isAdmin(false);
				}
				String valg  = tastatur.nextLine();

				if(funktion.adminState()){
					//logged in as admin.

					System.out.println("________________________________________");
					System.out.println(" Welcome back, admin! What do you want to do");
					System.out.println("List of operators, press 1");
					System.out.println("Delete operator, press 2");
					System.out.println("Update operator, press 3");
					System.out.println("Show operator, press 4");
					System.out.println("Create operator, press 5");
					System.out.println("Logout, press 6");
					valg = tastatur.nextLine();
					keyboardOutput(valg);

				}else{
					//Not admin	
				}


			}else{
				System.out.println("Acces denied - wrong password");
			}
			/*


			if(valg.equals("10")){
				System.out.println("Enter password.");
				valg = tastatur.nextLine();
				if(valg.equals(funktion.getOperatoer(10).password)){

					funktion.isAdmin();
					System.out.println("____________________________________________");
					System.out.println();
					System.out.println("Welcome back, admin! What do you want to do?");
					System.out.println();
					System.out.println("List of operators, press 1");
					System.out.println("Delete operator(s), press 2");
					System.out.println("Update operator, press 3");
					System.out.println("Show operatoer, press 4");
					System.out.println();
					System.out.println("Logout, press 5");
					valg = tastatur.nextLine();		
				}
				else{
					System.out.println("Wrong password, try again.");
				}
				if(valg.equals("1")){
					System.out.println(funktion.ShowOperators());
				}
				else if(valg.equals("2")){
					System.out.println("Please enter the oprID for the operator you want to delete.");
					funktion.deleteOperator(funktion.getOperatoer(Integer.parseInt(valg)));
				}
				else if(valg.equals("3")){
					System.out.println("Please enter the oprID for the operator you want to update.");
					funktion.updateOperator(funktion.getOperatoer(Integer.parseInt(valg)));
				}
				else if(valg.equals("4")){
					System.out.println("Vælg operatoerId");
					valg = tastatur.nextLine();
					int ID = Integer.parseInt(valg);
					System.out.println("____________________________________________");
					System.out.println();
					System.out.println("Welcome back, admin! What do you want to do?");
					System.out.println();
					System.out.println("Showing information for " + funktion.getOperatoer(ID));
					System.out.println("Press 1 for Name");
					System.out.println("Press 2 for initials");
					System.out.println("Press 3 for social number");
					System.out.println("Press 4 for password");
					valg = tastatur.nextLine();
					if(valg.equals("1")){
						System.out.println(funktion.getOperatoer(ID).oprNavn);
					}
					if(valg.equals("2")){
						System.out.println(funktion.getOperatoer(ID).ini);
					}
					if(valg.equals("3")){
						System.out.println(funktion.getOperatoer(ID).cpr);
					}
					if(valg.equals("4")){
						System.out.println(funktion.getOperatoer(ID).password);
					}
				}
				else if(valg.equals("5")){
					System.out.println("Goodbye admin.");
				}


			}
			 */
		}

	}
	private void keyboardOutput(String valg) throws DALException {
		switch(valg){

		case "1":
			System.out.println(funktion.ShowOperators());
		case "2":
			System.out.println("Write ID of person to be deleted");
			String valg2 = tastatur.nextLine();
			funktion.deleteOperator(funktion.getOperatoer(Integer.parseInt(valg2)));
		case "3":
			System.out.println("Please enter the oprID for the operator you want to change)");
			String oprId = tastatur.nextLine();
			System.out.println("Please enter the Name for the operator you want to update.NULL is interpreted as do not change(remember it has to be capital!)");
			String name = tastatur.nextLine();
			System.out.println("Please enter the ini for the operator you want to update.NULL is interpreted as do not change(remember it has to be capital!)");
			String ini = tastatur.nextLine();
			System.out.println("Please enter the cpr for the operator you want to update.NULL is interpreted as do not change(remember it has to be capital!)");
			String cpr = tastatur.nextLine();
			System.out.println("Please enter the password for the operator you want to update.NULL is interpreted as do not change(remember it has to be capital!)");
			String pass = tastatur.nextLine();

			try{
				funktion.updateOperator(new OperatoerDTO(Integer.parseInt(oprId), name, ini, cpr, pass)); 
			}catch(NumberFormatException e){
				System.out.println("You wrote a non valid integer - please write one between 11 - 99");
				keyboardOutput("3");
			}
		case "4":
			System.out.println("Write the ID of the operator which you wish to look at");
			String IdInput = tastatur.nextLine();
			try{
				funktion.getOperatoer(Integer.parseInt(IdInput));
			}catch(NumberFormatException e){
				System.out.println("You wrote a non valid integer - please write one between 11 - 99");
				keyboardOutput("4");
			}
		case "5":
			System.out.println("Creating is done by following these steps: Write the operatoer's ID nr - between 11-99");
			oprId = tastatur.nextLine();
			System.out.println("Please enter the Name for the operator you want to update.NULL is interpreted as do not change(remember it has to be capital!)");
			name = tastatur.nextLine();
			System.out.println("Please enter the ini for the operator you want to update.NULL is interpreted as do not change(remember it has to be capital!)");
			ini = tastatur.nextLine();
			System.out.println("Please enter the cpr for the operator you want to update.NULL is interpreted as do not change(remember it has to be capital!)");
			cpr = tastatur.nextLine();
			System.out.println("Please enter the password for the operator you want to update.NULL is interpreted as do not change(remember it has to be capital!)");
			pass = tastatur.nextLine();

			try{
				funktion.createOperator(new OperatoerDTO(Integer.parseInt(oprId), name, ini, cpr, pass)); 
			}catch(NumberFormatException e){
				System.out.println("You wrote a non valid integer - please write one between 11 - 99");
				keyboardOutput("5");
			}

		case "6":

		}		
	}

}




