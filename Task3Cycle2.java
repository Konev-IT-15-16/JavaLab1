public class Task3Cycle2 {
    public String reverseListNums(int x) {
        String res = "";
        while (x >= 0) {
            res += Integer.toString(x) + " ";
            x--;
        }
        return res;
    }
}
