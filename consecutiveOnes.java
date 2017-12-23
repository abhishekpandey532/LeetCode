class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int countnow=0;
        int countmax=0;
        
        for(int val:nums){
            if(val==1){
                countnow++;
            }
            if(val==0){
                if(countnow>countmax)
                    countmax=countnow;
                
                countnow=0;
            }
        }
        if(countnow>countmax)
            countmax=countnow;
        
        return countmax;
        
    }
}