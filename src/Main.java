import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Player player1,player2,currentPlayer;
    public static void main(String[] args) {
    boolean gameOver=false;



        Board board= new Board();
        board.imprimeTablero();
        player1=getPlayerFromKeyboard();
        player2= new Player(" ",true);
        currentPlayer = getRandomPlayer(player1, player2);


    }
    public static player
}