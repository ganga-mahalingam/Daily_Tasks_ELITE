class Solution {
    public int maxSubArray(int[] nums) {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE; //minus
        for(int i=0;i<nums.length;i++){
            int temp=curSum+nums[i];// 0+(-2) //-2+1  //1+(-3)
            if(temp<nums[i]) { //-2 <-2      //-1<1   //-2<-3
              curSum=nums[i]; //-2           //1
            }
            else{
              curSum=temp;   //-2
            }
            if(maxSum<curSum) {
              maxSum=curSum;
            }
        }
        return maxSum;
    }
}
// 
