class Solution {
    public int findComplement(int num) {
        
        int n=num;
        
        num=num|(num>>1);
        num=num|(num>>2);
        num=num|(num>>4);
        num=num|(num>>8);
        
        num+=1;
        
        return (n^(num-1));
        
        
        
        
    }
}