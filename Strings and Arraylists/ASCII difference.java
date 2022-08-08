// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
//    For "abecd", the answer should be "a1b3e-2c1d", as 
//    'b'-'a' = 1
//    'e'-'b' = 3
//    'c'-'e' = -2
//    'd'-'c' = 1








import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		int diff = 0;
		StringBuilder res = new StringBuilder(""); 
		res.append(str.charAt(0));
		for(int index = 1; index<str.length(); index++){
		    diff = str.charAt(index) - str.charAt(index-1);
		    res.append(diff);
		    res.append(str.charAt(index));
		}
        
        String result = res.toString();
		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}