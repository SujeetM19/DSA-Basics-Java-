
// Infix to prefix conversion

// Sample Input
// a*(b-c+d)/e
// Sample Output
// abc-d+*e/



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
    
    public static String prefix(String post){
        String ans2 = "";
        
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    String ans1 = postfix(exp);
    System.out.println(ans1);
    String ans2 = prefix(exp);
    
    System.out.println(ans2);
    
 }
}










