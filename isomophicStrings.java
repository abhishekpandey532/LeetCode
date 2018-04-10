class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> hm=new HashMap<>();
        
        
        
        for(int i=0;i<s.length();i++){
            
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            
           // System.out.println("HashMap before is: "+hm);
            
            
            if(hm.containsKey(c2)){
                if(hm.get(c2)!=(c1))
                    return false;
            }
            else{
                if(hm.containsValue(c1)){
                    
                    for(char c:hm.keySet()){
                        if(c1==hm.get(c)){
                            if(c!=c2)
                                return false;
                        }
                    }
                    
                    
                }
                    
                hm.put(c2,c1);
            }
            
           // System.out.println("\n HashMpa now is:" +hm);
            
        }
        
        return true;
        
    }
}