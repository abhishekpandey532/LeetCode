class Solution {
    public int arrayPairSum(int[] nums) {
       
        Arrays.sort(nums);
        
        //System.out.println(nums[1]);
        
        int sum=0;
        
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        
        
        
        return sum;
        
        
    }
}