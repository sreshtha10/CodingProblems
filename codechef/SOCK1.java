import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;



public class Main{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		List<Integer> list = new ArrayList<>(); 
		StringTokenizer st = new StringTokenizer(line);
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		for(Integer a : list) {
			if(Collections.frequency(list,a) > 1) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		
	}
}
