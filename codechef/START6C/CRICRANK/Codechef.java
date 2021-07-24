import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Codechef {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String a[] = br.readLine().split(" ");
			String b[] = br.readLine().split(" ");
			int ma=0;
			int mb=0;
			for(int i=0;i<3;i++) {
				if(Integer.parseInt(a[i]) > Integer.parseInt(b[i])) {
					ma++;
				}
				else {
					mb++;
				}
			}
			
			if(ma>mb) {
				System.out.println("A");
			}
			else {
				System.out.println("B");
			}
		}
	
	}
}
