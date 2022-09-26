package battleship;

public class Ship {
    int shipSize;
    private String shipName, shipStart_pos, shipEnd_pos;

    public Ship(int size, String name) {
        shipSize = size;
        shipName = name;
    }
    public String getShipName() {
        return shipName;
    }
    public void setPos(String srt, String end) {
        shipStart_pos = srt;
        shipEnd_pos = end;
    }
    public String getStartPos() {
        return shipStart_pos;
    }
    public String getEndPos() {
        return shipEnd_pos;
    }
}


//public enum Ship {
//    AIR(5, "Aircraft Carrier"), BATTLE(4, "Battleship"), SUB(3, "Submarine"),
//    CRU(3, "Cruiser"), DEST(2, "Destroyer");
//    int craftSize;
//    private final String craftName;
//    Ship(int size, String str) {
//        craftSize = size;
//        craftName = str;
//    }
//
//    public String getCraftName() {
//        return craftName;
//    }
//    private String startPos, endPos;
//    public void setPos(String srt, String end) {
//        startPos = srt;
//        endPos = end;
//    }
//    public String getStartPos() {
//        return startPos;
//    }
//    public String getEndPos() {
//        return endPos;
//    }
//
//}


