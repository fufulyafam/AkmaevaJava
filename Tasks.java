import java.io.*;
import java.util.*;

public class Tasks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1) Составить алгоритм: если введенное число больше 7, то вывести “Привет”");
        System.out.println("2) Составить алгоритм: если введенное имя совпадает с Вячеслав, " +
                "то вывести “Привет, Вячеслав”, если нет, то вывести Нет такого имени");
        System.out.println("3) Составить алгоритм: на входе есть числовой массив, " +
                "необходимо вывести элементы массива кратные 3");
        System.out.println("Введите номер задания");
        char r = br.readLine().charAt(0);

        switch (r) {
            case '1':
                Task1();
                break;
            case '2':
                Task2();
                break;
            case '3':
                Task3();
                break;
            default:
                System.out.print("Error");
                break;
        }
    }
    public static void Task1 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        int checkNumber = scanner.nextInt();
        if (checkNumber > 7) {
            System.out.println("Привет");
        } else if (checkNumber <= 7) {
            System.out.println("Вы ввели число <= 7");
        } else {
            System.out.println("Вы ввели не число. Повторите");
        }
    }
    public static void Task2 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String enterName = scanner.nextLine();
        String originalName = "Вячеслав";
        if (enterName == originalName) {
            System.out.println("Привет, Вячеслав!");
        } else {
            System.out.println("Нет такого имени");
        }
    }
    public static void Task3 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину числового массива");
        int size = scanner.nextInt();
        int array[] = new int[size];
        int tempArray[] = new int[size];
        System.out.println("Введите элементы числового массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 3 == 0 && array[i] != 0) {
                tempArray[i] = array[i];
            }
        }
        int[] printArray = Arrays.stream(tempArray).filter(num -> num != 0).toArray();
        System.out.println("Элементы массива, кратные 3: " + Arrays.toString(printArray));
    }
}
