import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] a = new int[n];
    
    for(int i=0; i<n; i++){
        a[i] = scn.nextInt();
        
    }
    
    int d = scn.nextInt();
    int first =0;
    int last = 0;
    int got_first = 0;
    
    for(int i=0; i<n; i++){
        if(a[i] == d && got_first== 0){
            first = i;
            got_first = 1;
        }
        
        if(a[i] == d){
            last = i;
            
        }
    }
    
    System.out.print(first + "\n" + last);
    
 }

}
