import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		
		while(testCases != 0) {
			
			int n = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			if(n==1) {
				System.out.println(1);
				testCases -= 1;
				continue;
			}
			
			long arr[] = new long[n+2];
			
			long minNotes = Long.MAX_VALUE;
			long sum = 0;

			for(int i =1;i<=n;i++) {
				arr[i] = Long.parseLong(st.nextToken());
				sum += arr[i];
				
			}
			
			long prefix[] = new  long[n+2];
			long suffix[]= new long[n+2];
			
			for(int i=1;i<=n;i++) {
				prefix[i] = gcd(arr[i],prefix[i-1]);
			}
			
			for(int i=n;i>=1;i--) {
				suffix[i] = gcd(arr[i],suffix[i+1]);	
			}
			
			
			long _gcd,notes;
			
			for(int i=1;i<=n;i++) {
				_gcd = gcd(suffix[i+1],prefix[i-1]);
				notes = ((sum-arr[i])/_gcd) +1;

				if(notes < minNotes) {
					minNotes = notes;
				}
			}
			
			System.out.println(minNotes);
			testCases -= 1;
		}
		
	}
	
	
	public static long gcd(long a,long b) {
		
		if(a == 0) {
			return b;
		}
		
		return gcd(b%a,a);
	}
	
	
	
}
