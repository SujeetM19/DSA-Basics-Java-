import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int nsp1=n/2; int nsp2=-1;
     
     
     for(int i=1; i<=n; i++){
        
        for(int j=1; j<=nsp1; j++){
            
                System.out.print("\t");
        }
        
        System.out.print("*\t");
        
        for(int j=1; j<=nsp2; j++){
            
                System.out.print("\t");
        } 
        
        if(i!=1 && i!=n){
            System.out.print("*\t");
        }
        
        System.out.println("");
         
         if(i<=n/2){
             nsp1--;
             nsp2+=2;
             
         }
         else{
             nsp1++;
             nsp2-=2;
         }
     
     }
     

 }
}
