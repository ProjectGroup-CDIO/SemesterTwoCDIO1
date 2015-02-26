package Data;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class UserCommandLog {
	public static void UpdateLog(String command, int oprId){

		Calendar cal = Calendar.getInstance();
    	cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		    try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("LogFile.txt", true)))) {
			    out.println("BrugerId: " + oprId + "Kommando der er brugt: "+ command  + sdf.format(cal.getTime()));
			}catch (IOException e) {
			    //exception handling left as an exercise for the reader
			
			}
	
		}
		
	}
