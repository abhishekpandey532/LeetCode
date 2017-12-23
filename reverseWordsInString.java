class Solution {
    public String reverseWords(String s) {
        
        String s2[]=s.split(" ");
        
        String ans="";
        
        for(int i=0;i<s2.length;i++){
            String s1=reverse(s2[i]);
            
            if(i==s2.length-1){
                ans+=s1;
                //System.out.print(s1);
                break;
            }
            //System.out.print(s1+" ");
            ans+=s1+" ";
        }
        return ans;
        
    }
    
    public String reverse(String s){
        
        String rev="";
        
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            rev+=c;
        }
        return rev;
        
    }
}