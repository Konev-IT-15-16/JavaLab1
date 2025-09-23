public class Task2Condition8 {
    public String age(int x) {
        if (x % 10 == 1 &&
                x != 11) {
            return x + " год";
        }
        else if (((x % 10 == 2) || (x % 10 == 3) || (x % 10 == 4)) &&
                (x != 12 && x != 13 && x != 14)) {
            return x + " года";
        }
        else {
            return x + " лет";
        }
    }
}
