package battleship;

public class InputFormat {
    public boolean checkingInpFormat(String inp) {
        if (!inp.matches("[A-J{1}?][1-9]0??")) {
            System.out.println("Error! You entered the wrong coordinates! Try again:");
            return false;
        }
        return true;
    }
}
