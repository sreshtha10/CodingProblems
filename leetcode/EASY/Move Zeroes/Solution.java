class Solution {
    public void moveZeroes(int[] nums) {
        int pivot=0;
        int count = 0;
        int tmp;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                tmp = nums[i];
                nums[i] = nums[count];
                nums[count] = tmp;
                count++;
            }
        }
    }
}
