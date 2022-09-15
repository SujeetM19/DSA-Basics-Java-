


// Normal Stack

// 1. You are required to complete the code of our CustomStack class. The class should mimic the behaviour of java.util.Stack class and implement LIFO semantic.
// 2. Here is the list of functions that you are supposed to complete
//    2.1. push -> Should accept new data if there is space available in the underlying 
//    array or print "Stack overflow" otherwise.
//    2.2. pop -> Should remove and return last data if available or print "Stack 
//    underflow" otherwise and return -1.
//    2.3. top -> Should return last data if available or print "Stack underflow" 
//    otherwise and return -1.
//    2.4. size -> Should return the number of elements available in the stack.
//    2.5. display -> Should print the elements of stack in LIFO manner (space- 
//    separated) ending with a line-break.





// Sample Input
// 5
// push 10
// display
// push 20
// display
// push 30
// display
// push 40
// display
// push 50
// display
// push 60
// display
// top
// pop
// display
// top
// pop
// display
// top
// pop
// display
// top
// pop
// display
// top
// pop
// display
// top
// pop
// quit
// Sample Output
// 10 
// 20 10 
// 30 20 10 
// 40 30 20 10 
// 50 40 30 20 10 
// Stack overflow
// 50 40 30 20 10 




import java.io.*;
import java.util.*;

public class Main {

  public static class CustomStack {
    int[] data;
    int tos;public rays {
        
    }
    

    public CustomStack(int cap) {
      data = new int[cap];
      tos = -1;
    }

    int size() {
      return tos+1;
    }

    void display() {
      for(int i=tos; i>=0; i--){
          System.out.print(data[i] + " ");
      }
      System.out.println();
    }

    void push(int val) {
        
      if(tos>=data.length-1){
              System.out.println("Stack overflow");
       }
       
      else{
         tos++;
         data[tos] = val; 
      }
    }

    int pop() {
      if(tos >= 0){
          int popped = data[tos]; 
          tos--;
          return popped;
      }
      else{
          System.out.println("Stack underflow");
          return -1;
      }
    }

    int top() {
        if(tos>-1){
            return data[tos];
        }
        else{
            System.out.println("Stack underflow");
            return -1;
        }
       
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomStack st = new CustomStack(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      } else if(str.startsWith("display")){
        st.display();
      }
      str = br.readLine();
    }
  }
}





