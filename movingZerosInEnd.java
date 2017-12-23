class Solution {
    public void moveZeroes(int[] nums) {
        
        int index1=-1;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0){
                if(index1==-1)
                   index1=i;
            }
            else{
                if(index1>-1){
                    nums[index1]=nums[i];
                    nums[i]=0;
                    index1++;
                }
                
            }
        }
        //for(int n:nums)
        //System.out.print(n);
        
        
        
        
        
    }
}