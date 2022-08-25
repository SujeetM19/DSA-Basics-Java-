
// Get Subsequence

// 1. You are given a string str.
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
// Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Sample Input
// abc
// Sample Output
// [, c, b, bc, a, ac, ab, abc]




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        ArrayList<String> ans =  gss(str);
        
        System.out.print(ans);
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
            }
        
        char ch = str.charAt(0);
        String sub = str.substring(1);
        
        ArrayList<String> allSub = gss(sub);
        
        ArrayList<String> ans = new ArrayList<String>();
        
        for(String item:allSub){
            ans.add(item);
        }
        
        for(String item:allSub){
            ans.add(ch + item);
        }
        
        return ans;
        
    }

}









