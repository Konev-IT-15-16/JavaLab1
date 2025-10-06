import java.util.Random;
import java.util.Scanner;

public class Tasks {
    Scanner scanner = new Scanner(System.in);
    // Task1Method2
    public int sumLastNums(int x) {
        int sum = 0;
        if (x < 10) {
            return 0;
        } else {
            sum += x % 10;
            x = x / 10;
            sum += x % 10;
        }
        return sum;
    }

    // Task1Method4
    public boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Task1Method6
    public boolean isUpperCase(char x) {
        if (x >= 'A' && x <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    // Task1Method8
    public boolean isDivisor(int a, int b) {
        if ((a > b) && (a / b != 0) && (a % b == 0)) {
            return true;
        } else if ((b >= a) && (b / a != 0) && (b % a == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Task1Method10
    public int lastNumSum(int a, int b) {
        return a % 10 + b % 10;
    }

    // Task2Condition2
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    // Task2Condition4
    public String makeDecision(int x, int y) {
        if (x < y) {
            return x + "<" + y;
        } else if (x > y) {
            return x + ">" + y;
        } else {
            return x + "==" + y;
        }
    }

    // Task2Condition6
    public boolean sum3(int x, int y, int z) {
        if (x + y == z) {
            return true;
        } else if (x + z == y) {
            return true;
        } else if (y + z == x) {
            return true;
        } else {
            return false;
        }
    }

    // Task2Condition8
    public String age(int x) {
        if (x % 10 == 1 &&
                x != 11) {
            return x + " год";
        } else if (((x % 10 == 2) || (x % 10 == 3) || (x % 10 == 4)) &&
                (x != 12 && x != 13 && x != 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    // Task2Condition10
    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
        }
    }

    // Task3Cylce2
    public String reverseListNums(int x) {
        String res = "";
        while (x >= 0) {
            res += Integer.toString(x) + " ";
            x--;
        }
        return res;
    }

    // Task3Cylce4
    public int pow(int x, int y) {
        int result = 1;
        if (y == 0) {
            return 1;
        } else if (x == 0) {
            return 0;
        } else {
            while (y > 0) {
                result *= x;
                y--;
            }
            return result;
        }
    }

    // Task3Cylce6
    public boolean equalNum (int x) {
        if (x < 10) {
            return true;
        } else {
            int digit = x % 10;
            int nextDigit;
            do {
                x /= 10;
                nextDigit = x % 10;
            } while (x > 0 && digit == nextDigit);
        }
        if (x > 0) {
            return false;
        } else {
            return true;
        }
    }

    // Task3Cylce8
    public void leftTriangle (int x) {
        String result = "*";
        while (x > 0) {
            System.out.println(result);
            result += "*";
            x--;
        }
    }

    // Task3Cylce10
    public void guessGame() {
        Random random = new Random();
        int target = random.nextInt(10);
        int attempts = 0;
        int guess;
        do {
            System.out.println("Введите число от 0 до 9:");
            guess = scanner.nextInt();
            attempts++;
            if (guess == target) {
                System.out.println("Вы угадали!");
            } else {
                System.out.println("Вы не угадали, введите число от 0 до 9:");
            }
        } while (guess != target);
        System.out.println("Вы отгадали число за " + attempts + " попытки(ок)");
    }

    // Task4Array2
    public int findLast (int arr[], int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Task4Array4
    public int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    // Task4Array6
    public void reverse(int [] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Task4Array8
    public int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = arr1.length; i < newArr.length; i++) {
            newArr[i] = arr2[i-arr1.length];
        }
        return newArr;
    }

    // Task4Array10
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
}
