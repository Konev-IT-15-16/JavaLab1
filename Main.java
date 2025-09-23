import java.util.Scanner;
import java.util.Random;

public class Main {
    Random random = new Random();
    private static void printArray(int[] arr) { // метод для вывода массива
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    private static int[] fillArray(int[] array, int sizeArr) { // метод для заполнения массива случайными числами
        Random random = new Random();
        for (int i = 0; i < sizeArr; i++) {
            array[i] = random.nextInt(101) - 50;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int choice;
        System.out.println("Выберите раздел заданий: \n" +
                "1. Методы \n" +
                "2. Условия \n" +
                "3. Циклы \n" +
                "4. Массивы \n" +
                "Выбор: " );
        choice = scanner.nextInt();
        switch(choice) {
            case 1:
                int inChoice1;
                System.out.println("Выберите номер задание: \n" +
                        "2. 1\n" +
                        "4. 2\n" +
                        "6. 3\n" +
                        "8. 4\n" +
                        "10. 5\n");
                inChoice1 = scanner.nextInt();
                switch(inChoice1) {
                    case 1:
                        // Задание 1. Методы №2
                        System.out.println("Введите число: ");
                        int num = scanner.nextInt();
                        Task1Method2 sumHelper = new Task1Method2();
                        int sum = sumHelper.sumLastNums(num);
                        if (sum == 0) {
                            System.out.println("Число содержит меньше 2-х знаков или оно отрицательно.");
                        } else {
                            System.out.println("Результат сложения 2-х последних цифр числа " + num + " = " + sum);
                        }
                        break;
                    case 2:
                        // Задание 1. Методы №4
                        int number;
                        number = scanner.nextInt();
                        if (number == 0) {
                            System.out.println("Число является нулём.");
                        }
                        else {
                            boolean isPositive;
                            Task1Method4 isPositiveHelper = new Task1Method4();
                            isPositive = isPositiveHelper.isPositive(number);
                            System.out.println(isPositive);
                        }
                        break;
                    case 3:
                        // Задание 1. Методы №6
                        char upper;
                        System.out.println("Введите символ: ");
                        upper = scanner.next().charAt(0);
                        boolean isUpperCase;
                        Task1Method6 isUpperCaseHelper = new Task1Method6();
                        isUpperCase = isUpperCaseHelper.isUpperCase(upper);
                        System.out.println(isUpperCase);
                        break;
                    case 4:
                        // Задание 1. Методы №8
                        int num1;
                        int num2;
                        System.out.println("Введите 1-ое число: ");
                        num1 = scanner.nextInt();
                        System.out.println("Введите 2-ое число: ");
                        num2 = scanner.nextInt();
                        if (num1 <= 0 || num2 <= 0) {
                            System.out.println("Числа должны быть больше нуля.");
                            return;
                        }
                        boolean isDivisor;
                        Task1Method8 isDivisorHelper = new Task1Method8();
                        isDivisor = isDivisorHelper.isDivisor(num1, num2);
                        System.out.println(isDivisor);
                        break;
                    case 5:
                        // Задание 1. Методы №10
                        int[] arr = new int[5];
                        int supNum;
                        Task1Method10 lastNumSumHelper = new Task1Method10();
                        System.out.print("Введите 5 чисел: ");
                        for (int i = 0; i < 5; i++) {
                            arr[i] = scanner.nextInt();
                            if (arr[i] <= 0) {
                                System.out.println("Числа должны быть больше 0");
                                return;
                            }
                        }
                        for (int i = 0; i < 4; i++) {
                            supNum = lastNumSumHelper.lastNumSum(arr[i], arr[i + 1]);
                            arr[i + 1] = supNum;
                        }
                        System.out.println("Последовательная сумма последних цифр: " + arr[4]);
                        break;
                    default:
                        System.out.println("Неверный выбор");
                        break;
                }
                break;
            case 2:
                int inChoice2;
                System.out.println("Выберите номер задание: \n" +
                        "2. 1\n" +
                        "4. 2\n" +
                        "6. 3\n" +
                        "8. 4\n" +
                        "10. 5\n");
                inChoice2 = scanner.nextInt();
                switch(inChoice2) {
                    case 1:
                        // Задание 2. Условия №2
                        int numOne, numTwo;
                        double numResult;
                        System.out.println("Введите 2 числа (делимое и делитель соответственно): ");
                        numOne = scanner.nextInt();
                        numTwo = scanner.nextInt();
                        if (numOne < 0 || numTwo < 0) {
                            System.out.println("Числа должны быть положительными или 0");
                            return;
                        }
                        Task2Condition2 safeDivHelper = new Task2Condition2();
                        numResult = safeDivHelper.safeDiv(numOne, numTwo);
                        System.out.println("Результат деления: " + numResult);
                        break;
                    case 2:
                        // Задание 2. Условия №4
                        int num1, num2;
                        System.out.println("Введите 2 числа: ");
                        num1 = scanner.nextInt();
                        num2 = scanner.nextInt();
                        String result;
                        Task2Condition4 makeDecisionHelper = new Task2Condition4();
                        result = makeDecisionHelper.makeDecision(num1, num2);
                        System.out.println(result);
                        break;
                    case 3:
                        // Задание 2. Условия №6
                        int number1, number2, number3;
                        boolean resultCond6;
                        System.out.println("Введите 3 числа: ");
                        number1 = scanner.nextInt();
                        number2 = scanner.nextInt();
                        number3 = scanner.nextInt();
                        Task2Condition6 sum3Helper = new Task2Condition6();
                        resultCond6 = sum3Helper.sum3(number1, number2, number3);
                        System.out.println(resultCond6);
                        break;
                    case 4:
                        // Задание 2. Условие №8
                        int number;
                        String resultCond8;
                        System.out.println("Введите возраст: ");
                        number = scanner.nextInt();
                        if (number <= 0) {
                            System.out.println("Возраст должен быть больше нуля");
                            return;
                        }
                        Task2Condition8 ageHelper = new Task2Condition8();
                        resultCond8 = ageHelper.age(number);
                        System.out.println(resultCond8);
                        break;
                    case 5:
                        // Задание 2. Условия №10.
                        String weekday;
                        System.out.println("Введите день недели (со строчной буквы): ");
                        weekday = scanner.nextLine();
                        Task2Condition10 printDaysHelper = new Task2Condition10();
                        printDaysHelper.printDays(weekday);
                        break;
                    default:
                        System.out.println("Неверный выбор");
                        break;
                }
                break;
            case 3:
                int inChoice3;
                System.out.println("Выберите номер задание: \n" +
                        "2. 1\n" +
                        "4. 2\n" +
                        "6. 3\n" +
                        "8. 4\n" +
                        "10. 5\n");
                inChoice3 = scanner.nextInt();
                switch(inChoice3) {
                    case 1:
                        // Задание 3. Циклы №2.
                        int numberCycle2;
                        String result;
                        System.out.println("Введите число: ");
                        numberCycle2 = scanner.nextInt();
                        if (numberCycle2 < 0) {
                            System.out.println("Число должно быть неотрицательным");
                            return;
                        }
                        Task3Cycle2 reverseListNumsHelper = new Task3Cycle2();
                        result = reverseListNumsHelper.reverseListNums(numberCycle2);
                        System.out.println("Результат: " + result);
                        break;
                    case 2:
                        // Задание 3. Циклы №4
                        int numOne, numTwo;
                        int resultCycle4;
                        System.out.println("Введите основание числа: ");
                        numOne = scanner.nextInt();
                        System.out.println("Введите степень числа");
                        numTwo = scanner.nextInt();
                        if (numOne < 0 || numTwo < 0) {
                            System.out.println("Основание и степень должны быть неотрицательными");
                            return;
                        }
                        Task3Cycle4 powHelper = new Task3Cycle4();
                        resultCycle4 = powHelper.pow(numOne, numTwo);
                        System.out.println("Результат возведения числа " + numOne + " в степень " + numTwo
                                + " = " + resultCycle4);
                        break;
                    case 3:
                        // Задание 3. Циклы №6
                        int numberCycle6;
                        System.out.println("Введите число: ");
                        numberCycle6 = scanner.nextInt();
                        if (numberCycle6 < 0) {
                            System.out.println("Число должно быть неотрицательным");
                            return;
                        }
                        Task3Cycle6 equalNumHelper = new Task3Cycle6();
                        boolean resultCycle6 = equalNumHelper.equalNum(numberCycle6);
                        System.out.println("Ответ: " + resultCycle6);
                        break;
                    case 4:
                        // Задание 3. Циклы №8
                        int numberCycle8;
                        System.out.println("Введите высоту треугольника: ");
                        numberCycle8 = scanner.nextInt();
                        if (numberCycle8 < 1) {
                            System.out.println("Высота должна быть положительной");
                            return;
                        }
                        Task3Cycle8 leftTriangleHelper = new Task3Cycle8();
                        System.out.println("Результат: ");
                        leftTriangleHelper.leftTriangle(numberCycle8);
                        break;
                    case 5:
                        // Задание 3. Циклы №10
                        Task3Cycle10 guessGameHelper = new Task3Cycle10();
                        guessGameHelper.guessGame(scanner);
                        break;
                    default:
                        System.out.println("Неверный выбор");
                        break;
                }
                break;
            case 4:
                int inChoice4;
                System.out.println("Выберите номер задание: \n" +
                        "2. 1\n" +
                        "4. 2\n" +
                        "6. 3\n" +
                        "8. 4\n" +
                        "10. 5\n");
                inChoice4 = scanner.nextInt();
                switch(inChoice4) {
                    case 1:
                        // Задание 4. Массивы №2
                        System.out.println("Введите размер массива: ");
                        int size = scanner.nextInt();
                        if (size < 1) {
                            System.out.println("Размер массива должен быть положительным");
                            return;
                        }
                        int[] arr = new int[size];
                        System.out.print("Полученный массив: ");
                        for (int i = 0; i < size; i++) {
                            arr[i] = random.nextInt(11);
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                        System.out.print("Введите число для поиска: ");
                        int x = scanner.nextInt();
                        Task4Array2 findLastHelper = new Task4Array2();
                        int result = findLastHelper.findLast(arr, x);
                        System.out.println("Индекс последнего вхождения числа " + x + " в массив: " + result);
                        break;
                    case 2:
                        // Задание №4. Массивы 4
                        System.out.println("Введите размер массива: ");
                        int sizeArray4 = scanner.nextInt();
                        if (sizeArray4 < 1) {
                            System.out.println("Размер массива должен быть положительным");
                            return;
                        }
                        int[] arrArray4 = new int[sizeArray4];
                        fillArray(arrArray4, sizeArray4);
                        System.out.print("Полученный массив: ");
                        printArray(arrArray4);
                        System.out.println("Введите значение для вставки: ");
                        int xArray4 = scanner.nextInt();
                        if (xArray4 < 1) {
                            System.out.println("Значение должно быть неотрицательным");
                            return;
                        }
                        System.out.println("Введите позицию для числа " + xArray4);
                        int pos = scanner.nextInt();
                        if (pos < 0 || pos > arrArray4.length) {
                            System.out.println("Позиция для числа должна быть в диапазоне массива");
                            return;
                        }
                        Task4Array4 addHelper = new Task4Array4();
                        int[] resultArray4 = addHelper.add(arrArray4, xArray4, pos);
                        System.out.print("Результат: ");
                        printArray(resultArray4);
                        break;
                    case 3:
                        // Задание №4. Массивы 6
                        Task4Array6 reverseHelper = new Task4Array6();
                        int sizeArray6;
                        System.out.print("Введите размер массива: ");
                        sizeArray6 = scanner.nextInt();
                        if (sizeArray6 < 1) {
                            System.out.println("Размер массива должен быть положительным");
                            return;
                        }
                        int[] arrArray6 = new int[sizeArray6];
                        arrArray6 = fillArray(arrArray6, sizeArray6);
                        System.out.print("Исходный массив: ");
                        printArray(arrArray6);
                        reverseHelper.reverse(arrArray6);
                        System.out.print("Перевёрнутый массив: ");
                        printArray(arrArray6);
                        break;
                    case 4:
                        // Задание №4. Массивы 8
                        Task4Array8 concatHelper = new Task4Array8();
                        int sizeArray81, sizeArray82;
                        System.out.println("Введите размер 1-го массива: ");
                        sizeArray81 = scanner.nextInt();
                        if (sizeArray81 < 1) {
                            System.out.println("Размер массива должен быть положительным");
                            return;
                        }
                        int[] arr1 = new int[sizeArray81];
                        arr1 = fillArray(arr1, sizeArray81);
                        System.out.print("Полученный массив: ");
                        printArray(arr1);
                        System.out.println("Введите размер 2-го массива: ");
                        sizeArray82 = scanner.nextInt();
                        if (sizeArray82 < 1) {
                            System.out.println("Размер массива должен быть положительным");
                            return;
                        }
                        int[] arr2 = new int[sizeArray82];
                        arr2 = fillArray(arr2, sizeArray82);
                        System.out.print("Полученный массив: ");
                        printArray(arr2);
                        int[] arrResult = concatHelper.concat(arr1, arr2);
                        System.out.print("Результат объединения: ");
                        printArray(arrResult);
                        break;
                    case 5:
                        // Задание №4. Массивы 10
                        int sizeArray10;
                        System.out.print("Введите размер массива: ");
                        sizeArray10 = scanner.nextInt();
                        if (sizeArray10 < 1) {
                            System.out.println("Размер массива должен быть положительным");
                            return;
                        }
                        int[] arrArray10 = new int[sizeArray10];
                        arr = fillArray(arrArray10, sizeArray10);
                        System.out.print("Исходный массив: ");
                        printArray(arr);
                        Task4Array10 deleteNegativeHelper = new Task4Array10();
                        int[] resultArr = deleteNegativeHelper.deleteNegative(arr);
                        System.out.print("Изменённый массив: ");
                        printArray(resultArr);
                        break;
                    default:
                        System.out.println("Неверный выбор");
                        break;
                }
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }

    }
}