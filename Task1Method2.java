public class Task1Method2 {
    public int sumLastNums(int x) {
        int sum = 0;
        if (x < 10) {
            return -1;
        }
        else {
            sum += x % 10;
            x = x / 10;
            sum += x % 10;
        }
        return sum;
    }
}
