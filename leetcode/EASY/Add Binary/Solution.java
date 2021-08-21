class Solution {
    public String addBinary(String a, String b) {
        // 0 + 0 = 0
        // 1 + 0 = 1
        // 0 + 1 = 1
        // 1 + 1 = 0 and 1 (carry)
        
        StringBuilder res = new StringBuilder();
        int m = a.length()-1;
        int n = b.length()-1;
        int sum  = 0;
        int carry = 0;
        while(m >= 0 || n >= 0){
            sum = carry;
            if(m>=0) sum +=a.charAt(m--)-'0';
            if(n>=0) sum += b.charAt(n--)-'0';
            res.append(sum&1);
            carry = sum>>1;
        }
        
        if(sum >= 2) res.append(carry);
        
        
        return res.reverse().toString();
        
    }
    
}
