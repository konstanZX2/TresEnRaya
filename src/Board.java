import java.util.Arrays;

public class Board {
    public static final int NUM_ROWS = 3;
    public static final int NUM_COLS = 3;
    private String[][] tablero;
    public static final Shot INVALID_SHOT= new Shot (-1,-1);

public Board(){
    tablero = new String[NUM_ROWS][NUM_COLS];
    for (int row=0; row <tablero.length ; row++) {
        for (int col=0; col < tablero[0].length ; col++) {
            tablero[row][col] = " ";
        }

    }
}

    public void imprimeTablero(){
        for (int row=0; row <tablero.length ; row++) {
            for (int col=0; col < tablero[0].length ; col++) {
                System.out.println(tablero[row][col]);
            }

        }

    }


    public boolean correctShoot(Shot shot,Player player){
    if (shot.row <0 || shot.row>= NUM_ROWS || shot.col <)
    }

    private Shot rule1(Player currentPlayer) {
        for (int row = 0; row <board.length ; row++) {
            for (int col = 0; col <board[0].length ; col++) {
                if(board.[row][col].equals(EMPTY)){
                    Shot shot = new Shot(row,col);
                    correctShoot(shot,currentPlayer);
                    if (wins()){
                        board[row][col]= EMPTY;
                        return shot;
                        else {
                            board[row][col]= EMPTY;
                        }
                    }
                }

            }

        }
        return INVALID_SHOT;}


    private Shot rule2(Player currentPlayer){
    Player human= Main.changePlayer(currentPlayer, Main.player1, Main.player2);
    Shot humanShot= rule1(human);
    Main.changePlayer(currentPlayer, Main.player1, Main.player2);
    return humanShot;
    }

    private Shot rule3(Player currentPlayer){
    if(board[NUM_ROWS/2][ NUM_COLS/2].equals(EMPTY)) {
        return new Shot(NUM_ROWS / 2, NUM_COLS / 2);
    }else{
        return INVALID_SHOT;
    }
    }

    private Shot rule34(Player currentPlayer) {
        boolean emptyPosition = false;
        int row = 20, col = 20;
        while (!emptyPosition) {
            row = (int) (Math.random() * NUM_ROWS);
            col = (int) (Math.random() * NUM_COLS);
            if(board[row][col].equals(EMPTY)){
                emptyPosition=true;
            }
        }
    }





}
