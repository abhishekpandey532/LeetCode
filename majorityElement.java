class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        
        for(int n:nums){
         if(hm.containsKey(n)){
             hm.put(n,hm.get(n)+1);
         }       
         else{
             hm.put(n,1);
         }
        }
        
        int checkLen=(nums.length%2!=0)?(nums.length+1)/2:(nums.length)/2;
            
        for(int n:hm.keySet()){
            
            if(hm.get(n)>=(checkLen))
                return n;
            
        }
        
        return -1;
        
        
        
    }
}