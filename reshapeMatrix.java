class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int[][] newmat=new int[r][c];
        
        int col=0;
        int row=0;
        
       // r=r-1;
        // c=c-1;
        
        if((r*c)>(nums.length*nums[0].length)){
            return nums;
        }
        else{
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                
                newmat[row][col]=nums[i][j];
                
                col++;
                
                if(col==c){
                    row+=1;
                    col=0;
                }
                
                
                
                
                
            }
        }
        
        
        return newmat;
        }
        
        
        
    }
}