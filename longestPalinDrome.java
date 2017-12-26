class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        int length=0;
        
        //hm.put('d',1);
        //hm.put('D',1);
        
        //System.out.println(hm);
        
        char strChar[]=s.toCharArray();
        
        for(char c:strChar){
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }
        
       // System.out.println("HashMap now is: "+hm);
        
        Iterator <Character> it=hm.keySet().iterator();
        
        while(it.hasNext()){
            char c=it.next();
        
            if((hm.get(c)%2)==0){
                length+=hm.get(c);
                it.remove();
            }
            else if(hm.get(c)!=1 && ((hm.get(c)-1)%2)==0){
                length+=(hm.get(c)-1);
                //hm.remove(c);
                //it.remove();
                hm.put(c,1);
            }
           // else if(hm.)
        }
            
            
        
        for(char c:hm.keySet()){
            if(hm.get(c)==1){
                length+=1;
             break;   
            }
            
        }
        
        
        return length;
        
    }
}