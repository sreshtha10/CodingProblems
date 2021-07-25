import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Codechef{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String arr[] = br.readLine().split(" ");
			long a = Long.parseLong(arr[0]);
			long b = Long.parseLong(arr[1]);
			
			long maxSum = (long) (Math.ceil(b/(double)2)+Math.ceil((-a)/(double)2));
			
			System.out.println(maxSum);
		}
	}
}
