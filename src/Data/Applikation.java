package Data;
import Data.IOperatoerDAO.DALException;

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

		Funktionalitet funktion = new Funktionalitet();
		java.util.Scanner tastatur = new java.util.Scanner(System.in);
		
		
		
		while(true){
			System.out.println("______________________________________");
			System.out.println();
			System.out.println("Pick admin or operator");
			System.out.println("For admin, enter 10");
			System.out.println("For operator, enter 11");
			System.out.println();
			System.out.println("Exit program, enter 20");
			int valg = tastatur.nextInt();	
			tastatur.nextLine();
			
			if(valg == 10){
				System.out.println("Enter password.");
				int password = tastatur.nextInt();
				if(password == 1234){
					funktion.adminLogin = true;
					System.out.println("____________________________");
					System.out.println();
					System.out.println("Welcome back, admin! What do you want to do?");
					System.out.println();
					System.out.println("List of operators, press 1");
					System.out.println("Delete operator(s), press 2");
					System.out.println("Update operator, press 3");
					System.out.println();
					System.out.println("Logout, press 4");
//					int valg2 = tastatur.nextInt();
//					tastatur.nextLine();
				}
					else if(password != 1234){
						funktion.adminLogin = false;
						System.out.println("Password was wrong!");
					}
					
					if(valg == 1){
							System.out.println(funktion.OPdata.getOperatoerList());
					}
					else if(valg == 2){
							//Implement deletion of operators
					}
					else if(valg == 3){
							//Implement update operator(s)
					}
					else if(valg == 4){
						funktion.adminLogin = false;
						System.exit(0);
					}
				}
			}


	}

}
