
// Merge Two Sorted Arrays

// 1. You are given two sorted arrays(a,b) of integers.
// 2. You have to merge them and form one sorted array.
// 3. You have to do it in linear time complexity.


// Sample Input
// 4
// -2 
// 5 
// 9 
// 11
// 3
// 4 
// 6 
// 8
// Sample Output
// -2
// 4
// 5
// 6
// 8
// 9
// 11





import java.io.*;
import java.util.*;

public class Main {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int [] sorted = new int[a.length + b.length]; 
    int a_idx = 0;
    int b_idx = 0;
    int sorted_idx = 0;
    
        while(a_idx <= a.length - 1 && b_idx <= b.length - 1){
        
                
                if(a[a_idx] < b[b_idx]){
                    sorted[sorted_idx] = a[a_idx];
                    a_idx++;
                    sorted_idx++;
                }
                else{
                    sorted[sorted_idx] = b[b_idx];
                    b_idx++;
                    sorted_idx++;
                }
                
            } 
            
            while(a_idx<a.length){
                sorted[sorted_idx] = a[a_idx];
                a_idx++;
                sorted_idx++;
            }
                
            while(b_idx<b.length){
                sorted[sorted_idx] = b[b_idx];
                b_idx++;
                sorted_idx++;
            }
        return sorted;
    }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}










