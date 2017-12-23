class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        
        int max=0;
        
        int great[]=new int[nums1.length];
        int now=0;
        
        for(int i=0;i<nums1.length;i++){
            int index=findpos(nums1[i],nums2);
            
            int val=findMax(index,nums2.length,nums2);
            
            great[now]=val;
            now++;
            
            
        }
        
        return great;
        
    }
    
    public int findpos(int n,int nums2[]){
        int i;
        for(i=0;i<nums2.length;i++){
            if(nums2[i]==n){
                break;
            }
        }
        return i;
    
    }
    
    public int findMax(int here,int last,int nums2[]){
        
        int curr=nums2[here];
        int max=-1;
        for(int i=here+1;i<last;i++){
            if(nums2[i]>curr){
                max=nums2[i];
                break;
            }
        }
        
        return max;

        
    }
    
}