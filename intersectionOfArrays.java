class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        int loopthis;
        
        if(nums1.length>=nums2.length){
            ArrayList<Integer> num1=new ArrayList<Integer>();
            
            for(int n:nums1)
                num1.add(n);
            
            for(int n:nums2){
                if(num1.contains(n) && !ans.contains(n)){
                    ans.add(n);
                }
            }
        
        }
        else{
            ArrayList<Integer> num2=new ArrayList<Integer>();
            
            for(int n:nums2)
                num2.add(n);
            
            for(int n:nums1){
                if(num2.contains(n) && !ans.contains(n)){
                    ans.add(n);
                }
            }
        
        
        
        }
        
        int i=0;
        int fanswer[]=new int[ans.size()];
        
        for(int n:ans){
            fanswer[i]=n;
            i++;
        }
        
        return fanswer;
        
        
        
    }
}