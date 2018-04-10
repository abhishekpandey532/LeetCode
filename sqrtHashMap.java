class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num<=0)
            return false;
        if(num==1)
            return true;
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int count2=0;
        
        while(num!=1){
            if(num%2==0){
               count2++;
                num=num/2;
            }
            else
                break;
            
        }
        
        if(count2!=0)
            hm.put(2,count2);
        System.out.println(num);
        
        for(int i=3;i<=Math.sqrt(num);i+=2){
            int counts=0;
            
            if(num==1)
                break;
            
            while(num%i==0){
                if(num==1)
                    break;
        
                counts++;
                num=num/i;
        }
            
            
            if(counts!=0)
                hm.put(i,counts);
        
        }
        
                System.out.println(hm);

        
        if(num>2)
            return false;
        else{
            for(int n:hm.keySet()){
                if(((hm.get(n)%2)!=0))
                    return false;
            
            }
            
            return true;
            
            
            
            
        }
        
        
        
       // return true;
        
    }
}