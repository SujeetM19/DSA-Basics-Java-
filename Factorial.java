import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fact=1;
		for(int i=1; i<=num;i++){
		    fact=fact*i;
		}
		System.out.println(fact);
		
	}
}

