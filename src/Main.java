public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to 4 in a row!");

        Board MyBoard = new Board(6, 7);
        Player p1 = new Player();
        Player p2 = new Player();

        Game ArbaBeshura = new Game(p1, p2, MyBoard);
        ArbaBeshura.MyTurn = ArbaBeshura.p1;

        while(ArbaBeshura.IsGameFinished() == 0)
        {
            ArbaBeshura.SwitchTurns();
            ArbaBeshura.TurnInit();
            MyBoard.PrintBoard();
        }
    }
}