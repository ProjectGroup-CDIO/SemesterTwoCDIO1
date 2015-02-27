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

			String brugerId = tastatur.nextLine();
			System.out.println("Indtast password");
			String BrugerPass = tastatur.nextLine();
			if(BrugerPass.equals(funktion.getOperatoer(Integer.parseInt(brugerId)).password)){
				System.out.println("Access granted");


				if(Integer.parseInt(brugerId) < 11){
					funktion.isAdmin(true);
					System.out.println("Admin set succes");
				}else{
					funktion.isAdmin(false);
				}
				String valg;
				
				if(Integer.parseInt(brugerId) > 11){
					int oprId = 11;
					funktion.getOperatoer(oprId);
				}

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
					adminOptions(valg);

				}else{
					System.out.println("Not Admin");
					System.out.println("____________________________________________");
					System.out.println();
					System.out.println("Welcome back, Operatoer! What do you want to do?");
					System.out.println("Showing information for you operator ID: " + brugerId);
					System.out.println("Name: " + funktion.getOperatoer(Integer.parseInt(brugerId)).oprNavn);
					System.out.println("CPR: " + funktion.getOperatoer(Integer.parseInt(brugerId)).cpr);
					System.out.println("Ini: "+ funktion.getOperatoer(Integer.parseInt(brugerId)).ini);
					System.out.println("Password" + funktion.getOperatoer(Integer.parseInt(brugerId)).password);

					System.out.println("These are your options:");
					System.out.println("Change password, press 1");
					System.out.println("Use the weight, press 2");
					valg = tastatur.nextLine();
					oprOptions(valg,brugerId);

				}
			}else{
				System.out.println("Access denied - wrong password");

			}

		}

	}

	private void oprOptions(String valg, String brugerId) throws DALException {
		int id = Integer.parseInt(brugerId);
		switch(valg){
		case "1":
			System.out.println("You wish to change your password, please enter your new password");
			String valg2 = tastatur.nextLine();

			System.out.println("Please enter the oprID for the operator you want to change)");
			String oprId = tastatur.nextLine();
			try{
				funktion.updateOperator(new OperatoerDTO(id, funktion.getOperatoer(id).oprNavn, funktion.getOperatoer(id).ini, funktion.getOperatoer(id).cpr, funktion.getOperatoer(id).password)); 
			}catch(NumberFormatException e){
				System.out.println("You wrote a non valid integer - please write one between 11 - 99");
				oprOptions("1", brugerId);
			}

		case "2":
			System.out.println("To use the weight(note this will be logged):");
			System.out.println("Please enter your tara:");
			String tara = tastatur.nextLine();
			System.out.println("Please enter the netto:");
			String netto = tastatur.nextLine();
			try{
				System.out.println(funktion.weightCalc(Double.parseDouble(netto), Double.parseDouble(tara), brugerId));
			}catch(NumberFormatException e){
				System.out.println("You wrote a non valid double! - please write two correctly!");
				oprOptions("2", brugerId);

			}

		}

	}



	private void adminOptions(String valg) throws DALException {
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
				adminOptions("3");
			}
		case "4":
			System.out.println("Write the ID of the operator which you wish to look at");
			String IdInput = tastatur.nextLine();
			try{
				funktion.getOperatoer(Integer.parseInt(IdInput));
			}catch(NumberFormatException e){
				System.out.println("You wrote a non valid integer - please write one between 11 - 99");
				adminOptions("4");
			}
		case "5":
			System.out.println("Creating is done by following these steps: Write the operatoer's ID nr - between 11-99");
			oprId = tastatur.nextLine();
			System.out.println("Please enter the Name for the operator you want to create.NULL is interpreted as do not change(remember it has to be capital!)");
			name = tastatur.nextLine();
			System.out.println("Please enter the ini for the operator you want to create.NULL is interpreted as do not change(remember it has to be capital!)");
			ini = tastatur.nextLine();
			System.out.println("Please enter the cpr for the operator you want to create.NULL is interpreted as do not change(remember it has to be capital!)");
			cpr = tastatur.nextLine();
			System.out.println("Password is generated by internal programs, please write it down. If you loose it you can retrive it again");
			pass = "NULL";

			try{
				funktion.createOperator(new OperatoerDTO(Integer.parseInt(oprId), name, ini, cpr, pass)); 
			}catch(NumberFormatException e){
				System.out.println("You wrote a non valid integer - please write one between 11 - 99");
				adminOptions("5");
			}

		case "6":
			System.out.println("You are now logged out - please follow the steps to login again");
			ProgramRestart();

		}		
	}

}





