import java.util.Arrays;
class Solution {
    public int waysToSplitArray(int[] nums) {
        long f=0;
        long sum=Arrays.stream(nums).asLongStream().sum();
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            f+=nums[i];
            if(f>=sum-f){
                count++;
            }
        }
        return count;    
    }
}