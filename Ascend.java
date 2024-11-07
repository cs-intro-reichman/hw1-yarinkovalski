// Exe 4 - Prints a given number using a hundreds, tens, and units notation.
public class Ascend {
	public static void main(String args[]) 
    { 
        int a, b, c = 0; //the three numbers
        int lim = Integer.parseInt(args[0]); //the limit
        int min, middle, max = 0; //the minimum, maximum, middle number
        a = 0 + (int)(Math.random()*(lim-1)); //random the first number
        b = 0 + (int)(Math.random()*(lim-1)); //random the second number
        c = 0 + (int)(Math.random()*(lim-1)); //random the third number
        min = Math.min(a, b); //calculate the minimum number
        min = Math.min(min, c); //calculate the minimum number
        max = Math.max(a, b); //calculate the maximum number
        max = Math.max(max, c); //calculate the maximum number
        middle = (a+b+c)-min-max; ////calculate the middle number
        System.out.println(a +" , " + b +" , "+ c);
        System.out.println(min +" , " + middle +" , "+ max);
	}
}