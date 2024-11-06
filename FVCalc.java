import java.util.*; 



// Computes the future value of a saving investment.
public class FVCalc 
{
   
	public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in); 
		// Replace this comment with your code
        int currentValue = Integer.parseInt(args[0]);
        int rate = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        double RaseXToY= 0;
        double val = Double.valueOf(rate);
        RaseXToY = Math.pow(val+1, n);
        System.out.println("AAfter " + n + " years, a $" + currentValue+ " saved at " + val+"%25 will yield " + "$"+((int)RaseXToY));
		//AAfter 2 years, a $100 saved at 10.0%25 will yield $121


	}
}