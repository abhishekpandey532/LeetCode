class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> answer=new ArrayList<Integer>(nums.length);
        
       // int ans[]
        int ans[]=new int[nums.length];
        
        Arrays.fill(ans,0);
        
        for(int n:nums){
            ans[n-1]++;
        }
        
        for(int i=0;i<ans.length;i++){
            if(ans[i]==0)
                answer.add(i+1);
        }
        
        return answer;
        
        
        
    }
}