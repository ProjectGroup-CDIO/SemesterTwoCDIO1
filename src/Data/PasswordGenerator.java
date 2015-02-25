package Data;
import java.util.Random;

import Data.IOperatoerDAO.DALException;

public class PasswordGenerator extends Funktionalitet {
	public static void main(String[] args) {
		
	Funktionalitet funktion = new Funktionalitet();
	java.util.Scanner tastatur = new java.util.Scanner(System.in);
	
	Random rand = new Random();
	//Here are the values that are in the password
	char[] values1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char[] values2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	char[] values3 = {'1','2','3','4','5','6','7','8','9','0'};
	char[] values4 = {'.','-','_','+','!','?','='};
	char[] mycharArray = new char[6];
	
	//places the values in an array
	//Could have been made with loops, but it would take more codespace
	mycharArray[0]= values1[rand.nextInt(values1.length)];
	mycharArray[1]= values1[rand.nextInt(values1.length)];
	mycharArray[2]= values1[rand.nextInt(values1.length)];
	mycharArray[3]= values2[rand.nextInt(values2.length)];
	mycharArray[4]= values3[rand.nextInt(values3.length)];
	mycharArray[5]= values4[rand.nextInt(values4.length)];
	
	//This part scrambles the position of the values with bogosort
	for (int i = 0; i < mycharArray.length; i++){  
	    int randomPosition = rand.nextInt(mycharArray.length);  
	
	    char temp = mycharArray[i];  
	    mycharArray[i] = mycharArray[randomPosition];  
	    mycharArray[randomPosition] = temp;  
	}
	//print the randomly sorted array
		System.out.println(mycharArray);
		
	
	while(true){
		System.out.println("______________________________________");
		System.out.println();
		System.out.println("Pick admin or operator");
		System.out.println("For admin, enter 10");
		System.out.println("For operator, enter 11");
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
				
				int valg2 = tastatur.nextInt();
				tastatur.nextLine();
				
				if(valg2 == 1){
						System.out.println(funktion.ShowOperators());
				}
				else if(valg == 2){
						
				}
			}
			
		break;
		}

	
	
		}
	}
}


