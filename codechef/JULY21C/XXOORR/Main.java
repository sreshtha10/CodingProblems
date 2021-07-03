import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases != 0) {
			
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st1.nextToken());
			int k = Integer.parseInt(st1.nextToken());
			
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			
			int arr[] = new int[n];
			int tmp;
			int max = 0;
			for(int i =0;i<n;i++) {
				arr[i] = Integer.parseInt(st2.nextToken());
			}
			
			
			
			int total = 0;
      
			int resultArr[] = new int[32];
      
			for(int i= 0;i<32;i++) {
				int cal = 0;
				for(int j=0;j<n;j++) {
          // checking if bit is 1 or 0 at ith place of integer arr[j] : for eg checking if 3 bit of arr[j] = 10, in binary is 1 or 0.
					if((arr[j] & (1<<i)) != 0) {
						cal += 1;
					}
				}
				resultArr[i] = cal;
				
			}
			
			
			for(int i=0;i<32;i++) {
				total += Math.ceil(resultArr[i]/(double)k);
			}
			
			//System.out.println(Arrays.toString(resultArr));
			System.out.println(total);
			testCases -= 1;
		}
	}
	
	

	
	
	
}
