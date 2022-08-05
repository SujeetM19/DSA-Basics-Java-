// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. Rotate the array a, k times to the right (for positive values of k), and to
// the left for negative values of k.






public class rotateArray {
    
}



import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
      
    k = k% a.length;
    
    if(k<0){
        k+= a.length;
    }
    // write your code here
    int start = 0;
    int end = a.length -1;
    
    a = reverse(a, start, end);
    a = reverse(a, start, k-1);
    a = reverse(a, k, end);
    display(a);
    
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
 }
 
 
 
 public static int[] reverse(int [] a, int left,int right){
     int temp;
     
     while(left<right){
         temp = a[left];
         a[left] = a[right];
         a[right] = temp;
         
         left++;
         right--;
         
     }
     
     return a;
 }

}