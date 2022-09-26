package battleship;

public class PlacingShip {
    protected void placeShip(BattleField Bf, char row1, char row2, int col1, int col2){
        if (row1 == row2) {
            for (int i = col1-1; i<col2; i++){
                Bf.field[row1-65][i] = 'O';
            }
        } else if(col1 == col2) {
            for (int i = row1-65; i<=row2-65; i++){
                Bf.field[i][col1-1] = 'O';
            }
        }
    }
}
