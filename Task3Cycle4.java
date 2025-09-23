public class Task3Cycle4 {
    public int pow(int x, int y) {
        int result = 1;
        if (y == 0) {
            return 1;
        }
        else if (x == 0) {
            return 0;
        }
        else {
            while (y > 0) {
                result *= x;
                y--;
            }
            return result;
        }
    }
}
