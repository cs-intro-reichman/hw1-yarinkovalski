// Exe1 Splits a restaurant bill evenly among three diners.
public class Bill3 
{

    	public static void main(String[] args) 
    {

	    String Name1 = args[0];  //First name
        String Name2 = args[1];  //Second name
        String Name3 = args[2];	 //Third name
        int bill = Integer.parseInt(args[3]);
        double Division = (double) bill/3; //The bill/3 (3 people)
        Division = Math.ceil(Division); //Round up variables
        System.out.println("Dear "+ Name3 + ", " + Name2+ ", and " + Name1 + ": pay " + Division + " Shekels each");

	
	}
}