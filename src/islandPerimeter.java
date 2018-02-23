public class islandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int result=0;
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    result=Math.max(result,loopLandPerimeter(grid,i,j));
                }
            }
        }
        return result;
    }

    public int loopLandPerimeter(int[][]grid,int i,int j){
        if(i>=0&&i<grid.length&&j>=0&&j<grid[0].length&&grid[i][j]==1){
            grid[i][j]=-1;
            int result=0;
            if(i==0||grid[i-1][j]==0)
                result++;
            if(i==(grid.length-1)||grid[i+1][j]==0)
                result++;
            if(j==0||grid[i][j-1]==0)
                result++;
            if(j==(grid[0].length-1)||grid[i][j+1]==0)
                result++;
            return result+loopLandPerimeter(grid,i-1,j)+loopLandPerimeter(grid,i+1,j)
                    +loopLandPerimeter(grid,i,j-1)+loopLandPerimeter(grid,i,j+1);
        }
        return 0;
    }
}
