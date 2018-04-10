class Solution {
    public int islandPerimeter(int[][] grid) {
        
        
        int peri=0;
        int surrby=0;
        
        int rows=grid.length;
        int cols=grid[0].length;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                surrby=0;
                if(grid[i][j]==1){
                    
                if(isValid(i-1,j,rows,cols) && grid[i-1][j]==1)
                    surrby++;
                    
                if(isValid(i,j-1,rows,cols) && grid[i][j-1]==1)
                    surrby++;
                
                if(isValid(i+1,j,rows,cols) && grid[i+1][j]==1)
                    surrby++;
                    
                if(isValid(i,j+1,rows,cols) && grid[i][j+1]==1)
                    surrby++;
                
                peri+=(4-surrby);
                    
                }
            }
        }
        
        return peri;
        
    }
    
    
    public boolean isValid(int x,int y,int rows,int cols){
        
        if(x>=0 && x<rows && y>=0 && y<cols)
            return true;
        
        return false;
        
        
    }
}