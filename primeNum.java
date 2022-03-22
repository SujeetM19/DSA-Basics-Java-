import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i=2; i<=n;i++){
		    int prime = 1;
		    for(int j=2; j<i; j++){
		        if(i%j==0){
		            prime = 0;
		            break;
		        }
		      }
		      
		      if(prime ==1){
		          System.out.print(i + " ");
		      }
		}
		System.out.print("are the prime numbers from 1 to "+n);
		
		
	}
}
