import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Codechef{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String arr[] = br.readLine().split(" ");
			int countLeft=0;
			int countRight=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i].equals("0")) {
					countLeft++;
				}
				if(arr[i].equals("1")) {
					countRight++;
				}
			}
			
			if(countRight>=1 && countLeft>=1) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}
}
