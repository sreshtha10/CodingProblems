// Brute Force

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(s == ""){
            return 0;
        }
        
        int max_count = 0;
        int count = 0;
    
        Map map = new HashMap<Character,Integer>();
        
        int i = 0;
        int start = 0;
        int tmp = 0;
        while(i<len){
            //System.out.println(map);
            if(map.containsKey(s.charAt(i))){
                if(count > max_count){
                    max_count = count;
                }
                i = start+1;
                start++;
                count = 0;
                map.clear();
            }
            else{
                map.put(s.charAt(i),tmp++);
                count++;
                i++;
            }
        }
        
        if(count > max_count){
            max_count = count;
        }
        
        return max_count;
    }
}
