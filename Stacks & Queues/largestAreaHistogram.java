

// Largest Area Histogram

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing the height of bars in a bar chart.
// 3. You are required to find and print the area of largest rectangle in the histogram.

// e.g.
// for the array [6 2 5 4 5 1 6] -> 12

// Sample Input
// 7
// 6
// 2
// 5
// 4
// 5
// 1
// 6
// Sample Output
// 12




import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int [] left = nextSmallerLeft(a);
    int [] right = nextSmallerRight(a);
    
    // for(int i=0; i<left.length; i++){
    //     System.out.print(left[i] + " ");
    // }
    
    // System.out.println();
    
    // for(int i=0; i<right.length; i++){
    //     System.out.print(right[i] + " ");
    // }
    
    // System.out.println();
    
    int max = Integer.MIN_VALUE;
    int area = 0;
    
    for(int i=0; i<a.length; i++){
        area = (right[i] - left[i] - 1) * a[i];
        if(area > max){
            max = area;
        }
    }
    System.out.println(area);
    
 }
 
 
 public static int [] nextSmallerLeft(int[] arr){
     Stack<Integer> st = new Stack<>();
     
     int [] ans = new int[arr.length];
    
     for(int i=0; i<arr.length; i++){
         
         while(st.size() > 0 && arr[st.peek()] > arr[i]){
             st.pop();
         }
         
         if(st.size() == 0){
             ans[i] = -1;
         }
         else{
             ans[i] = st.peek();
         }
         
         st.push(i);
     }
     
     return ans;
 }
 
 
 
  public static int [] nextSmallerRight(int[] arr){
     Stack<Integer> st = new Stack<>();
     
     int [] ans = new int[arr.length];
     
     for(int i=arr.length - 1; i>=0; i--){
         
         while(st.size() > 0 && arr[st.peek()] > arr[i]){
             st.pop();
         }
         
         if(st.size() == 0){
             ans[i] = arr.length;
         }
         else{
             ans[i] = st.peek();
         }
         
         st.push(i);
     }
     
     return ans;
 }
 
 
 
}



