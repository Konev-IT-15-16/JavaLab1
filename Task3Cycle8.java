public class Task3Cycle8 {
    public void leftTriangle (int x) {
        String result = "*";
        while (x > 0) {
            System.out.println(result);
            result += "*";
            x--;
        }
    }
}
