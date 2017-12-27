class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> first=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> second=new HashMap<Integer,Integer>();
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        int ans1[];
        
        for(int n:nums1){
            if(first.containsKey(n))
                first.put(n,first.get(n)+1);
            else
                first.put(n,1);
        }
        
                
        for(int n:nums2){
            if(second.containsKey(n))
                second.put(n,second.get(n)+1);
            else
                second.put(n,1);
        }
        
        System.out.println(first);
        System.out.println(second);
        
        for(int n:first.keySet()){
            if(second.containsKey(n)){
                int times=(first.get(n)<second.get(n))?first.get(n):second.get(n);
                
                for(int i=0;i<times;i++)
                    al.add(n);
            }
            
            
        }
        
        System.out.println(al);
        ans1=new int[al.size()];
        int i=0;
        
        for(int n:al){
            ans1[i]=n;
            i++;
        }
            
        
        
        return ans1;
        
        
        
        
        
    }
}