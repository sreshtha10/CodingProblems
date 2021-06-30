import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[]) throws IOException {
		
		int testCases =Integer.parseInt(br.readLine());
		
		while(testCases != 0) {
			test();
			testCases -=1 ;
		}
	}
	
	
	public static void test() throws IOException {
		int arr[];
		int totalNeg = 0;
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<N;i++) {
			arr[i] = arr[i]-(i+1);
			if(arr[i] > 0) {
				System.out.println("Second");
				return;
			}
			if(arr[i] < 0) {
				totalNeg -= arr[i];
			}
		}
		
		if(totalNeg%2 == 0) {
			
			System.out.println("Second");
			return;
		}
		else {
			System.out.println("First");
			return;
		}
	}
	
}
