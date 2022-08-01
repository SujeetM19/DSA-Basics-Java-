//matrix multiplication : 
//note :- matrices may or may not be a square matrices, the code will work on all the matrices provided that they must fulfill the critera to be multiplicable


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        
        //input part
        int a = scn.nextInt();
        int m = scn.nextInt();
        int b = scn.nextInt();
        
        int [][] arr1 = new int [a][m];
        int [][] arr2 = new int [m][b];
        int [][] res = new int [a][b];
        
        for(int i=0; i<a; i++){
            for(int j=0; j<m; j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<b; j++){
                arr2[i][j] = scn.nextInt();
            }
        }
        
        //multiplication part
        
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                res[i][j] = 0;
                for(int k=0; k<m; k++){
                    res[i][j] += arr1[i][k]*arr2[k][j];
                }
                
            }
        }
        
        //output part
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(res[i][j] + " ");
            }
        } 
      
        
    }

}