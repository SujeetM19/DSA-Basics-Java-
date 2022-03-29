import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num;
		System.out.print("Enter the number to calculate sum of its digits : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		int save = num;
		System.out.println(num);
		int rem=0, sum=0; 
		while(num>0){
		    rem = num%10;
		    sum = sum+rem;
		    num = (num-rem)/10;
		}
		System.out.println("The Sum of the digits of the number "+ save +" is " +sum);
	}
}


