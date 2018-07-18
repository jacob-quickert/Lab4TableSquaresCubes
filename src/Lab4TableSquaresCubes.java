/*
 * @author Jacob Quickert
 */

//import a  Scanner and a Formatter
//Cheo found the Formatter
import java.util.Formatter;
import java.util.Scanner;

public class Lab4TableSquaresCubes {
	public static void main (String[] args) {
		
		//open the scanner and formatter in the program
		Scanner scan = new Scanner(System.in);
		Formatter fmt;
		Formatter fmt2;
		
		//set up a variable equal to the "true" value for my while loop so it executes once
		String cont = "y";
		
		//a while loop so that the program keeps running as long as the user wants
		while(cont.equalsIgnoreCase("y")){
			
			//prompt user input
			System.out.println("Please enter an integer: ");
			int userNum = scan.nextInt();
			
			//use the formatter to set column titles. set this outside the for loop so i only have one row
			fmt = new Formatter();
			fmt.format("%-8s %-8s %-8s", "Number", "Squared", "Cubed");
			System.out.println(fmt);
			
			//use a for loop to iterate from 1 to the user's number
			for (int i = 1; i <= userNum; i++) {
		      fmt2 = new Formatter();
		      
		      
		      //use the formatter to print origin, squares and cubes columns
		      // the "-" sign creates left justtification
		      fmt2.format("%-8d %-8d %-8d", i, i * i, i * i * i);
		      System.out.println(fmt2);
		      
		      fmt2.close();
		    }
			
			//clean out the scanner ;P
			scan.nextLine();
			
			// prompt the user to continue
			System.out.println("Do you want to continue? (y/n) ");
			cont = scan.nextLine();
			fmt.close();
		}
		
		//close the scanner and formatter
		scan.close();
		
	}
}
