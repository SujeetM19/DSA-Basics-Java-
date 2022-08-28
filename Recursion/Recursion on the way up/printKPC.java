// Print Kpc
// Easy  Prev   Next
// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map
//     0 -> .;
//    1 -> abc
//    2 -> def
//    3 -> ghi
//    4 -> jkl
//    5 -> mno
//    6 -> pqrs
//    7 -> tu
//    8 -> vwx
//    9 -> yz
// 3. Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.
// Use sample input and output to take idea about output.






// Sample Input
// 78
// Sample Output
// tv
// tw
// tx
// uv
// uw
// ux






import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn =  new Scanner(System.in);
        
        String str = scn.nextLine();
        printKPC(str, "");

    }
    
    static String [] arr = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    
    //solved using levels and options style

    public static void printKPC(String str, String asf) {
        
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        int idx = str.charAt(0) - '0';
        
        String options = arr[idx];
        
        String new_str = str.substring(1);
        
        for(int i=0; i<options.length(); i++){
            printKPC(new_str, asf + options.charAt(i));
        }
       
        
    }

}




