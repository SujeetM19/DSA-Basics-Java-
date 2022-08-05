// 1. You are given a string. 
// 2. You have to compress the given string in the following two ways - 
//    First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//    For "aaabbccdee", the compressed string will be "abcde".
//    Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//    For "aaabbccdee", the compressed string will be "a3b2c2de2".

//    wwwwaaadexxxxxx
//    Sample Output
//    wadex
//    w4a3dex6





import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		String result = "";
		for(int index = 0; index < str.length()-1; index++){
		    if(str.charAt(index) != str.charAt(index+1)){
		        result += str.charAt(index);
		    }
		}
		result += str.charAt(str.length()-1);

		return result;
	}

	public static String compression2(String str){
	    int count = 1;
	    String result = "";
		// write your code here
		for(int index = 0; index < str.length()-1; index++){
		  //  count = 1;
		    if(str.charAt(index) == str.charAt(index+1)){
		        count++;
		      //  System.out.println(count);
		    }
		    
		    else{
		        result += str.charAt(index);
		        
	            if(count>1){
	                result += count;  
	            }
		        count = 1;
		    }
		}
		
		int i = str.length() -1;
		int lastCount = 1;
		while(str.charAt(i)== str.charAt(i-1)){
		    lastCount ++;
		  //  System.out.println(lastCount);
		    i--;
		}
		
		result += str.charAt(i);
		result += lastCount;

		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}