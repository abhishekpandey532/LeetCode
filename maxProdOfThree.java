class Solution {
    public int maximumProduct(int[] nums) {
        
   
        int sort[]=new int[nums.length];
            sort=sortArr(nums);
        
        int len=nums.length;
        
        if(allpositive(sort) || allnegative(sort)){
            return(sort[sort.length-1]*sort[sort.length-2]*sort[sort.length-3]);
        }
       else{
           /*
            int maxprod=sort[length-1]*sort[length-2]*sort[length-3];
           
           if(sort[0]*sort[1]*sort[length-1]>maxprod)
               maxprod=sort[0]*sort[1]*sort[length-1];
               */
           
           return Math.max(sort[sort.length-1]*sort[sort.length-2]*sort[sort.length-3],sort[0]*sort[1]*sort[sort.length-1]);
           
           //if(sort[length-1]*sort[length-2])
        }
        
        
    }
    
    public int[] sortArr(int nums[]){
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        int ans[]=new int[nums.length];
        
        for(int n:nums)
            al.add(n);
        
        Collections.sort(al);
        int i=0;
        for(int n:al){
            ans[i]=n;
            i++;
        }
        
        return ans;
        
    }
    public boolean allpositive(int nums[]){
        
        for(int n:nums){
            if(n<0)
                return false;
        }
        return true;
        
        
    }
    public boolean allnegative(int nums[]){
        
        for(int n:nums){
            if(n>0)
                return false;
        }
        return true;
        
        
    }
    
    
}