class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<=0)
            return false;
        
        
        if((num&(num-1))==0){
            
            int count=0;
            
            while(num!=0){
                
                count++;
                num=num>>1;
            
            }
            if((count%2)!=0)
                return true;
            
            
        }
        
        return false;
        
        
    }
}