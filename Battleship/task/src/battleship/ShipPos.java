package battleship;

import static battleship.Main.sc;

public class ShipPos {
    static Ship ship;
    public void craftSelect(int inp, Players player) {
        switch(inp) {
            case 1 :
                ship = player.AIR;
                break;
            case 2:
                ship = player.BATTLE;
                break;
            case 3:
                ship = player.SUB;
                break;
            case 4:
                ship = player.CRU;
                break;
            case 5:
                ship = player.DEST;
        }
    }

    public void shipPos(BattleField Bf, Checking chk, DisplayGame dis, Players player) {
        String cor1, cor2;
        boolean correct_cord;
        for (int i=1; i<=5; i++) {
            correct_cord = false;
            craftSelect(i, player);
            System.out.println("\n\nEnter the coordinates of the " + ship.getShipName() + "(" + ship.shipSize + " cells):\n");
            while(!correct_cord) {
                cor1 = sc.next();
                cor2 = sc.next();
                if (chk.checkingInp(cor1, cor2, Bf, ship)) {
                    dis.displayGame(Bf.field);
                    correct_cord = true;
                }
            }
        }
    }
}
