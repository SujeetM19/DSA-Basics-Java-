
// Infix Evaluation

// 1. You are given an infix expression.
// 2. You are required to evaluate and print it's value.


// Sample Input
// 2 + 6 * 4 / 8 - 3
// Sample Output
// 2






import java.io.*;
import java.util.*;

public class Main{
    
    public static int solve(int op1, int op2, char opn){
        if(opn == '+'){
            return op2+op1;
        }
        else if(opn == '-'){
            return op2-op1;
        }
        else if(opn == '*'){
            return op2*op1;
        }
        else{
            return op2/op1;
        }
    }
    
    public static int precedence(char opn){
        if(opn == '+' || opn == '-'){
            return 1;
        }
        if(opn == '*' || opn == '/'){
            return 2;
        }
        else{
             return 0;
        }
      
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Stack<Integer> st1 = new Stack<>();
    Stack<Character> st2 = new Stack<>();
    // System.out.println(exp);
    

    for(int i=0; i<exp.length(); i++){
        
        // System.out.println(st1);
        
        // System.out.println(st2);
        
        char ch =exp.charAt(i);
        if(ch>='0' && ch<='9'){
            st1.push(ch-'0'); 
        }
        
        else if(ch=='('){
            st2.push('(');
        }
        
        else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            while(st2.size() > 0 && precedence(st2.peek()) >= precedence(ch)){
                char opn = st2.pop();
                int op2 = st1.pop();
                int op1 = st1.pop();
                int res = solve(op2, op1, opn);
                st1.push(res);
            }
            st2.push(ch);
        }
        else if(ch == ')'){
            while(st2.peek() !='('){
                char opn = st2.pop();
                int op2 = st1.pop();
                int op1 = st1.pop();
                int res = solve(op2, op1, opn);
                st1.push(res);
            }
            st2.pop();
            
        }
        
    }
    
    while(st2.size() != 0){
            char opn = st2.pop();
            int op2 = st1.pop();
            int op1 = st1.pop();
            int res = solve(op2, op1, opn);
            st1.push(res);
        }
        System.out.println(st1.peek());
    
    
 }
 
}









