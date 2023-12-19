import java.util.Arrays;

class Solution {
    public int maxProductDifference(int[] nums) {
        //iterating; O(n)
        int max1 = 0;
        int max2 = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0; i<nums.length;i++){
            if(nums[i]>=max1){
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2){
                max2=nums[i];
            }
            if(nums[i]<=min1){
                min2=min1;
                min1=nums[i];
            }else if(nums[i]<min2){
                min2=nums[i];
            }
        }
        return max1*max2 - min1*min2;
        

        //sorting; O(nlogn)
        Arrays.sort(nums);
        return nums[nums.length-1]*nums[nums.length-2] - nums[0]*nums[1];
    }
}