
// Postfix Evaluation And Conversions

// 1. You are given a postfix expression.
// 2. You are required to evaluate it and print it's value.
// 3. You are required to convert it to infix and print it.
// 4. You are required to convert it to prefix and print it.

// Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.

// Output Format
// value, a number
// infix
// prefix


// Sample Input
// 264*8/+3-
// Sample Output
// 2
// ((2+((6*4)/8))-3)
// -+2/*6483



import java.io.*;
import java.util.*;

public class Main{
    
    public static int value(String exp){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<exp.length(); i++){
            int op2;
            int op1;
            char ch = exp.charAt(i);
            if(ch>= '0' && ch <= '9'){
                st.push(ch-'0');
            }
            
            else if(ch=='+'){
                op2 = st.pop();
                op1 = st.pop();
                st.push(op1 + op2);
            }
            
            
            else if(ch=='-'){
                op2 = st.pop();
                op1 = st.pop();
                st.push(op1 - op2);
            }
            
            else if(ch=='*'){
                op2 = st.pop();
                op1 = st.pop();
                st.push(op1 * op2);
            }
            
            else if(ch=='/'){
                op2 = st.pop();
                op1 = st.pop();
                st.push(op1 / op2);
            }
            
        }
        
        return st.peek();
        
    }
    
    
    public static String infix(String exp){
         Stack<String> st = new Stack<>();
        for(int i=0; i<exp.length(); i++){
            String op2;
            String op1;
            char ch = exp.charAt(i);
            if(ch>= '0' && ch <= '9'){
                st.push(ch + "");
            }
            
            else if(ch=='+' || ch=='-' ||ch=='*' ||ch=='/'){
                op2 = st.pop();
                op1 = st.pop();
                st.push("(" + op1 + ch + op2 + ")");
            }
            
        }
        
        return st.peek();
        
    }
    
    public static String prefix(String exp){
        Stack<String> st = new Stack<>();
        for(int i=0; i<exp.length(); i++){
            String op1; 
            String op2;
            char ch = exp.charAt(i);
            if(ch>= '0' && ch <= '9'){
                st.push(ch + "");
            }
            
            else if(ch=='+' || ch=='-' ||ch=='*' ||ch=='/'){
                op2 = st.pop();
                op1 = st.pop();
                st.push(ch + op1 + op2);
            }
        }
        return st.peek();
    }
    
  

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        int value = value(exp);
        System.out.println(value);
        String infix = infix(exp);
        System.out.println(infix);
        String prefix = prefix(exp);
        System.out.println(prefix);  
     }
}










public class postfixEvaluationAndConversion {
    
}
