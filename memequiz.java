package memequiz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quizhome {
	public static void main (String [] args) throws IOException {
	 run();
	}//end main
	
	 public static void run() throws IOException {
		 questionone();
	 }
	 
	 public static void questionone () {
		 BufferedReader readRacer = new BufferedReader (new InputStreamReader (System.in));
	     System.out.println("Q1: Do you like animals? (y/n)");
	     String usernumber = null;
	     usernumber = readRacer.readLine();
	    
	   
		
	 }//end question one
}//end class
