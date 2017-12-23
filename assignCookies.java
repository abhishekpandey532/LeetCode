class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        if(g.length==0 || s.length==0)
            return 0;
        
        int content=0;
        
        //int length=(g.length>s.length)?s.length:g.length;
        
        
        int cookie=0;
        int greed=0;
        
        g=sort(g);
        s=sort(s);
        
        
        while(true){
            //System.out.println("G greed is: "+g[greed]);
            //System.out.println("S Cookie is: "+s[cookie]);
            
            if(g[greed]<=s[cookie]){
                content++;
                greed++;
                cookie++;
            }
            else{
                cookie++;
            }
            //System.out.println("Content now is: "+content);
            
            if(cookie==s.length || greed==g.length)
                break;
            
            
            
        }
        
        return content;
        
    }
    
    public int[] sort(int nums[]){
        
        List<Integer> al=new ArrayList<Integer>();
        
        for(int n:nums)
            al.add(n);
        
        Collections.sort(al);
        
        int ans[]=new int[nums.length];
        
        
        //String[] stockArr = new String[stockList.size()];
        //ans = al.toArray(ans);
        
        
        for(int i=0;i<ans.length;i++){
            ans[i]=al.get(i);
        }
        return ans;
        
        
        
    }
    
    
    
}