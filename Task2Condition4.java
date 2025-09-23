public class Task2Condition4 {
    public String makeDecision(int x, int y) {
        if (x < y) {
            return x + "<" + y;
        }
        else if (x > y) {
            return x + ">" + y;
        }
        else {
            return x + "==" + y;
        }
    }
}
