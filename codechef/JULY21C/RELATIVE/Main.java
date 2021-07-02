package project0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases != 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int g = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int h = (int) (Math.pow(c,2))/(2*g);
			
			System.out.println(h);
			
			testCases -= 1;
		}
	}
	
}
