import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
	
	static LinkedList<Integer> st[] = new LinkedList[10];
	static Map<Character, Integer> map = new HashMap<>();
	static StringBuilder walk = new StringBuilder();
	
	public static void main(String args[]) throws IOException {
		
		for(int i=0;i<10;i++) {
			st[i] = new LinkedList<Integer>();
		}

	    st[0].add(5);
	    st[0].add(1);
	    st[0].add(4);
	    st[1].add(0);
	    st[1].add(2);
	    st[1].add(6);
	    st[2].add(1);
	    st[2].add(7);
	    st[2].add(3);
	    st[3].add(2);
	    st[3].add(4);
	    st[3].add(8);
	    st[4].add(3);
	    st[4].add(0);
	    st[4].add(9);
	    //
	    st[0+5].add(0);
	    st[0+5].add(7);
	    st[0+5].add(8);
	    st[1+5].add(1);
	    st[1+5].add(8);
	    st[1+5].add(9);
	    st[2+5].add(2);
	    st[2+5].add(5);
	    st[2+5].add(9);
	    st[3+5].add(3);
	    st[3+5].add(6);
	    st[3+5].add(5);
	    st[4+5].add(4);
	    st[4+5].add(7);
	    st[4+5].add(6);
	    
	    map.put('A', 0);
	    map.put('B', 1);
	    map.put('C', 2);
	    map.put('D', 3);
	    map.put('E', 4);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCases = Integer.parseInt(br.readLine());
		
		while(testCases != 0) {
			
			String S = br.readLine();
			
			int sr = map.get(S.charAt(0));

			int len = S.length();
			
			if(BFS(S,sr,len) || BFS(S,sr+5,len)) {
				System.out.println(walk);
			}
			else {
				System.out.println(-1);
			}

			testCases --;
		}
		
	}
	
	public static boolean BFS(String S,int sr,int len) {
		
		walk.setLength(0);
		int prevIndex;
		int currIndex = sr;
		
		walk.append(sr);
		
		for(int i=1;i<len;i++) {
			
			prevIndex = currIndex;
			
			for(int next : st[currIndex]) {
				if(next == map.get(S.charAt(i)) || next == map.get(S.charAt(i))+5 ){
					currIndex= next;
					walk.append(next);
					break;
				}
			}
			
			if(prevIndex == currIndex) {
				return false;
			}
		}
		return true;
	}
	
}
