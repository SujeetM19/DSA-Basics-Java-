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
    
    for(int i=n; i>0; i--){
        for(int j=1; j<=a[i-1]; j++){
            System.out.print("*\t");
        }
        
        System.out.println();
    }
    
    
    
  }

}
