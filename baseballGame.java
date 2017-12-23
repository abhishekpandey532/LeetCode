class Solution {
    public int calPoints(String[] ops) {
        
         //System.out.println(StringUtils.isNumeric("123"));
    
        Stack<Integer> st=new Stack<Integer>();
        
        int sum=0;
        for(String s:ops){
            if(s.equals("C")){
                int deduc=st.pop();
                    sum=sum-deduc;
            }
           else if(s.equals("D")){
                int pts=st.peek()*2;
                sum+=pts;
                st.push(pts);
            }
            else if(s.equals("+")){
                int v2=st.pop();
                int v3=st.pop();
                
                int pt=v2+v3;
                
                st.push(v3);
                st.push(v2);
                st.push(pt);
                sum+=pt;
                
            }
            else{
                int val=Integer.parseInt(s);
                sum+=val;
                st.push(val);
            }
        
        }
        
        return sum;
        
        
        
        
    }
}