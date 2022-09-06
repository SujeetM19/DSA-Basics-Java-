
// radix sort 
// couldnt get it correct but will update the correct code



import java.io.*;
import java.util.*;

public class Main {

  public static void radixSort(int[] arr) {
     int [] sorted = new int[arr.length];
    // write code here    
    int max = Integer.MIN_VALUE;
    
    for(int val: arr){
        if(val>max){
            max = val;
        }
    }
    
    int expo = 1;
    while(max > expo){
        sorted = countSort(arr, expo);
        expo*=10;
    }
    
    print(sorted);
    
  }

  public static int [] countSort(int[] arr, int exp) {
    // write code here
    int[] freq = new int[10];
    
    for(int i=0; i<arr.length; i++){
        int idx = arr[i];
        freq[idx] += 1;
    }
    
    // print(freq);
    
    
    int sum =0;
    int[] freq_sum = new int[10];
    
    for(int i=0; i<freq.length; i++){
        sum += freq[i];
        freq_sum[i] = sum;
    }
    
    // print(freq_sum);
    
    int [] sorted = new int[arr.length];
    for(int i= arr.length - 1; i>=0; i--){
        int val = arr[i];
        int pos = freq_sum[val];
        sorted[pos - 1] = val;
        freq_sum[val]--;
    }
    
    System.out.print("After sorting on " + exp + " place -> ");
    print(sorted);
    
    return sorted;
    
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    // print(arr);
  }

}









