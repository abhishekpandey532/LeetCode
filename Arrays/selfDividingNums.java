class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> al=new ArrayList<Integer>();
        
        
        for(int i=left;i<=right;i++){
            
            int num=i;
            boolean flag=true;
            
            while(num > 0){
                int r=num%10;
                if(r==0){
                    flag=false;
                    break;
                }
                if(i%r!=0){
                    flag=false;
                    break;
                }
                num=num/10;
            }
            if(flag)
                al.add(i);
            
            
            
        }
        return al;
        
        
        
    }
}