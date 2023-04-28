import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("Введите число:");
        firstTask();
        System.out.println("Task 2");
        System.out.println("Введите имя");
        secondTask();
        System.out.println("Task 3");
        thirdTask();
    }

    public static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 7) {
            System.out.println("Привет");
        }
    }

    public static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        String value2 = scanner.nextLine();
        if (value2.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int size = scanner.nextInt();
        int[] mas = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива");
            mas[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int currentValue = mas[i];
            if (currentValue % 3 == 0) {
                System.out.print(currentValue + " ");
            }
        }
    }

}