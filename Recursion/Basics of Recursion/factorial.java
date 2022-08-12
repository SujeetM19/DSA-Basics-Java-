// Factorial

// 1. You are given a number n.
// 2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A number n
// Output Format
// factorial of n






import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int fact = factorial(n);
            System.out.println(fact);
        
    }

    public static int factorial(int n){
        //expectation
        if(n==1){
            return n;
        }
      
        int fact = n * factorial(n-1);
        //faith
        return fact;
    }

}





