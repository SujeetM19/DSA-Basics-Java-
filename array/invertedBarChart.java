import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn =  new Scanner(System.in);
    int n = scn.nextInt();
    int [] a  = new int[n];
    
    for(int i=0; i<n; i++){
        a[i] = scn.nextInt();
    }
    
    int max = a[0];
    int max_index = 0;
    
    for(int i=0; i<n; i++){
        if(a[i]> max){
            max = a[i];
            max_index = i;
        }
    }
    
    for(int i=1; i<=max; i++){
        
        for(int j = 0; j<n; j++){
            if(i <= a[j]){
                System.out.print("*");
            }
            System.out.print("\t");
        
        }
        
        
        System.out.print("\n");
    
     }

}


}
