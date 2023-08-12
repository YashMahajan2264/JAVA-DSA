package BackTracking;


public class nQueenProblem {
    public static void printSolution(int board[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int board[][],int row,int col,int n)
    {
        int i,j;
        //Check for the row on the left side
        for( i=0;i<col;i++)
        {
            if(board[row][i]==1)
            {
                return false;
            }
        }
        //check upper diagonal on the left side
        for(i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]==1)
            {
                return false;
            }
        }
        //check lower diagonal on the right side
        for(i=row,j=col;i<n && j>=0 ; i++,j--)
        {
            if(board[i][j]==1)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean solvenQueen(int board[][],int n,int col)
    {
        //base case
        //if all the queens have not got placed then return true
        if(col>=n)
        {
            return true;
        }

        // consider this col and try placing all the queens one by one in all the rows
        for(int i=0;i<n;i++)
        {
            //check if it is safe to place the queens are not
            if(isSafe(board, i, col, n)==true)
            {
                //place the queens in the board
                board[i][col]=1;
            

            //recursive call for remaining queens
            if(solvenQueen(board, n, col+1)==true)
            {
                return true;
            }
            //if placing the queen does not lead to solution thrn backtrack
            board[i][col]=0;
            }  
        }
        //if it is not possible to place the queen in any row of the given 
        //column then return false
        return false;
    }
    public static void main(String[] args) {
        int board[][]={{0,0,0,0},
                      {0,0,0,0},
                      {0,0,0,0},
                      {0,0,0,0}};
        
        if(solvenQueen(board, board.length, 0)==true)
        {
            printSolution(board, board.length);
        }
        else
        {
            System.out.println("Solution is not found");
        }
                      
    }
    
}
