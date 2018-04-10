class Solution {
    public String reverseVowels(String s) {
        
        if(s.length()==1)
            return s;
        
        int index1=0;
        int index2=s.length()-1;
        
        char c[]=s.toCharArray();
        
        for(int i=0;i<s.length();i++){
            
            if(isVowel(c[index1]) && isVowel(c[index2])){
                char temp=c[index1];
                c[index1]=c[index2];
                c[index2]=temp;
                index1++;
                index2--;
            }
            
            if(!isVowel(c[index1]))
                index1++;
            
            if(!isVowel(c[index2]))
                index2--;
            
            
                
                
                
                if(index1>=index2)
                    break;
            
            
            
            
            
        }
        
        for(char c1:c)
            System.out.print(c1+" ");
        
        return new String(c);
        
    }
    
    
    public boolean isVowel(char c){
        
        return (c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U')?false:true;
        
    }
}