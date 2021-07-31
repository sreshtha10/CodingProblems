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
			long shells[] = new long[3];
			for(int i=0;i<3;i++) {
				shells[i]=Long.parseLong(arr[i]);
			}
			Arrays.sort(shells);
			System.out.println(shells[2]+shells[1]);
			
		}
	}
	
}
