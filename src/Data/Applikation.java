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

	public static void main(String[] args) throws DALException {
		// TODO Auto-generated method stub

		IFunktionalitet funktion = new Funktionalitet();
		Scanner tastatur = new java.util.Scanner(System.in);


		System.out.println("______________________________________");
		System.out.println();
		System.out.println("Pick admin or operator");
		System.out.println("For admin, enter 10");
		System.out.println("For operator, enter 11");
		System.out.println();
		System.out.println("Exit program, enter 20");

		while(tastatur.hasNext()){

			String valg = tastatur.nextLine();

			if(valg.equals("10")){
				System.out.println("Enter password.");
				valg = tastatur.nextLine();
				if(valg.equals("02324it")){
					funktion.isAdmin();
					System.out.println("____________________________________________");
					System.out.println();
					System.out.println("Welcome back, admin! What do you want to do?");
					System.out.println();
					System.out.println("List of operators, press 1");
					System.out.println("Delete operator(s), press 2");
					System.out.println("Update operator, press 3");
					System.out.println("Show operatoer, press 4");
					System.out.println("Create Operator, press 5");
					System.out.println("Logout, press 6");
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
					if(valg.equals("5")){
						System.out.println(funktion.getOperatoer(ID).);
					}
				}
					else if(valg.equals("5")){
					System.out.println("Goodbye admin.");
				}


			}
		}
	}
}



