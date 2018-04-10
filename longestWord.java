class Solution {
    public String longestWord(String[] words) {
        
        ArrayList<String> al=new ArrayList<String>();
        
        ArrayList<String> wrd=new ArrayList<String>();
        int i;
        for(String s:words)
            wrd.add(s);
        
        int maxLength=0;
        
        for(String s:wrd){
            //System.out.println("Word is: "+s);
            
            for(i=1;i<s.length();i++){
                if(!wrd.contains(s.substring(0,i)))
                    break;
            }
           // System.out.println(i);
            if(i==(s.length())){
                if(s.length()>maxLength)
                    maxLength=s.length();
                
                al.add(s);
                
            }
            
        }
        Collections.sort(al.subList(0, al.size()));
        
        //System.out.println(al);
        
        for(String s:al){
            if(s.length()==maxLength)
                return s;
        }
        
        return "ab";
        
        
        
    }
}