class Solution {
    public int removeElement(int[] nums, int val) {
        
        
        int pos=0;
        for(int i=0;i<nums.length;i++){
            //System.out.println();
            //System.out.println("pos data is: "+nums[pos]);
            //System.out.println("i data is: "+nums[i]);
            
            if(!(nums[i]==val)){
                nums[pos]=nums[i];
                pos++;
            }
        }
        //for(int n:nums)
          //  System.out.print(n+" ");
        return pos;
        
    }
}