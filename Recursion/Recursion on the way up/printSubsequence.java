

// Print Subsequence
// using recursion the way up
// 1. You are given a string str.
// 2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.



// Sample Input
// yvTA

// Sample Output
// yvTA
// yvT
// yvA
// yv
// yTA
// yT
// yA
// y
// vTA
// vT
// vA
// v
// TA
// T
// A





import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        printSS(str, "");
        

    }

    public static void printSS(String str, String ans) {
        
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        // System.out.println(ans);
        
        
        //character -> 
        char ch = str.charAt(0);
        
        //ros
        String ros = str.substring(1);
        
        
        
        //include
        printSS(ros, ans + ch);
        
        //exclude
        
        printSS(ros, ans);
        
    }
    
    //abc -> abc, bc, ac,       , ""

}







