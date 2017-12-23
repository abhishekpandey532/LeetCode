class Solution {
    public String[] findWords(String[] words) {
        
        //ArrayList<Character> row1={''}
        String s[]={"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        //String ans[]=new String[words.length];
        ArrayList<String> al=new ArrayList<String>();
        
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length;i++){
            
            for(char c:s[i].toCharArray()){
                hm.put(c,i);
            }
            
        }
        
        int flag=1;
        int ansind=0;
        for(String word:words){
            String word1=word;
            word=word.toUpperCase();
            int row=hm.get(word.charAt(0));
            flag=1;
            
            for(int i=1;i<word.length();i++){
                int row1=hm.get(word.charAt(i));
                if(row!=row1){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                al.add(word1);
            }
            
            
        }
        String ans[]=new String[al.size()];
        ans=al.toArray(ans);
        
        return ans;
        
        
        
        
        
    }
}