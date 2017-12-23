class Solution {
    public boolean hasAlternatingBits(int n) {
        
        
        int lsb=n&1;
        int n1=n;
        if(lsb==0){
            n=n^(n>>1);
            int mask=Integer.highestOneBit(n1);
            mask=mask|mask>>1;
            mask=mask|mask>>2;
            mask=mask|mask>>4;
            mask=mask|mask>>8;
            mask=mask|mask>>16;
            
            if((mask^n)==0)
                return true;
            
        }
        else{
            n=n^(n<<1);
            int mask=Integer.highestOneBit(n);
            
            mask=mask|mask>>1;
            mask=mask|mask>>2;
            mask=mask|mask>>4;
            mask=mask|mask>>8;
            mask=mask|mask>>16;
            
            if((mask^n)==0)
                return true;
            
            
            
        }
        return false;
        
    }
}