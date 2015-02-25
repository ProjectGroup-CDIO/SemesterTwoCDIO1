package Data;

import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;
import javax.swing.*;

public class testProgram {

	
	String operatoer;
	String sysAdmin;
	
	int oprId;                     
	String oprNavn;                
	String ini;                 
	String cpr;                 
	String password;	
	
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	
	public static String[] choices= {"Admin", "Operator"};
	
	@Test
	public void test() {
		
		OperatoerDTO operatoer = new OperatoerDTO(oprId, oprNavn, ini, cpr, password);
	
		 JFrame frame = new JFrame("Input Dialog Example 3");
		    String inputChoices = (String) JOptionPane.showInputDialog(frame, 
		        "Admin or operator?",
		        "Choose:",
		        JOptionPane.QUESTION_MESSAGE, 
		        null, 	
		        choices, 
		        choices[0]);
		
		if(inputChoices == ){
				System.out.println("Indtast kodeord for Admin");
				scan.nextInt();
				if(input == 1234){
					
				}
		if(inputChoices[0] == true){
				System.out.println("Indtast ID");
				
		}
			}			
	}
}
