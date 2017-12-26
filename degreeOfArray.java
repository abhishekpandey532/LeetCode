class Solution {
    public int findShortestSubArray(int[] nums) {
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        //int maxNum=0;
        
        int maxFreq=0;
        
        for(int n:nums){
            if(hm.containsKey(n))
                hm.put(n,hm.get(n)+1);
            else
                hm.put(n,1);
            
            
            if(hm.get(n)>maxFreq)
                maxFreq=hm.get(n);
            
        }
       // System.out.println("HashMap is: "+hm);
       // System.out.println("Max Freq  is: "+maxFreq);
        
        int length=0;
        
        Iterator<Integer> it=hm.keySet().iterator();
       
        int minLength=Integer.MAX_VALUE;
        
        while(it.hasNext()){
            int val=it.next();
            
            int freq=hm.get(val);
            
            if(freq==maxFreq){
                
               // System.out.println("In max val is: "+val);
                
                int firstIndex=firstOccur(nums,val);
               
               
                // System.out.println("First Index is : "+firstIndex);
               
                length=1;
                int count=1;
                
                for(int i=firstIndex+1;i<nums.length;i++){
                    
                    /*System.out.println();
                    
                    System.out.println("Nums at i is: "+nums[i]);
                    System.out.println("Length at i is: "+length);
                    System.out.println("Count at i is: "+count);
                    */
                    
                    if(nums[i]==val){
                        length++;
                        count++;
                    }
                    else
                        count++;
                    
                    if(length==maxFreq)
                        break;
                    
                }
                
                if(count<minLength)
                    minLength=count;
            }
            
            
        }
        
        return minLength;
        
    }
    public int firstOccur(int nums[],int val){
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val)
                return i;
        }
        
        return -1;
        
    }
}