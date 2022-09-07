// Balanced Brackets

// 1. You are given a string exp representing an expression.
// 2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

// e.g.
// [(a + b) + {(c + d) * (e / f)}] -> true
// [(a + b) + {(c + d) * (e / f)]} -> false
// [(a + b) + {(c + d) * (e / f)} -> false
// ([(a + b) + {(c + d) * (e / f)}] -> false


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        // System.out.println(exp);
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<exp.length(); i++){
            
            // System.out.println(st);
            if(exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '['){   
                st.push(exp.charAt(i));   
                
                // System.out.println(st);
                
            }
            
            
            else if(exp.charAt(i) == ')'){
                
                if(st.size() == 0){ //less opening brackets
                    System.out.println("false");
                    return;
                }
                
                if(st.peek() != '('){
                    System.out.println("false");
                    return;
                }
                
                st.pop();
            }
            
            
            else if(exp.charAt(i) == '}'){
                if(st.size() == 0){ //less opening brackets
                    System.out.println("false");
                    return;
                }
                
                if(st.peek() != '{'){ //not same bracket
                    System.out.println("false");
                    return;
                }
                
                st.pop(); //bracket matched and removed
            }
            
            else if(exp.charAt(i) == ']'){
                if(st.size() == 0){ //less opening brackets
                    System.out.println("false");
                    return;
                }
                
                if(st.peek() != '['){
                    System.out.println("false");
                    return;
                }
                
                st.pop();
            }
            
         }
         
         
            
        if(st.size() != 0){ //more opening brackets
            System.out.println("false");
            return;
        }
            
            
        System.out.println("true");
        
    
}
}








