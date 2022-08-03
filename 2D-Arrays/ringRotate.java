// You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
// You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

// shell-rotate

// You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
// You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.
// Input Format
// A number n
// A number m
// e11
// e12..
// e21
// e22..
// .. n * m number of elements of array a
// A number s
// A number r






import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int [n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int shellNo = scn.nextInt();
        int rotateNo = scn.nextInt();
        
        
        int [] space = new int [2*n + 2*m - 4*shellNo -4];
        int space_index = 0;
         
        
        
        // System.out.print(shellNo+ " " + rotateNo);
        
        //selecting the second shell ans storing the elements of second shellin another array;
       
        
        // for(int i=0; i<space_index; i++){
        //     System.out.print(space[i] + " ");
        // }
        
        
        ///space is our new array that has elements od shell
        
        for(int i=shellNo-1; i<=n-shellNo; i++){
            space[space_index] = arr[i][shellNo-1];
            space_index++;
        }
        
        for(int j=shellNo; j<=m-shellNo; j++){
            space[space_index] = arr[n-shellNo][j];
            space_index++;
        }
        
        for(int i=n-shellNo-1; i>=shellNo-1; i--){
            space[space_index] = arr[i][m-shellNo];
            space_index++;
        }
        
        for(int j=m-shellNo-1; j>shellNo-1; j--){
            space[space_index] = arr[shellNo-1][j];
            space_index++;
        }
        
        
        //shufflling in space
        
        int left = 0;
        int right = space.length - rotateNo - 1;
        int end = space.length - 1;
        
        
        // for(int i=0; i<space_index; i++){
        //     System.out.print(space[i] + " ");
        // }
        
        //  System.out.println();
         
        
        space = reverse(space, left, right);
        
        
        // for(int i=0; i<space_index; i++){
        //     System.out.print(space[i] + " ");
        // }
        
        // System.out.println();
        
        space = reverse(space, right + 1, end);
        
        // for(int i=0; i<space_index; i++){
        //     System.out.print(space[i] + " ");
        // }
        
        // System.out.println();
        
        space = reverse(space, left, end);
        
        
            
        // for(int i=0; i<space_index; i++){
        //     System.out.print(space[i] + " ");
        // }
        
        space_index =0;
        
        
        
        //put the value again into array
         
        for(int i=shellNo-1; i<=n-shellNo; i++){
             arr[i][shellNo-1] = space[space_index];
             space_index++;
        }
        
        for(int j=shellNo; j<=m-shellNo; j++){
            arr[n-shellNo][j] = space[space_index];
            space_index++;
        }
        
        for(int i=n-shellNo-1; i>=shellNo-1; i--){
             arr[i][m-shellNo] = space[space_index];
            space_index++;
        }
        
        for(int j=m-shellNo-1; j>shellNo-1; j--){
            arr[shellNo-1][j] = space[space_index];
            space_index++;
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
    
    public static int[] reverse(int[] space, int left, int right){
        
        int temp;
        for(int i=left; i<=(left+right)/2; i++){
            temp = space[i];
            space[i] = space[left + right-i];
            space[left + right - i] = temp;
            
        }
        
        return space;
    }
    
    
    
    
    
    
    

}