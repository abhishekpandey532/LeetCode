class Solution {
    public int minCostClimbingStairs(int[] cost) {
       
        
        int opt[]=new int[cost.length+1];
        opt[0]=cost[0];
        opt[1]=cost[1];
        
        for(int i=2;i<=cost.length;i++){
            int cost1=(i==cost.length)?0:cost[i];
            opt[i]=Math.min(cost1+opt[i-1],cost1+opt[i-2]);
        }
        
        return opt[cost.length];
            
            
            
            
        }
        
        
        
    }
