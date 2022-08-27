

// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map :
//     0 -> .;
//     1 -> abc
//     2 -> def
//     3 -> ghi
//     4 -> jkl
//     5 -> mno
//     6 -> pqrs
//     7 -> tu
//     8 -> vwx
//     9 -> yz
// 3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
// Use sample input and output to take idea about output.



// Sample Input
// 78
// Sample Output
// [tv, tw, tx, uv, uw, ux]





import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);
        
        
    }

    public static ArrayList<String> getKPC(String str) { //56
    
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        String [] arr = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};
        
        ArrayList<String> recievedAl = getKPC(str.substring(1));
        
        char firstChar = str.charAt(0);
        String requiredStr = arr[Character.getNumericValue(firstChar)];
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i=0; i<requiredStr.length();i++){
            for(String element: recievedAl){
                ans.add(requiredStr.charAt(i) + element);
            }
        }
        
        return ans;
        
        
    }

}






