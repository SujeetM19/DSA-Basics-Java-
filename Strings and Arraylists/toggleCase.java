// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to toggle the case of every character of the given string.


// pepCODinG
// Sample Output
// PEPcodINg




import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code hereS
		//System.out.println(str);
		String result = "";
		for(int letter_index = 0; letter_index <str.length(); letter_index++){
		    char ch = str.charAt(letter_index);
		    if(ch >= 'A' & ch<='Z'){
		        result += Character.toLowerCase(ch);
		    }
		    
		    else{
		        result += Character.toUpperCase(ch);
		    }
		}

		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}