class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.length()==0 || s.length()==1)
            return true; 
        
        System.out.println(s);

        
        
        String conv= s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        //String s1[]=s.split(" ");
       
        /* 
        for(String s4:s1){
            
            for(int i=0;i<s4.length();i++){
                if(Character.isLetter(s4.charAt(i)) || Character.isDigit(s4.charAt(i)))
                    conv+=s4.charAt(i);
            }
            
        }
        */
            
        
       // String palin=palindrome(conv);
        
        //System.out.println(conv);
        //System.out.println(palin);
        
        //if((palin.toLowerCase()).equals(conv.toLowerCase()))
         //   return true;
        
        
        for(int i=0;i<(conv.length())/2;i++){
            
            if(conv.charAt(i)!=conv.charAt(conv.length()-i-1))
                return false;
            
            
            
            
        }
        
        return true;
        
        
    }
    
/*    public String palindrome(String s){
        String pal="";
        
        for(int i=s.length()-1;i>=0;i--)
            pal+=s.charAt(i);
        
        return pal;
        
        
        
    }
    */
}