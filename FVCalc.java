import java.util.*; 



// Computes the future value of a saving investment.
public class FVCalc 
{
   
	public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in); 
		// Replace this comment with your code
        int currentValue = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        double futureValue= 0;
        double val = Double.valueOf(rate);
        futureValue = currentValue * (Math.pow(((rate/100)+1), n));
        System.out.println("After " + n + " years, a $" + currentValue+ " saved at " + val+" will yield " + "$"+((int)futureValue));
		//AAfter 2 years, a $100 saved at 10.0%25 will yield $121
		

	}
}