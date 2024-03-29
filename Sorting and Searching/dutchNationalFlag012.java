// Sort an array consisting of 0, 1, 2
//in O(n) using dutch national flag sorting algorithm


import java.io.*;
import java.util.*;

public class Main {

  public static void sort012(int[] arr){
    //write your code here
    int i=0, j=0, k=0;
    
    for(int idx=0; idx<arr.length; idx++){
        if(arr[idx]==0){
            swap(arr, i, idx);
            swap(arr, j, idx);
            i++;
            j++;
            k++;
        }
        
        else if(arr[idx]==1){
            swap(arr, j, idx);
            j++;
            k++;
        }
        
        else if(arr[idx]==2){
            k++;
        }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort012(arr);
    print(arr);
  }

}







