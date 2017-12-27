class Solution {
    public String licenseKeyFormatting(String S, int K) {
        
        
        
        String spl[]=S.split("-");
        
        String newString="";
        //String ans="";
        
        StringBuilder ans=new StringBuilder();
        
        for(String s:spl)
            newString+=s;
        
        newString=newString.toUpperCase();
        
        //System.out.println(newString);
        
        int numChars=newString.length();
        int now=0;
        
        //System.out.println("Num Chars is: "+numChars);
        
        if(numChars%K==0){
            //System.out.println("It is");
            
          for(int i=0;i<newString.length();i++){
              
              char c=newString.charAt(i);
              ans.append(c);
              //System.out.println("Char is: "+c);
              //System.out.println("Ans is: "+ans);
              
              now++;
              if(now==K && i!=newString.length()-1){
                  ans.append("-");
                  now=0;
              }
          }    
            
        }
        
        else{
            int adj=numChars%K;
            int i;
            
            for(i=0;i<adj;i++){
                char c=newString.charAt(i);
                ans.append(c);
            }
            if(ans.length()-1!=newString.length()-1){
                ans.append("-");
                
                now=0;
                
                for(int k=i;k<newString.length();k++){
                    char c=newString.charAt(k);
                    //ans+=c;
                    ans.append(c);
                    now++;
                    
                    if(now==K && k!=newString.length()-1){
                        now=0;
                        //ans+="-";
                        ans.append("-");
                    }
                    
                    
                }
                
                
            }
            
            
            
            
            
            
        }
        
        
        return ans.toString();
        
    }
}