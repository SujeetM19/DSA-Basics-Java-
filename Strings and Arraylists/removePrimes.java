// 1. You are given an ArrayList of positive integers.
// 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

// Note -> The order of elements should remain same.

// Sample Input
// 4
// 3 12 13 15
// Sample Output
// [12, 15]





import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){

		for(int idx = 0; idx < al.size();){
		    int num = al.get(idx);
		    Boolean isPrime = isPrime(num);
		    if(isPrime == true){
		        al.remove(idx);
		    }
		    else{
		        idx++;
		    }
		}
	}
	
	//trick :- dont increment the value of index when you are removing the value... only incrmenet when you are not removing the value
	
	public static Boolean isPrime(int n){
	    for(int i=2; i*i<=n; i++){
	        if(n%i==0) return false;
	    }
	    
	    return true;
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}