
class KMP{
	String string;
	String pattern;
	int[] lps;
	
	KMP(String string,String pattern){
		this.string = string;
		this.pattern = pattern;
		this.lps = new int[pattern.length()];
	}
	
	
	public int kmp() {
		this.createLPS();
		//System.out.println(Arrays.toString(this.lps));
		int i = 0,j= 0;
		
		while(i<this.string.length() && j<this.pattern.length()) {
			
			
			//System.out.println(i+" "+j);
			if(this.string.charAt(i) == this.pattern.charAt(j)) {
				i++;
				j++;
			}
			else if(j==0) {
				i++;
			}
			else {
				j = this.lps[j-1];
			}
	
		}	
		
		if(j==pattern.length()) {
			return i-pattern.length();
		}
		
		
		return -1;
		
		
		
		
	}
	
	
	private void createLPS() {
		int i=0,j=1;
		this.lps[0] = 0;
		
		while(j<this.pattern.length()) {
			
			if(this.pattern.charAt(i) == this.pattern.charAt(j)) {
				this.lps[j] = i+1;
				i++;
				j++;
				continue;
			}
			
			if(i ==0) {  //this is same as because we wont reach this part if they are not equal, this.pattern.charAt(i) != this.pattern.charAt(j)  && i ==0 
				this.lps[j] = 0;
				j++;
			}
			else {
				i = this.lps[i-1];
			}
		}
	}
}



class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.isEmpty()){
            return 0;
        }
        
        if(needle.length() > haystack.length()){
            return -1;
        }
        
        KMP knuth = new KMP(haystack,needle);
        return knuth.kmp();
        
    }
}
