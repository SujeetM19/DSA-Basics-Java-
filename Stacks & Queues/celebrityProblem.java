
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
        for(int i=0; i<arr.length; i++){
            boolean celebrity = true;
            for(int j=0; j<arr[0].length;j++){
                if(arr[i][j] == 1){
                    celebrity = false;
                    break;
                }
            }
            
            if(celebrity == true){
                for(int k = 0; k<arr.length && k!=i; k++){
                    if(arr[k][i] == 0){
                        celebrity = false;
                        break;
                    }
                }
            }
            
            if(celebrity == true){
                return i;
            }
            
        }
        
        
        return -1;
    }

}






