// MYSARA - codechef -bit manipulation.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static final long MOD = 1000000007;
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			
			int B[] = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<n;i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}
			
			boolean sequence = true;
			
			long num = 1;
			
			for(int i=0;i<n-1;i++) {
				int count =0;
				if((B[i]&B[i+1]) != B[i]) {
					sequence = false;
					break;
				}
				for(int j=0;j<32;j++) {
					if((B[i] & (1<<j)) != 0) {
						count++;
					}
				}
				num = (long) ((num*Math.pow(2, count))%MOD);
				
			}
			
			if(!sequence) {
				System.out.println(0);
			}
			else {
				System.out.println(num);
			}
			
		}
	}
}
