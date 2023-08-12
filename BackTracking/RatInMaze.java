package BackTracking;

public class RatInMaze {
    public static int countPaths(int maze[][],int n)
    {
        /*
        Check if initial path is vlocked then we cannot  move anywhwere
         */
        if(maze[0][0]==-1)
        {
            return 0;
        }   
        //initialize the lftmost column
        for(int i=0;i<n;i++)
        {
            if(maze[i][0]==0)
            {
                maze[i][0]=1;
            }
            //if it is block then break;
            else
            {
                break;
            }
        }
        //initialize the topmost row
        for(int i=1;i<n;i++)
        {
            if(maze[0][i]==0)
            {
                maze[0][i]=1;
            }
            else
            {
                break;
            }
        }
        //if the cell value is -1 then ignore it
        //otherwise recursively compute the count value
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                //check for blockage
                if(maze[i][j]==-1)
                {
                    continue;
                }
                //if we can reach maze[i][j] from maze[i-1][j]
                //then increment the count
                if(maze[i-1][j]>0)
                {
                    maze[i][j]=maze[i][j]+maze[i-1][j];
                }
                //check if we can reach maze[i][j] from maze[i][j-1]
                //then increment the count
                if(maze[i][j-1]>0)
                {
                    maze[i][j]+=maze[i][j-1];
                }
            }
        }
        //if final cell is block then return 0 otherwise the count value
        return(maze[n-1][n-1]>0 ? maze[n-1][n-1] : 0);
    }
    public static void main(String[] args) {
        int maze[][]={{0,0,0,0},
                      {0,-1,0,0},
                      {-1,0,0,0},
                      {0,0,0,0}};
        
        System.out.println("Count :-->"+countPaths(maze,maze.length));
        
    }
}
