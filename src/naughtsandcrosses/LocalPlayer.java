package naughtsandcrosses;

/**
 * @author tom
 */
class LocalPlayer extends Player {

    public LocalPlayer(Board board, char symbol) {
        super(board, symbol);
    }

    @Override
    public void turn() {
        System.out.print(board.toString());
    }
}
