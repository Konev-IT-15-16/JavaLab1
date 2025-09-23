public class Task1Method8 {
    public boolean isDivisor(int a, int b) {
        if ((a > b) && (a / b != 0) && (a % b == 0)) {
            return true;
        }
        else if ((b >= a) && (b / a != 0) && (b % a == 0)) {
            return true;
        }
        else {
            return false;
        }
    }
}
