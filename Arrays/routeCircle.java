class Solution {
    public boolean judgeCircle(String moves) {
         int ver=0;
        int hor=0;
        
        
        for(int i=0;i<moves.length();i++){
         char c=moves.charAt(i);
            if(c=='U')
                ver++;
            if(c=='D')
                ver--;
            if(c=='L')
                hor++;
            if(c=='R')
                hor--;
        }
        
        if(!(ver==0) || !(hor==0))
            return false;
        
        return true;
  
        
    }
}