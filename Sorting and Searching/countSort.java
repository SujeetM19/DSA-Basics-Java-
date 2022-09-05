
// Count Sort

// 1. You are given an array(arr) of integers.
// 2. You have to sort the given array in increasing order using count sort.



// Sample Input
// 5
// 7 
// -2 
// 4 
// 1 
// 3
// Sample Output
// -2
// 1
// 3
// 4
// 7


import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int [] freq = new int[max - min + 1];
   
   for(int elem_idx=0; elem_idx<arr.length; elem_idx++){
       int freq_idx = arr[elem_idx] - min;
       freq[freq_idx] += 1;
   }
   int sum = 0;
   int [] freq_prefix_sum = new int[max - min + 1];
   
   for(int idx = 0; idx<freq.length; idx++){
       sum += freq[idx];
       freq_prefix_sum[idx] = sum;
   }
   
   
   int [] sorted = new int[arr.length];
   
   for(int i=arr.length-1; i>=0; i--){
       int num = arr[i];
       int sorted_idx = freq_prefix_sum[num - min] - 1;
       sorted[sorted_idx] = arr[i];
       freq_prefix_sum[num - min]--;
       
   }
   
   print(sorted);
   
   
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    // print(arr);
  }

}



