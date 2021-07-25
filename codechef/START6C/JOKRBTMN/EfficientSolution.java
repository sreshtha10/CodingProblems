import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class EfficientSolution{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String a[] = br.readLine().split(" ");
			int m = Integer.parseInt(a[1]);
			int l = Integer.parseInt(a[2]);
			
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			for(int i=0;i<m;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int len = Integer.parseInt(st.nextToken());
				while(len!=0) {
					int next = Integer.parseInt(st.nextToken());
					map.put(next,i);
					len--;
				}
			}
			
			String larr[] = br.readLine().split(" ");
			int arr[] = new int[l];
			
			for(int i=0;i<l;i++) {
				int v = Integer.parseInt(larr[i]);
				arr[i] = map.get(v);
			}
			
			int segments = 1;
			

			for(int i=0;i<l-1;i++) {
				if(arr[i]!=arr[i+1]) {
					segments++;
				}
			}
		
			System.out.println(segments);
			
		}
	
	}
}
