package battleship;

public class Checking extends PlacingShip {
    static InputFormat InFor = new InputFormat();

    protected boolean checkingInp(String co1, String co2, BattleField Bf, Ship ship) {
        if (!InFor.checkingInpFormat(co1) || !InFor.checkingInpFormat(co1)) {
            return false;
        } else {
            char row1 = co1.charAt(0);
            char row2 = co2.charAt(0);
            int col1 = Integer.parseInt(co1.substring(1));
            int col2 = Integer.parseInt(co2.substring(1));

            //paramCheck(int row1, int row2, int col1, int col2);

            if (row1 == row2) {
                if (Math.abs(col1 - col2) + 1 != ship.shipSize) {
                    System.out.println("\nError! Wrong length of the " + ship.getShipName() + "! Try again:");
                    return false;
                }
                if (col1 > col2) {
                    int temp = col1;
                    col1 = col2;
                    col2 = temp;
                }
                for (int i = col1 - 1; i < col2; i++) {
                    if (Bf.field[row1 - 65][i] == 'O') {
                        return false;
                    }
                }
                if (col1 != 1) {
                    if (Bf.field[row1 - 65][col1 - 2] == 'O') {
                        System.out.println("Error! You placed it too close to another one. Try again:\n");
                        return false;
                    }
                }
                if (col2 != 10) {
                    if (Bf.field[row1 - 65][col2] == 'O') {
                        System.out.println("Error! You placed it too close to another one. Try again:\n");
                        return false;
                    }
                }
            } else if (col1 == col2) {
                if (Math.abs(row1 - row2) + 1 != ship.shipSize) {
                    System.out.println("Error! Wrong length of the " + ship.getShipName() + "! Try again:\n");
                    return false;
                }
                if (row1 > row2) {
                    char temp = row1;
                    row1 = row2;
                    row2 = temp;
                }
                for (int i = row1 - 65; i <= row2 - 65; i++) {
                    if (Bf.field[i][col1 - 1] == 'O') {
                        return false;
                    }
                }
                if (row1 - 65 != 0) {
                    if (Bf.field[row1 - 66][col1 - 1] == 'O') {
                        System.out.println("Error! You placed it too close to another one. Try again:\n");
                        return false;
                    }
                }
                if (row2 - 65 != 9) {
                    if (Bf.field[row2 - 64][col1 - 1] == 'O') {
                        System.out.println("Error! You placed it too close to another one. Try again:\n");
                        return false;
                    }
                }
            } else {
                System.out.println("Error! Wrong ship location! Try again:\n");
                return false;
            }
            ship.setPos(row1 + String.valueOf(col1), row2 + String.valueOf(col2));
            placeShip(Bf, row1, row2, col1, col2);
            return true;
        }
    }
}

//    protected void paramCheck(int A, int B, int C, int D) {
//        if (A == B) {
//            if (Math.abs(C-D) + 1 != ship.craftSize) {
//                System.out.println("\nError! Wrong length of the " + ship.getCraftName() + "! Try again:");
//                return false;
//            }
//            if (C > D) {
//                int temp = C;
//                c = D;
//                D = temp;
//            }
//            for (int i=col1; i<=col2; i++) {
//                if (Bf.field[row1-65][i] == 'O') {
//                    return false;
//                }
//            }
//            if (col1 != 0) {
//                if (Bf.field[row1][col1-1] == 'O') {
//                    System.out.println("Error! You placed it too close to another one. Try again:");
//                    return false;
//                }
//            }if (col2 != 9) {
//                if (Bf.field[row1][col2+1] == 'O') {
//                    System.out.println("Error! You placed it too close to another one. Try again:\n");
//                    return false;
//                }
//            }
//        }
//    }
//
//}