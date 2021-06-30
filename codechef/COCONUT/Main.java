import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCases = Integer.parseInt(br.readLine());
			
			while(testCases != 0) {
				
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int xa, xb, Xa, Xb;
				
				xa = Integer.parseInt(st.nextToken());
				xb = Integer.parseInt(st.nextToken());
				Xa = Integer.parseInt(st.nextToken());
				Xb = Integer.parseInt(st.nextToken());
				System.out.println(((Xa/xa) +(Xb/xb)) );
				
				testCases -= 1;
			}
			
			
			br.close();
		}
		catch(Exception e) {
			return;
		}
	
		
	}
	
}
