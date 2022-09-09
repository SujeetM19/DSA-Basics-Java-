
// Sliding window using arrays :-


// Sliding Window Maximum
// Hard  Prev   Next
// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing the elements of array a.
// 3. You are given a number k, representing the size of window.
// 4. You are required to find and print the maximum element in every window of size k.

// e.g.
// for the array [2 9 3 8 1 7 12 6 14 4 32 0 7 19 8 12 6] and k = 4, the answer is [9 9 8 12 12 14 14 32 32 32 32 19 19 19]




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
    int k = Integer.parseInt(br.readLine());

    // code
    int [] ans = new int[a.length - k + 1];
    //sliding window using arrays n2
    
    // System.out.println(ans.length);
    
    for(int i=0; i<n-k+1; i++){
        int max = a[i];
        for(int j=i; j<i+k; j++){
            if(a[j]>max){
                max = a[j];
            }
        }
        ans[i] = max;
    }
    
    
    
    for(int i=0; i<ans.length; i++){
        System.out.println(ans[i]);
    }
    
 }
}




