import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


class Codechef{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
	
		
		while(t-->0) {
			HashMap<Long,Long> arr = new HashMap<>();
			long N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			HashMap<Long, Long> map = new HashMap<Long, Long>();
			
			long i=0;
			while(st.hasMoreTokens()) {
				arr.put((long)i,Long.parseLong(st.nextToken()));
				if(!map.containsKey(arr.get(i))) {
					map.put(arr.get(i),(long) 1);
				}
				else {
					map.replace(arr.get(i),map.get(arr.get(i))+1);
				}
			}
			
			long res = N*(N-1);
			
			for(Map.Entry<Long, Long> entry:map.entrySet()) {
				long val = entry.getValue();
				if(val == 1) {
					continue;
				}
				else {
					res -= val*(val-1);
					
				}
			}
			
			System.out.println(res);

			
		}
	}
	
}
