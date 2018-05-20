package naughtsandcrosses;

public class NaughtsAndCrosses {
    public static void main(String[] args) {
        Board board = new Board();

        Player[] players = {
            new LocalPlayer(board, 'O'),
            new AIPlayer(board, 'X')
        };

        for (int i = 0; board.winner() == 0; i++) {
            players[i % 2].turn();
        }
    }
}
