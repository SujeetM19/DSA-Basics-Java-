
// Celebrity Problem brute force

// 1. You are given a number n, representing the number of people in a party.
// 2. You are given n strings of n length containing 0's and 1's
// 3. If there is a '1' in ith row, jth spot, then person i knows about person j.
// 4. A celebrity is defined as somebody who knows no other person than himself but everybody else knows him.
// 5. If there is a celebrity print it's index otherwise print "none".

// Note -> There can be only one celebrity. Think why?




// Sample Input
// 4
// 0000
// 1011
// 1101
// 1110
// Sample Output
// 0





import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        int ans = findCelebrity(arr);
        if(ans == -1){
            System.out.println("none");
        }
        else{
            System.out.println(ans);
        }

    }

    public static int findCelebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            st.push(i);
        }
        
        while(st.size()>1){
            int per1 = st.pop();
            int per2 = st.pop();
            
            if(arr[per1][per2] == 1){
                st.push(per2);
            }
            else{
                st.push(per1);
            }

        }
        
        // System.out.println(st);
        
        int celebrity = st.peek();
        
        boolean ifCelebrity = true;
        
        
        for(int i=0; i<arr[0].length; i++){
            if(arr[celebrity][i] == 1){
                ifCelebrity = false;
            }
        }
        
        // System.out.println(ifCelebrity);
        
        
        for(int i=0; i<arr.length && i!=celebrity; i++){
            if(arr[i][celebrity] == 0){
                ifCelebrity = false;
            }
        }
        
        // System.out.println(ifCelebrity);
        
        if(ifCelebrity == true){
            return celebrity;
        } 
        else {
            return -1;
        }
        
    }

}



