
// Print Encodings

// 1. You are given a string str of digits. (will never start with a 0)
// 2. You are required to encode the str as per following rules
//     1 -> a
//     2 -> b
//     3 -> c
//     ..
//     25 -> y
//     26 -> z
// 3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
// Use the input-output below to get more understanding on what is required
// 123 -> abc, aw, lc
// 993 -> iic
// 013 -> Invalid input. A string starting with 0 will not be passed.
// 103 -> jc
// 303 -> No output possible. But such a string maybe passed. In this case print nothing.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.



// 655196

// Sample Output
// feeaif
// feesf









import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncodings(str, "");
    }

    
    static char [] encode = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v' , 'w', 'x', 'y', 'z'};
    
    static boolean ans_found = false;
    
    public static void printEncodings(String str, String asf) {
        
        if(str.length() == 0 && ans_found == true){
            System.out.println(asf);
            return;
        }
        
        
        
        char firstChar = str.charAt(0);
        
        int charNumber = firstChar - '0';
        
        char alphaNot = encode[charNumber - 1];
        
        // char char_encoded = encode[(firstChar - '0') - 1];
        // System.out.print(char_encoded);
        
        String str_new = str.substring(1);
        printEncodings(str_new, asf + alphaNot);
        
        
        if(str.length() > 1){
            
            String twoChars = str.substring(0,2);
            // System.out.println(twoChars);
            int twoCharNumber = Integer.valueOf(twoChars);
        
            String twoSubstring = str.substring(2);
        
            if(twoCharNumber>=1 && twoCharNumber <= 26){
                printEncodings(twoSubstring, asf + encode[twoCharNumber - 1]);
            }
            
        }
       
        
       
        
    }

}





