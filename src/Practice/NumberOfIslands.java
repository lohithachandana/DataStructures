package Practice;

public class NumberOfIslands {
    public static void changeGrid(char[][] grid1,int i1,int j1){
        int row=grid1.length;
        int col=grid1[0].length;

        if(i1<0||i1>=row||j1<0||j1>=col||grid1[i1][j1]!='1'){
            return;
        }
        grid1[i1][j1]='0';
        changeGrid(grid1,i1-1,j1);
        changeGrid(grid1,i1+1,j1);
        changeGrid(grid1,i1,j1-1);
        changeGrid(grid1,i1,j1+1);
    }
    public int numIslands(char[][] grid) {
        int count=0;
        int row=grid.length;
        int col=grid[0].length;


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    changeGrid(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void main(String[] args){

    }
    }

