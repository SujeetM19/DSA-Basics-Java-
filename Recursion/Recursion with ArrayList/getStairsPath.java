



// Get Stair Paths
// Easy  Prev   Next
// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


// Sample Input
// 3
// Sample Output
// [111, 12, 21, 3]







import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        ArrayList ans = getStairPaths(n);
        System.out.print(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }else if(n<0){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        
        // faith 1
        ArrayList<String> paths1  = getStairPaths(n-1);
        
        //faith 2
        ArrayList<String> paths2  = getStairPaths(n-2);
        
        //faith 3
        ArrayList<String> paths3  = getStairPaths(n-3);
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(String path:paths1){
            ans.add(1 + path);
        }
        
        for(String path:paths2){
            ans.add(2 + path);
        }
        
        for(String path:paths3){
            ans.add(3 + path);
        }
        
        return ans;
    }

}










