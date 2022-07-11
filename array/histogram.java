import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    
    for(int i=0; i<a.length; i++){
        a[i] = scn.nextInt();
    }
    
    int max = a[0];
    int max_index = 0;
    for(int i=1; i<a.length; i++){
        if(a[i]>max){
            max = a[i];
            max_index = i;
        }
    }
    
    //System.out.print(max);
    //System.out.print(max_index);
    
    for(int i=1; i<=max; i++){  // j=0 -> 6
        
        for(int j=0; j<n; j++){
            if(max-i < a[j]){
                System.out.print("*");
            }
            System.out.print("\t");
        }
    
    System.out.println();
    
    }
    
    
 }

}
