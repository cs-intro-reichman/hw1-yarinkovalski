// Exe 2 - Computes the future value of a saving investment.
public class FVCalc 
{
   
	public static void main(String[] args)
    {
        int currentValue = Integer.parseInt(args[0]);  //The current value 
        double rate = Double.parseDouble(args[1]);  //The rate
        int n = Integer.parseInt(args[2]);  // The years
        double futureValue= 0; //The fucture value according to the function ('	futureValue')
        double val = Double.valueOf(rate); //make rate from integer to double
        futureValue = currentValue * (Math.pow(((rate/100)+1), n)); //a simple calculate
        System.out.println("After " + n + " years, a $" + currentValue+ " saved at " + val+"% will yield " + "$"+((int)futureValue));
	}
}