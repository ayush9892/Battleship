package battleship;

public class BattleField {
    char[][] field;
    BattleField() {
        field = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = '~';
            }
        }
    }
}
