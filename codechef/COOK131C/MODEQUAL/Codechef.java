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
			int min = Integer.MAX_VALUE;
			for(int i=0;i<N;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if(arr[i]<min) {
					min = arr[i];
				}
			}
			
			int minCount=0;
			for(int i=0;i<N;i++) {
				if(arr[i]==min) {
					minCount++;
				}
			}
			
			
			boolean canReducedToMin = true;
			for(int i=0;i<N;i++) {
				if(arr[i]==min) {
					continue;
				}
				int upperRange =(int) Math.ceil(arr[i]/(double)2)-1;
				if(upperRange >= min) {
					continue;
				}
				else {
					canReducedToMin =false;
					break;
				   }
				}
			
			if(canReducedToMin) {
				System.out.println(N-minCount);
			}
			else {
				System.out.println(N);
			}
			
		}
	}
	
}
