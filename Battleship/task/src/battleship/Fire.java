package battleship;
import static battleship.Main.sc;
import static battleship.Checking.InFor;
import static battleship.ShipPos.ship;

public class Fire {
    static boolean flag = false;
    private void printState(Ship ship, Players player) {
        ship.shipSize--;
        if(ship.shipSize == 0) {
            player.count--;
            if(player.count == 0) {
                System.out.println("\nYou sank the last ship. You won. Congratulations!");
                flag = true;
                sc.close();
            } else {
                System.out.println("\nYou sank a ship!");
            }
        } else {
            System.out.println("\n\nYou hit a ship!");
        }
    }

    public void fireTarget(ShipPos sp, BattleField Bf, BattleField Bf_copy, Players player) {
        String inp;
        inp = sc.next();
        if (InFor.checkingInpFormat(inp)) {
            char row = inp.charAt(0);
            int col = Integer.parseInt(inp.substring(1));
            if (Bf.field[row-65][col-1] == 'O') {
                Bf.field[row-65][col-1] = 'X';
                Bf_copy.field[row-65][col-1] = 'X';

                for(int i=1; i<=5; i++) {
                    sp.craftSelect(i, player);
                    if(row == ship.getStartPos().charAt(0) && row == ship.getEndPos().charAt(0)) {
                        if(col >= Integer.parseInt(ship.getStartPos().substring(1)) &&
                                col <= Integer.parseInt(ship.getEndPos().substring(1))) {
                            printState(ship, player);
                            break;
                        }
                    } else if(col == Integer.parseInt(ship.getStartPos().substring(1)) &&
                            col == Integer.parseInt(ship.getEndPos().substring(1))) {
                        if(row >= ship.getStartPos().charAt(0) && row <= ship.getEndPos().charAt(0)){
                            printState(ship, player);
                            break;
                        }
                    }
                }
            } else if(Bf.field[row-65][col-1] == 'X' || Bf.field[row-65][col-1] == 'M'){
                if(Bf.field[row-65][col-1] == 'X'){
                    System.out.println("\nYou hit a ship!");
                } else {
                    System.out.println("\nYou missed!");
                }
            } else {
                Bf.field[row-65][col-1] = 'M';
                Bf_copy.field[row-65][col-1] = 'M';
                System.out.println("\n\nYou missed!");
            }
        }
    }

}
