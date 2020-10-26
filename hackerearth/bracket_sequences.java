import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws IOException
	{
	    try{
	    	InputStreamReader r = new InputStreamReader(System.in);
	    	BufferedReader reader = new BufferedReader(r);
	    	String str = reader.readLine();
	    	String[] arr = new String[str.length()];
	    	for(int i=0;i<str.length();i++) {
	    		arr[i] = Character.toString(str.charAt(i));
	    	}
	    	int total = 0;
	    	for(int i=0;i<arr.length;i++) {
	    		if(check(arr,i)) {
	    			total += 1;
	    		}
	    	}
	    	System.out.println(total);
	    		

	    	
	    }
	    catch(Exception e){
	        return;
	    }
	}
	
	public static boolean check(String[] arr,int startIndex) {
		int i = startIndex;
		Stack<String> stack = new Stack<>();
		while(true) {
			if(arr[i].equals("(")) {
				stack.push(arr[i]);
			}
			else if(arr[i].equals(")") && !stack.isEmpty()) {
				stack.pop();
			}
			else {
				return false;
			}
			
			
			if(i == arr.length-1) {
				i = 0;
			}
			else {
				i+=1;
			}
			
			if(i == startIndex) {
				return true;
			}
		}
		
	}
}
