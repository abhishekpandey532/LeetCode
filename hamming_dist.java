class Solution {
    public int hammingDistance(int x, int y) {
        
        int val=x^y;
        
        //int checker=1-(1<<1);
        
        int count=32;
        int count1=0;
        int term=0;
        while(count!=0){
            //System.out.println(val & ((1-(1<<1))<<term));
            
            if((val & (1<<term))>=1)
                count1++;
            
            //checker=checker<<1;
            term++;
            count--;
        }
        //System.out.print(count1);
        return count1;
        
    }
}