class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        if(nums.length == 1){
            return nums[0];
        }
        for(int j=0; j<k; j++){
            sum+=nums[j];
        }
        int max = sum;
        for(int i=k; i<nums.length; i++){
            sum = sum + nums[i] - nums[i-k];
            if(sum>max){
                max = sum;
            }
        }
        double avg = ((double)max)/k;
        return avg;
    }
}