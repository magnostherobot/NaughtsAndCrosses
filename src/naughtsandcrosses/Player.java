package naughtsandcrosses;

/**
 * @author tom
 */
abstract class Player {
    Board board;
    char symbol;

    protected Player(Board board, char symbol) {
        this.board = board;
        this.symbol = symbol;
    }

    public abstract void turn();
}
