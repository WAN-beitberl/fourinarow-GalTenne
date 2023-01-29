import java.util.Scanner;
public class Player {
    private String color;

    public Player(){
        Scanner ColorInput = new Scanner(System.in);
        System.out.println("Choose color:");
        this.color = ColorInput.nextLine();
    }

    public String GetColor(){
        return this.color;
    }
}
