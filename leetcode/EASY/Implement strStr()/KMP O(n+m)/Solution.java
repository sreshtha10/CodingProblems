class Solution {
    public int strStr(String haystack, String needle) {
        
        int n=haystack.length();
        int m = needle.length();
        
        int[] lps = new int[m];
        
        if(needle.isEmpty()){
            return 0;
        }
        
        int i=0,j=1;
	lps[0] = 0;
		
		while(j<m) {
			
			if(needle.charAt(i) == needle.charAt(j)) {
				lps[j] = i+1;
				i++;
				j++;
				continue;
			}
			
			if(i ==0) {
				lps[j] = 0;
				j++;
			}
			else {
				i = lps[i-1];
			}
		}
        
        
        i =0;
        j =0;
        
        while(i<n && j<m) {
			if(haystack.charAt(i) == needle.charAt(j)) {
				i++;
				j++;
			}
			else if(j==0) {
				i++;
			}
			else {
				j = lps[j-1];
			}
	
		}	
		
		if(j==m) {
			return i-m;
		}
		else{
            		return -1;
        }
        
    }
}
