package battleship;

public class GameStart {
    public void start(BattleField Bf, BattleField oppo_Bf, BattleField oppo_Bf_copy,
                       DisplayGame display, Fire fire, ShipPos ship_pos, int player_no, Players player) {
        display.displayGame(oppo_Bf_copy.field);
        System.out.print("\n---------------------");
        display.displayGame(Bf.field);
        System.out.println("\n\nPlayer " + player_no + ", it's your turn:");
        fire.fireTarget(ship_pos, oppo_Bf, oppo_Bf_copy, player);
    }

}
