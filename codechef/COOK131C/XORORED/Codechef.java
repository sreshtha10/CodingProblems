import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


class Codechef{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int arr[] = new int[N];
			int max = 0;
			for(int i=0;i<N;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if(arr[i]>max) {
					max = arr[i];
				}
			}
			
			int ans=arr[0]^max;
			for(int i=1;i<N;i++) {
				ans = ans | (arr[i]^max);
			}
			
			System.out.println(max+" "+ans);
		
			
			
			
		}
	}
	
}
