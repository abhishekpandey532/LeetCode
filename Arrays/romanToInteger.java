class Solution {
    public int romanToInt(String s) {
        
        
        int nums[]=new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c=='M')
                nums[i]=1000;
            if(c=='D')
                nums[i]=500;
            if(c=='C')
                nums[i]=100;
            if(c=='L')
                nums[i]=50;
            if(c=='X')
                nums[i]=10;
            if(c=='V')
                nums[i]=5;
            if(c=='I')
                nums[i]=1;
        }
        
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
                sum-=nums[i];
            else
                sum+=nums[i];
            
        }
        sum+=nums[nums.length-1];
        
        return sum;
        
        
        
    }
}