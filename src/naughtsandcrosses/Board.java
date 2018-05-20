package naughtsandcrosses;

/**
 * @author tom
 */
class Board {
    public char[][] state;

    final char BLANK = ' ';
    final char O = 'O';
    final char X = 'X';
    final char[] template = {
        ' ', '1', ' ', '2', ' ', '3', '\n',
        'A', 'T', '|', 'T', '|', 'T', '\n',
        ' ', '-', '+', '-', '+', '-', '\n',
        'B', 'T', '|', 'T', '|', 'T', '\n',
        ' ', '-', '+', '-', '+', '-', '\n',
        'C', 'T', '|', 'T', '|', 'T', '\n'
    };

    public Board() {
        state = new char[3][3];
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[i].length; j++) {
                state[i][j] = BLANK;
            }
        }
    }

    public char winner() {
        for (int i = 0; i < state.length; i++) {
            if (state[i][0] != ' ' &&
                    state[i][0] == state[i][1] && state[i][1] == state[i][2]) {
                return state[i][0];
            }
        }

        for (int i = 0; i < state[0].length; i++) {
            if (state[i][0] != ' ' &&
                    state[0][i] == state[1][i] && state[1][i] == state[2][i]) {
                return state[0][i];
            }
        }

        if (state[0][0] != ' ' &&
                state[0][0] == state[1][1] && state[1][1] == state[2][2]) {
            return state[0][0];
        }

        if (state[0][2] != ' ' &&
                state[0][2] == state[1][1] && state[1][1] == state[2][0]) {
            return state[0][2];
        }

        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        for (char c : template) {
            if (c == 'T') {
                sb.append(state[i / 3][i % 3]);
                i++;
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
