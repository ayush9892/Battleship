package battleship;

public class DisplayGame {
    public void displayGame(char[][] field){
        char row = 'A';
        System.out.print("\n ");
        for (int i=1; i<=10; i++) {
            System.out.print(" " + i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("\n" + row);
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + field[i][j]);
            }
            row += 1;
        }
    }
}
