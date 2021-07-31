import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


class Codechef{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String arr[] = br.readLine().split(" ");
			int N = Integer.parseInt(arr[0]);
			int D = Integer.parseInt(arr[1]);
			int H = Integer.parseInt(arr[2]);
			
			int rain[] = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				rain[i]= Integer.parseInt(st.nextToken());
			}
			
			int waterLevel = 0;
			boolean isRedAlert = false;
			
			for(int i=0;i<N;i++) {
				if(rain[i]==0) {
					if(waterLevel>D) {
						waterLevel -= D;
					}
					else {
						waterLevel =0;
					}
				}
				else if(rain[i]>0) {
					waterLevel += rain[i];
				}
				
				
				if(waterLevel > H) {
					isRedAlert =true;
					break;
				}
				
			}
			
			if(isRedAlert) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
	}
	
}
