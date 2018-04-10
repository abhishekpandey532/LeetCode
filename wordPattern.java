class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        HashMap<Character,String> hm=new HashMap<Character,String>();
        
  //      if(pattern.length())
        
        String s[]=str.split(" ");
        //hm.put(pattern.charAt(0),s[0]);
        
        if(pattern.length()!=s.length)
            return false;
        
        
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            //System.out.println("HashMap Before: "+ hm);
            
            if(!hm.containsKey(c)){
                
                for(char c1:hm.keySet()){
                    if(c1!=c){
                        if(hm.get(c1).equals(s[i]))
                            return false;
                    }
                }
                hm.put(c,s[i]);
                
                          //  System.out.println("HashMap After: "+hm);

            
            }
            else{
              //  System.out.println("In else");
              //  System.out.println("Pattern: "+c);
               // System.out.println("String: "+s[i]);
               // System.out.println("Hm get c: "+hm.get(c));
                
                if(!(s[i].equals(hm.get(c))))
                    return false;
            }
        }
        
        return true;
    }
}