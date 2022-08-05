// 1. You are given a number n, representing the number of rows and columns of a square matrix.
// 2. You are given n * n numbers, representing elements of 2d array a. 
// Note - Each row and column is sorted in increasing order.
// 3. You are given a number x.
// 4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
// 5. In case element is not found, print "Not Found".






import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        int [][] arr = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int num = scn.nextInt();
        boolean found = false;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == num){
                    System.out.println(i);
                    System.out.println(j);
                    found = true;
                }
            }
        }
        
        if(found==false){
            System.out.print("Not Found");
        }
        

    }

}