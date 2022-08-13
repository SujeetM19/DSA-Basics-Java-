

// Power-linear
// Easy  Prev   Next
// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Don't change the signature of power function .

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A number x
// A number n
// Output Format
// x raised to the power n





import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn  = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        
        if(n==0){
            System.out.println("1");
            return;
        }
        
        int res = power(x,n);
        System.out.println(res);
    }

    public static int power(int x, int n){
        
        if(n==1){
            return x;
        }
        
        int res = x * power(x, n-1);
        return res;
    }

}





