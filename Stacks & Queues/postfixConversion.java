
// Infix Conversions

// 1. You are given an infix expression.
// 2. You are required to convert it to postfix and print it.
// 3. You are required to convert it to prefix and print it.


// Output Format
// postfix
// prefix



// Sample Input
// a*(b-c+d)/e
// Sample Output
// abc-d+*e/
// /*a+-bcde






import java.io.*;
import java.util.*;

public class Main{
    
    public static int precedence(char ch){
        if(ch == '*'|| ch== '/'){
            return 2;
        }
        else if(ch == '+'|| ch== '-'){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    
    public static String prefix_operation(String op1, String op2, String opn){
        return opn + op1 + op2;
    }
    
    
    public static String postfix(String exp){
        
            Stack<Character> st1 = new Stack<>();
            Stack<Character> st2 = new Stack<>();
            String ans1 = "";
            for(int i=0; i<exp.length(); i++){
                
                // System.out.println(st1);
                // System.out.println(st2);
                
                char ch = exp.charAt(i);
                if(ch == '('){
                    st2.push(ch);
                }
                
                else if(ch>='a' && ch<='z'){
                    st1.push(ch);
                    ans1 += ch;
                }
                else if(ch=='+' || ch=='-' || ch=='/' || ch=='*'){
                    while(st2.size()>0 && precedence(st2.peek())>=precedence(ch)){
                        char opn_popped = st2.pop();
                        st1.push(opn_popped);
                        ans1 += opn_popped;
                    }
                    st2.push(ch);
                }
                
                else if(ch == ')'){
                    while(st2.peek() != '('){
                        char opn_popped = st2.pop();
                        st1.push(opn_popped);
                        ans1+=opn_popped;
                    }
                    st2.pop();
                }
                
            }
            
            while(st2.size() != 0){
                char opn_left = st2.pop();
                st1.push(opn_left);
                ans1+= opn_left;
            }
            
            // System.out.println(st1);
            // System.out.println(ans1);
            
            return ans1;   
    }
    
    public static String prefix(String exp){
        String ans2;
        Stack<String> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        for(int i=0; i<exp.length(); i++){
            // System.out.println(st1);
            // System.out.println(st2);
            
            char ch = exp.charAt(i);
            
            if(ch >= 'a' && ch<='z'){
                st1.push(ch + "");
            }
            
            else if(ch == '('){
                st2.push(ch);
            }
            
            else if(ch == '+'|| ch == '-'|| ch == '*'|| ch == '/'){
                while(st2.size() >0 && precedence(st2.peek()) >=  precedence(ch)){
                    String opn = st2.pop() + "";
                    String op2 = st1.pop() + "";
                    String op1 = st1.pop() + "";
                    String prefix = prefix_operation(op1, op2, opn);
                    st1.push(prefix);
                }
                st2.push(ch);
            }
            
            else if(ch == ')'){
                while(st2.peek() != '('){
                    String opn = st2.pop() + "";
                    String op2 = st1.pop()+ "";
                    String op1 = st1.pop() + "";
                    String prefix = prefix_operation(op1, op2, opn);
                    st1.push(prefix);
                }
                st2.pop();
            }
           
        }
        
        while(st2.size() >0){
            String opn = st2.pop() + "";
            String op2 = st1.pop() + "";
            String op1 = st1.pop() + "";
            String prefix = prefix_operation(op1, op2, opn);
            st1.push(prefix);
        }
        
        ans2 = st1.pop();
        return ans2;
        
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    String ans1 = postfix(exp);
    System.out.println(ans1);
    System.out.println(prefix(exp));
    
    // System.out.println(ans2);
    
 }
}





