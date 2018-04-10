class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==0)
            return 0;
        
        int opt[]=new int[nums.length+1];
        opt[0]=0;
        opt[1]=nums[0];
        
        for(int i=1,j=2;i<nums.length;i++,j++){
            
            opt[j]=Math.max(nums[i]+opt[j-2],opt[j-1]);
        }
        
        //System.out.println("OPT array is:");
        
        
        //for(int n:opt)
            //System.out.print(n+" ");
        
        return opt[opt.length-1];
        
        
        
    }
}