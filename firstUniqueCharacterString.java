class Solution {
    public int firstUniqChar(String s) {
        
        
        
        int c[]=new int[26];
        
        char c1[]=s.toCharArray();
        
        for(char curr:c1){
            c[(int)curr-97]++;
        }
        int one;
        
        for(int i=0;i<c1.length;i++){
            
            if(c[(int)c1[i]-97] ==1 ){
                return i;
            }
            
            
        }
        
        return -1;
        
        
    }
}