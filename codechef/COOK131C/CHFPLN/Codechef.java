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
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i=0;i<N;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				map.put(arr[i], arr[i]-1);
			}
			
			
			int count=0;
			for(int i=0;i<N;i++) {
				int maxPairs = map.get(arr[i]);
				if(maxPairs>0) {
					count++;
					map.replace(arr[i], maxPairs-1);
				}
			}
			
			System.out.println(count);
			
		}
	}
	
}
