public class Task3Cycle6 {
    public boolean equalNum (int x) {
        if (x < 10) {
            return true;
        }
        else {
            int digit = x % 10;
            int nextDigit;
            do {
                x /= 10;
                nextDigit = x % 10;
            } while (x > 0 && digit == nextDigit);
        }
        if (x > 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
