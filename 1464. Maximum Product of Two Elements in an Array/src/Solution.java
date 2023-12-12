import java.util.Arrays;

class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int max2 = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){ //max2< max < nums[i]
                max2 = max;
                max = nums[i];
            }
            else if(nums[i]>max2){ // max2 < nums[i] < max
                max2 = nums[i];
            }
        }
        return ( (max-1)*(max2-1) );
    }

    public int maxProductSorted(int[] nums){
        Arrays.sort(nums);
        return( (nums[nums.length-1]-1) * (nums[nums.length-2]-1) );
    }
}
