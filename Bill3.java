import java.util.*;  



// Splits a restaurant bill evenly among three diners.
public class Bill3 
{

    	public static void main(String[] args) 
    {

        Scanner sc= new Scanner(System.in); 
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        int bill = Integer.parseInt(args[3]);
        double division = (double) bill/3; //the bill/3 (3 people)
        division = Math.ceil(division); //round up
        System.out.println("Dear "+ name3 + ", " + name2+ ", and " + name1 + ": pay " + division + " Shekels each");
	    // Replace this comment with the rest of your code   
		// Dear a, b, and c: pay 80.0 each.
	
	}
}