
// Minimum Stack - I

// 1. You are required to complete the code of our MinStack class. 
// 2. As data members you've two stacks available in the class - one for data values and another for minimum values. (This is cryptic - take hint from video)
// 2. Here is the list of functions that you are supposed to complete
// 2.1. push -> Should accept new data in LIFO manner
// 2.2. pop -> Should remove and return data in LIFO manner. If not available, print "Stack underflow" and return -1.
// 2.3. top -> Should return data in LIFO manner. If not available, print "Stack underflow" and return -1.
// 2.4. size -> Should return the number of elements available in the stack
// 2.5. min -> Should return the smallest element available in the stack. If not available, print "Stack underflow" and return -1 in O(1).


// Sample Input
// push 10
// push 20
// push 5
// push 8
// push 2
// push 4
// push 11
// top
// min
// pop
// top
// min
// pop
// top
// min
// pop
// top
// min
// pop
// top
// min
// pop
// top
// min
// pop
// top
// min
// pop
// quit
// Sample Output
// 11
// 2
// 11
// 4
// 2
// 4
// 2
// 2
// 2
// 8
// 5
// 8
// 5
// 5
// 5
// 20
// 10
// 20
// 10
// 10
// 10





import java.io.*;
import java.util.*;

public class Main {

  public static class MinStack {
    Stack<Integer> allData;
    Stack<Integer> minData;

    public MinStack() {
      allData = new Stack<>();
      minData = new Stack<>();
    }


    int size() {
        return allData.size();
    }

    void push(int val) {
      if(minData.size()==0 || val<=minData.peek()){
          minData.push(val);
      }
      allData.push(val);
      
    //   System.out.println(allData + " " + minData);
      
    }

    int pop() {
        
        // System.out.println(allData + " " + minData);
        
        
      if(minData.size()>0 && allData.peek() == minData.peek()){
        int popped = minData.pop();
        allData.pop();
        return popped;
      }
      
      else if(minData.size()>0 && allData.peek() != minData.peek()){
          int popped = allData.pop();
          return popped;
      }
      else{
          return -1;
      }
    }

    int top() {
        // System.out.println(allData + " " + minData);
      // write your code here
      if(allData.size() >0){
          return allData.peek();
      }
      else{
          return -1;
      }
    }

    int min(){
        // System.out.println(allData + " " + minData);
  	  if(minData.size() >0){
  	      return minData.peek();
  	  }
  	  else{
  	      return -1;
  	  }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MinStack st = new MinStack();

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
      } else if(str.startsWith("min")){
        int val = st.min();
        if(val != -1){
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}




