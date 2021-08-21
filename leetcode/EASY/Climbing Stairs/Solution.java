class Solution {
    public static HashMap<Integer,Integer> map = new HashMap();
    public int climbStairs(int n) {
        if(map.containsKey(n)){
            return map.get(n);
        }
        else if(n <= 0){
            return  0;
        }
        else if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        
        int ans= climbStairs(n-1)+climbStairs(n-2);
        map.put(n,ans);
        return ans;
    }

        
}
