import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n1= scn.nextInt();
    int arr1[] = new int[n1];
    
    for(int i=0; i<arr1.length; i++){
        arr1[i] = scn.nextInt();
    }
    
    int n2= scn.nextInt();
    int arr2[] = new int[n2];
    
    for(int i=0; i<arr2.length; i++){
        arr2[i] = scn.nextInt();
    }
    
    String num1 = "";
    String num2 = "";
    
    for(int i=0; i<arr1.length; i++){
        num1 += String.valueOf(arr1[i]);
    }
    
    for(int i=0; i<arr2.length; i++){
        num2 += String.valueOf(arr2[i]);
    }
    
    //System.out.println(num1);
    //System.out.println(num2);
    
    String res = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
    
    //System.out.println(String.valueOf(res).length());
    
    for(int i=0; i<String.valueOf(res).length(); i++){
        System.out.println(res.charAt(i));
    }
    
    
 }

}
