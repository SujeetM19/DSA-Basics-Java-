// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Don't change the signature of power function.

// Note1 -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high.

// Note2 -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
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
        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int n = scn.nextInt();
        
        int ans = power(x,n);
        System.out.print(ans);
    }

    public static int power(int x, int n){
        int ans;
        
        if(n==0){
            return 1;
        }
        
        int xpowb2 = power(x, n/2);
        
        if(n%2==0){
            ans = xpowb2 * xpowb2;
        }
        else{
            ans = xpowb2 * xpowb2 * x;
        }
        
        
        return ans;
    }

}