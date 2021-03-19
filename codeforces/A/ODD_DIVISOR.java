package project0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long testCases = Long.parseLong(br.readLine());
		while(testCases !=0) {
			long n = Long.parseLong(br.readLine());
			System.out.println(divisor(n));
			testCases -= 1;
		}
 	}
	
	public static String divisor(long x) {
		if(x%2 ==  1 && x != 1) {
			return "YES";
		}
		if(x == 1) {
			return "NO";
		}
		
		return divisor(x/2);
    }
}
