// 1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
// 2. You are required to find the saddle price of the given matrix and print the saddle price. 
// 3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
// Input Format
// A number n
// e11
// e12..
// e21
// e22..
// .. n * n number of elements of array a
// Output Format
// Saddle point of the matrix if available or "Invalid input" if no saddle point is there.







import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int [n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int saddle=0;
        int col=0; 
        
        for(int i=0; i<n; i++){
            int min = 100000;
            int max = -10000000;
            for(int j=0; j<n; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    col = j;
                }
            }
            
            for(int j=0; j<n; j++){
                if(arr[j][col]>max){
                    max = arr[j][col];
                }
            }
            
            
            if(min==max){
                System.out.print(min);
                saddle=1;
                
            }
            
            
        }
        
        
        if(saddle==0){
            System.out.print("Invalid input");
        }
        
        
        
       
    }

}