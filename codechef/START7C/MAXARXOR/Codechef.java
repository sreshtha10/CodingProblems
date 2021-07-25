import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Codechef{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String arr[] = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			long k = Long.parseLong(arr[1]);
			long len = (long)Math.pow(2,n);
			long ans = Math.min(2*k, len)*(len-1);
			System.out.println(ans);
			
		}
	}
}
