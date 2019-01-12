package Year;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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


