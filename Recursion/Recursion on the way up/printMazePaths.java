

// Print Maze Paths

// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
// 3. Complete the body of pri tMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.



// Sample Input
// 2
// 2
// Sample Output
// hv
// vh






import java.io.*;
import java.util.*;

public class Main {

	    public static void main(String[] args) throws Exception {

            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            
            printMazePaths(1,1,n,m, "");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        
	        if(sr>dr || sc>dc){
	            return;
	        }
	        
	        if(sr==dr && sc==dc){
	            System.out.println(psf);
	            return;
	        }
	        
	       // System.out.println(psf);
	        
	        
	        printMazePaths(sr, sc+1, dr, dc, psf + "h");
	        
	        printMazePaths(sr+1, sc, dr, dc, psf + "v");
	        
	        
	    }

	}






 