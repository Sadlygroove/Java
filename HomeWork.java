import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) { // выводит результат примера
        int a = 2;
        int b = 4;
        int c = 8;
        int d = 2;
        int res = a*(b+(c/d));
        System.out.println("Результат " +res);


    }
    public static void bool (int x, int y) {
        System.out.println("Введите х"); // программа определит соответсвуют ли введенные числа параметру bool
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("Введите y");
        y = scanner.nextInt();
        boolean bool = true;
        int a = x+y;
        bool = a >= 10 && a <= 20;
        if (bool) System.out.println("Верно");
        if (!bool) System.out.println("Не верно");
    }
    public static void number (int e) {
    System.out.println("Введите любое число!"); // программа определит какое число введено в систему и выведет положительное или отрицательное
    Scanner scanner = new Scanner(System.in);
    e = scanner.nextInt();
    if (e >= 0){
        System.out.println("Число положительное");
    } else { System.out.println("Число отрицательное"); }
    }
    public static void positive (int f) {
        System.out.println("Введите число"); // выводит true or false в зависимости от введенного числа
        Scanner scanner = new Scanner(System.in);
        f = scanner.nextInt();
        boolean bool = false;
        bool = f >= 0;
        if (bool) System.out.println("Положительное");
        if (!bool) System.out.println("Отрицательное");
    }
    public static void name () { // Выводит ваше имя
        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет "+ name);
    }
    {

        public static void year (String[] args) { // считает високосный год или нет
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int a = year%4;
        if (year % 4 == 0) {
            if (year % 100 != 0);
            System.out.println("Год високосный");
        } else if (year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
        scanner.close();
    }


    }

}
