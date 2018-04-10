class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int ans[]=new int[nums.length];
        int retans[]=new int[2];
        
        for(int n:nums){
            ans[n-1]++;
        }
        
        for(int i=0;i<nums.length;i++){
            if(ans[i]==2)
                retans[0]=i+1;
            
            if(ans[i]==0)
                retans[1]=i+1;
            
            
        }
        
        
        return retans;
        
    }
}