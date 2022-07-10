package Patterns;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n = scn.nextInt();
        int r_plus_one;
        int coln =  0;
        for(int i=0; i<n; i++){
            int first = 1;
            System.out.print(first+"\t");
            
            for(int r = 0; r<coln; r++){
                r_plus_one = first * (i-r)/(r+1);
                first = r_plus_one;
                
                System.out.print(r_plus_one+"\t");
            }
            
            System.out.println("");
            coln++;
        }

    }
}
