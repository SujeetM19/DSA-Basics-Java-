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
        
        int s= scn.nextInt();
        int r = scn.nextInt();
        
        
        
        //step1 :- fill 1D  array from 2 D
        int rmin = s-1;
        int rmax = n-s;
        int cmin = s-1;
        int cmax = m-s;
        
        int [] space = new int [2*(rmax - rmin) + 2*(cmax - cmin)];
        int space_index = 0;
         
        
        ///space is our new array that has elements od shell
        
        for(int i=rmin; i<=rmax; i++){
            space[space_index] = arr[i][cmin];
            space_index++;
        }
        cmin ++;
        
        for(int j=cmin; j<=cmax; j++){
            space[space_index] = arr[rmax][j];
            space_index++;
        }
        rmax--;
        
        for(int i=rmax; i>=rmin; i--){
            space[space_index] = arr[i][cmax];
            space_index++;
        }
        cmax--;
        
        for(int j=cmax; j>=cmin; j--){
            space[space_index] = arr[rmin][j];
            space_index++;
        }
        rmin--;
        
        
        
        r = r% space.length;
        
        if(r<0){
            r+= space.length;
        }
        
        
        //rotating the 1D array using reverse function
        
        
        space = reverse(space, 0 , space.length-1);
        
        space = reverse(space, 0 , r-1);
        
        space = reverse(space, r, space.length-1);
        
    //  //put the value again into array
    
        rmin = s-1;
        rmax = n-s;
        cmin = s-1;
        cmax = m-s;
         
        space_index = 0;
         
        for(int i=rmin; i<=rmax; i++){
            arr[i][cmin] = space[space_index] ;
            space_index++;
        }
        cmin ++;
        
        for(int j=cmin; j<=cmax; j++){
            arr[rmax][j] = space[space_index] ;
            space_index++;
        }
        rmax--;
        
        for(int i=rmax; i>=rmin; i--){
             arr[i][cmax] = space[space_index];
            space_index++;
        }
        cmax--;
        
        for(int j=cmax; j>=cmin; j--){
            arr[rmin][j] = space[space_index] ;
            space_index++;
        }
        rmin--;
        
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
        while(left<right){
            temp = space[left];
            space[left] = space[right];
            space[right] = temp;
            
            left++;
            right--;
        }
        
        return space;
    }
    

}