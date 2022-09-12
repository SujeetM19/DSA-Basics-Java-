
// Prefix Evaluation And Conversions

// 1. You are given a prefix expression.
// 2. You are required to evaluate it and print it's value.
// 3. You are required to convert it to infix and print it.
// 4. You are required to convert it to postfix and print it.

// Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.

// Output Format
// value, a number
// infix
// prefix



// Sample Input
// -+2/*6483
// Sample Output
// 2
// ((2+((6*4)/8))-3)
// 264*8/+3-




import java.io.*;
import java.util.*;

public class Main{
    
    public static int value(String exp){
        Stack<Integer> st = new Stack<>();
        for(int i=exp.length() - 1; i>=0; i--){
            char ch = exp.charAt(i);
            if(ch>= '0' && ch<='9'){
                st.push(ch - '0');
            }
            
            else if(ch == '+'){
                int op2 = st.pop();
                int op1 = st.pop();
                st.push(op2 + op1);
            }
            
            else if(ch == '-'){
                int op2 = st.pop();
                int op1 = st.pop();
                st.push(op2 - op1);
            }
            
            else if(ch == '*'){
                int op2 = st.pop();
                int op1 = st.pop();
                st.push(op2 * op1);
            }
            
            else if(ch == '/'){
                int op2 = st.pop();
                int op1 = st.pop();
                st.push(op2 / op1);
            }
        }
        return st.peek();
    }
    
    public static String infix(String exp){
        
        Stack<String> st = new Stack<>();
        for(int i=exp.length() - 1; i>=0; i--){
            char ch = exp.charAt(i);
            if(ch>= '0' && ch<='9'){
                st.push(ch + "");
            }
        
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                    String op2 = st.pop();
                    String op1 = st.pop();
                    st.push("(" + op2 + ch + op1 + ")");
                }
                
        }
            
        return st.peek();
    }
    
    public static String postfix(String exp){
        Stack<String> st = new Stack<>();
        for(int i=exp.length() - 1; i>=0; i--){
            char ch = exp.charAt(i);
            if(ch>= '0' && ch<='9'){
                st.push(ch + "");
            }
        
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                    String op2 = st.pop();
                    String op1 = st.pop();
                    st.push(op2 + op1 + ch);
                }
                
        }
            
        return st.peek();
    }
  

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        System.out.println(value(exp));
        System.out.println(infix(exp));
        System.out.println(postfix(exp));
     }
}









