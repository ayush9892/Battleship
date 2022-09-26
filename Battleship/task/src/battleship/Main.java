package battleship;
import java.util.Scanner;

import static battleship.Fire.flag;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BattleField Bf1, Bf2;
        Bf1 = new BattleField();
        Bf2 = new BattleField();

        BattleField Bf1_copy, Bf2_copy;
        Bf1_copy= new BattleField();
        Bf2_copy = new BattleField();

        DisplayGame display = new DisplayGame();
        ShipPos ship = new ShipPos();
        Checking chk = new Checking();
        Fire fire = new Fire();
        Players ply1 = new Players();
        Players ply2 = new Players();
        GameStart game = new GameStart();

        System.out.println("Player 1, place your ships on the game field");
        display.displayGame(Bf1.field);
        ship.shipPos(Bf1, chk, display, ply1);

        System.out.println("\n\nPress Enter and pass the move to another player");
        sc.nextLine();
        sc.nextLine();
        System.out.println("Player 2, place your ships on the game field\n");
        display.displayGame(Bf2.field);
        ship.shipPos(Bf2, chk, display, ply2);

        int player = 1;

        while(!flag){
            System.out.println("\n\nPress Enter and pass the move to another player");
            sc.nextLine();
            String inp = sc.nextLine();
            if (inp.equals("")) {
                if (player % 2 == 1) {
                    game.start(Bf1, Bf2, Bf2_copy, display, fire, ship, 1, ply2);
                } else {
                    game.start(Bf2, Bf1, Bf1_copy, display, fire, ship, 2, ply1);
                }
            }
            player++;
        }

    }
}
