class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int j =i;
            int tmpSum=0;
            while(j< nums.length){
                tmpSum += nums[j++];
                 if(tmpSum > sum){
                    sum  = tmpSum;
                }
            }   
        }
        
        
        return sum;
    }
}
