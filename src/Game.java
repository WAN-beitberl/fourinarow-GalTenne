import java.util.Scanner;

public class Game {
    public Player p1;
    public Player p2;
    public Board board;
    public Player MyTurn;


    public Game(Player p1, Player p2, Board board){
        this.p1 = p1;
        this.p2 = p2;
        this.board = board;
        this.MyTurn = p1;
    }

    public void TurnInit(){
        Scanner Input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("what is your move?");
        int col = Input.nextInt();  // Read user input
        if (col > 6 || col < 0 || this.board.GameBoard[0][col] != null)
        {
            System.out.println("illegal move! your turn is over!");
            // placeholder for switching turns
        }
        else
        {
            MakeTurn(col);
        }
    }

    public void MakeTurn(int col){
        for (int i = 5; i >= 0; i--)
        {
            // go up through the row until the first empty slot
            if( this.board.GameBoard[i][col] == null)
            {
                this.board.GameBoard[i][col] = MyTurn.GetColor();
                break;
            }
        }
    }

    public int IsGameFinished(){
        // 0 -> game isn't over, 1 -> MyTurn is the winner, 2 -> tie
        if(this.board.IsCol(this.MyTurn.GetColor())||
                this.board.IsRow(this.MyTurn.GetColor()))
                //||this.board.IsSlant(this.MyTurn.GetColor()))
        {
            Winner();
            return 1;
        }
        if (this.board.IsTie())
        {
            Tie();
            return 2;
        }
        return 0;


    }
    public void Winner()
    {
        String wincolor = this.MyTurn.GetColor();
        System.out.println(wincolor + " is the winner!!!");
    }
    public void Tie()
    {
        System.out.println("You finished the game with a tie! GG");
    }
    public void SwitchTurns()
    {
        if (this.MyTurn == this.p1)
        {
            this.MyTurn = this.p2;
        }
        else
        {
            this.MyTurn = this.p1;
        }
    }
}
