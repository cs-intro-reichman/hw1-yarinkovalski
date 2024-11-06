import java.util.*; 



// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in); 
        int number =  Integer.parseInt(args[0]);
        int hundreds = number/100;
        number = number%100;
        int tens = number/10;
        int digits = number%10;
        System.out.println( hundreds +" hundreds, " + tens + " tens, and " + digits +" ones.");
	    // Replace this comment with your code
		//1 hundreds, 2 tens, and 3 ones.
	}
}