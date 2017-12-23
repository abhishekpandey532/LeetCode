class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> mag=new HashMap<Character,Integer>();
        
        //HashMap<Character, Integer> note=new HashMap<Character,Integer>();
        
        for(int i=0;i<magazine.length();i++){
            
            char c=magazine.charAt(i);
            if(mag.containsKey(c)){
                mag.put(c,mag.get(c)+1);
            }
            else{
                mag.put(c,1);
            }
            
            
        }
        
      //  System.out.println("Magazine Created: "+mag);
        
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            
            if(!mag.containsKey(c))
                return false;
            
            else{
                if(mag.get(c)==0)
                    return false;
                else{
                    mag.put(c,mag.get(c)-1);
                }
                
            }
            
            
            
        }
        
      //System.out.println("Magazine After: "+mag);

        
        
        
        
        return true;
        
    }
}