//Exe 3 - Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) 
    {
        int number =  Integer.parseInt(args[0]); //the number
        int hundreds = number/100; //the hunderds digit
        number = number%100; // remainder of number from 100 (to find the tens digit)
        int tens = number/10; // the tens digit
        int digits = number%10;  // the number of digits in main number
        System.out.println( hundreds +" hundreds, " + tens + " tens, and " + digits +" ones.");
	}
}