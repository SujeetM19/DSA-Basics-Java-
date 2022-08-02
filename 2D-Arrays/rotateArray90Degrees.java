// 1. You are given a number n, representing the number of rows and number of columns.
// 2. You are given n*n numbers, representing elements of 2d array a.
// 3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
// *Note - you are required to do it in-place i.e. no extra space should be used to achieve it .

// 4
// 11
// 12
// 13
// 14
// 21
// 22
// 23
// 24
// 31
// 32
// 33
// 34
// 41
// 42
// 43
// 44
// Sample Output
// 41 31 21 11
// 42 32 22 12
// 43 33 23 13
// 44 34 24 14





import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        //taking inputs
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
                
            }
            
        }
        
        //take transpose 
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }
        
        
        // improving the transpose to rotate it by 90 degrees
        
        for(int j=0; j<n/2; j++){
            for(int i=0; i<n; i++){
                    temp = arr[i][j];
                    arr[i][j] = arr[i][n-j-1];
                    arr[i][n-j-1] = temp;
            }
        }
        
        display(arr);
        
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}