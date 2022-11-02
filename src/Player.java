public class Player {



    private String name;
private String symbol;
private static int numPlayers = 0;

public Player(String name){
 this.name=name;
 if (numPlayers==0){
     symbol = "O";
 }else{
     symbol="X";
 }
 numPlayers++;

}
public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
}
