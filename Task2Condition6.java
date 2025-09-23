public class Task2Condition6 {
    public boolean sum3(int x, int y, int z) {
        if (x + y == z) {
            return true;
        }
        else if (x + z == y) {
            return true;
        }
        else if (y + z == x) {
            return true;
        }
        else {
            return false;
        }
    }
}
