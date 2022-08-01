// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a spiral.
// Note - Please check the sample output for details

// Sample Input
// 3
// 5
// 11
// 12
// 13
// 14
// 15
// 21
// 22
// 23
// 24
// 25
// 31
// 32
// 33
// 34
// 35
// Sample Output
// 11
// 21
// 31
// 32
// 33
// 34
// 35
// 25
// 15
// 14
// 13
// 12
// 22
// 23
// 24







import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int [n][m];
        int rmin=0;
        int rmax = n-1;
        int cmin =0;
        int cmax =m-1;
        int count = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        while(count<n*m){
            
            for(int i=rmin; i<=rmax && count<n*m; i++){
                System.out.println(arr[i][cmin]);
                count++;
            }
            cmin++;
            
            for(int i=cmin; i<=cmax && count<n*m; i++){
                System.out.println(arr[rmax][i]);
                count++;
            }
            rmax--;
            
            for(int i=rmax; i>=rmin && count<n*m; i--){
                System.out.println(arr[i][cmax]);
                count++;
            }
            cmax--;
            
            for(int i=cmax; i>=cmin && count<n*m; i--){
                System.out.println(arr[rmin][i]);
                count++;
            }
            rmin++;
            

        }
       
        
    }

}