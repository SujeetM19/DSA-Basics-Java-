public class towerOfHanoi {
    
}

Tower Of Hanoi
Easy  Prev   Next
1. There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 and 3 are empty.
2. The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom.
3. You are required to 
    3.1. Print the instructions to move the disks.
    3.2. from tower 1 to tower 2 using tower 3 
    3.3. following the rules
        3.3.1 move 1 disk at a time.
        3.3.2 never place a smaller disk under a larger disk.
        3.3.3 you can only move a disk at the top.



Sample input
3
10
11
12
Sample Output
1[10 -> 11]
2[10 -> 12]
1[11 -> 12]
3[10 -> 11]
1[12 -> 10]
2[12 -> 11]
1[10 -> 11]





import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        
        toh(n, n1, n2, n3);
        
    }

    public static void toh(int n, int t1, int t2, int t3){
        
        //base case
        if(n==0) return;
        
        //faith 01
        toh(n-1, t1, t3, t2);
        
        //my work
        System.out.println(n + "[" + t1 + " -> " + t2 + "]");
        
        
        //faith 02
        toh(n-1, t3, t2, t1);
        
        
    }

}















