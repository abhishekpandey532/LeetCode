class Solution {
    public char findTheDifference(String s, String t) {
        
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        char c='\0';
        
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(t.charAt(i))){
                hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
                
             if(hm.get(t.charAt(i))==0)
                 hm.remove(t.charAt(i));
                
            }
            else{
                hm.put(t.charAt(i),1);
            }
        }
        
        for(char c1:hm.keySet()){
            if(hm.get(c1)==1){
                c=c1;
                break;
            }
            
            
        }
        
        return c;
        
        
        
        
    }
}