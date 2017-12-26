class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String,Integer> firstList=new HashMap<String,Integer>();
        HashMap<String,Integer> answer=new HashMap<String,Integer>();
        
        String ans[];
        ArrayList<String> ans1=new ArrayList<String>();
        
        for(int i=0;i<list1.length;i++)
            firstList.put(list1[i],i);
        
        for(int i=0;i<list2.length;i++){
            if(firstList.containsKey(list2[i]))
                answer.put(list2[i],(i+firstList.get(list2[i])));
        
        }
        int min=Integer.MAX_VALUE;
    
        for(String s:answer.keySet()){
            if(answer.get(s)<min)
                min=answer.get(s);
        }
        
        for(String s:answer.keySet()){
            
            if(answer.get(s)==min){
                ans1.add(s);
            }
            
        }
        ans=new String[ans1.size()];
        int k=0;
        for(String s:ans1){
            ans[k]=s;
            k++;
        }
        
        
        
        
            return ans;
            
            
        }
        
    }
