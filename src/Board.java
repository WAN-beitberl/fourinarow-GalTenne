public class Board {

    public String[][] GameBoard;
    public Board(int row, int col){
        this.GameBoard = new String[row][col];
    }

    public boolean IsRow(String color){
        for (int i = 5; i >= 0; i --)
        {
            for (int j = 0; j <=3; j++ )
            {
                if (this.GameBoard[i][j]!= null&&
                        this.GameBoard[i][j+1]!= null&&
                        this.GameBoard[i][j+2]!= null&&
                        this.GameBoard[i][j+3]!= null)
                {
                    if (this.GameBoard[i][j].equals(color) &&
                            this.GameBoard[i][j + 1].equals(color) &&
                            this.GameBoard[i][j + 2].equals(color) &&
                            this.GameBoard[i][j + 3].equals(color)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean IsCol(String color){
        for (int i = 5; i >=3; i --)
        {
            for (int j = 0; j <7; j++ )
            {
                if (this.GameBoard[i][j] != null &&
                        this.GameBoard[i-1][j]!= null&&
                        this.GameBoard[i-2][j]!= null&&
                        this.GameBoard[i-3][j]!= null)
                {
                    if (this.GameBoard[i][j].equals(color) &&
                            this.GameBoard[i - 1][j].equals(color) &&
                            this.GameBoard[i - 2][j].equals(color) &&
                            this.GameBoard[i - 3][j].equals(color)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
   /* public boolean IsSlant(String color){
        for (int i = 6; i >=3; i --)
        {
            for (int j = 0; j <4; j++ )
            {
                if (this.GameBoard[i][j].equals(color)&&
                        this.GameBoard[i-1][j+1].equals(color)&&
                        this.GameBoard[i-2][j+2].equals(color)&&
                        this.GameBoard[i-3][j+3].equals(color))
                {
                    return true;
                }
            }
        }
        return false;
    }*/
    public boolean IsTie(){
        for (int i = 0; i < 6; i ++)
        {
            for (int j = 0; j < 7; j++)
            {
                if (this.GameBoard[i][j]== null) return false;
            }
        }
        return true;
    }
    public void PrintBoard()
    {
        for (int i = 0; i < 6; i ++)
        {
            for (int j = 0; j < 7; j++)
            {
                if (this.GameBoard[i][j] != null)
                {
                    System.out.print(this.GameBoard[i][j]+ " ");
                }
                else
                {
                    System.out.print("Empty ");
                }
            }
            System.out.println();

        }
    }
}
