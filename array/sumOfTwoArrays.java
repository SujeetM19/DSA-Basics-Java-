package array;
import java.util.*;


public class sumOfTwoArrays {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int [] a1 = new int[n1];
        for(int i=0; i<n1; i++){
            a1[i] = scn.nextInt();
        }

        // for(int i=0; i<n1; i++){
        //     System.out.print(a1[i]+ " ");
        // }
        

        int n2 = scn.nextInt();
        int [] a2 = new int[n2];
        for(int i=0; i<n2; i++){
            a2[i] = scn.nextInt();
        }

        // for(int i=0; i<n2; i++){
        //     System.out.print(a2[i]+ " ");
        // }

        int max = n1;
        int diff = max-n2;
        if(n2>n1){
            max=n2;
            diff = max-n1;
        }
        // System.out.println(max);
        // System.out.println(diff);


        int [] a3 = new int[max + 1];

        int carry = 0;
        int value = 0;
        int i = a1.length-1;
        int j = a2.length-1;
        int k = a3.length-1;
        int first = a1[i], second = a2[j];
        // System.out.println("first : "+ first);
        // System.out.println("Second : "+ second);

        // System.out.println("Max : " + max);

        while(i>0 || j>0 || carry==1){
            value = 0;
            if(i>=0){
                value += a1[i];
            }
            if(j>=0){
                value += a2[j];
            }
            value += carry;
            
            a3[k] = value%10;
            carry = value/10;


            //System.out.println("i : "+ i + " " + "j : " + j);
            i--;
            j--;
            k--;

        }

        for(i=0; i<a3.length; i++){
            System.out.print(a3[i]+ " ");
        }


        
    }
    
}
