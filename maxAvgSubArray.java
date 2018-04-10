class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        if(nums.length<k)
            return 0.0;
        
        double sum=0.0;
        double avg=0.0;
        double maxavg=Integer.MIN_VALUE;
        
        for(int i=0;i<k;i++)
            sum+=nums[i];
        
        maxavg=sum/k;
       /* 
        System.out.println("Sum now is: "+sum);
        System.out.println("Max Avg now is: "+maxavg);
        */
        
        for(int i=1;i<nums.length;i++){
            
            if((i+k)>nums.length)
                break;
            
           // System.out.println("i is: "+i);
            
            sum=sum-nums[i-1]+nums[i+k-1];
            avg=sum/k;
            
            maxavg=Math.max(maxavg,avg);
            /*
            System.out.println(i+" Sum now is: "+sum);
            System.out.println("Avg now is: "+avg);
            
            System.out.println("Max Avg now is: "+maxavg);
*/
            
            
        }
        
        return maxavg;
        
        
        
    }
}