
// Print Increasing
// Easy  Prev   Next
// 1. You are given a positive number n. 
// 2. You are required to print the counting from 1 to n.
// 3. You are required to not use any loops. Complete the body of print Increasing function to achieve it. Don't change the signature of the function.




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }
    
    public static void printIncreasing(int n){

	  //base code
        if(n==0){
            return;
        }

	  //faith
        printIncreasing(n-1);

	  //my work
        System.out.println(n);
    }

}



