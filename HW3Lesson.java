/**
 *
 * Home work 3
 * @author Alexander Marchishin
 * @version 21.01.2019 16:38
 */

import java.util.Scanner;

public class HW3Lesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Your task is to guess the number");
        int number = (int) (Math.random() * 9);
        do {
            System.out.println("Guess the number from 0 to 9");
            int input_number = scanner.nextInt();
            if (i == 2) {
                break;
            } else if (input_number == number) {
                System.out.println("You win!!!");
            } else if (input_number > number) {
                System.out.println("Guess number is less");
                i++;
            } else if (input_number < number) {
                System.out.println("Guess number is more");
                i++;
            }
        }
            while (true);
                System.out.println("Repeat? Yes = 1 or No = 0");
                int a = scanner.nextInt();
                if (a == 1) {
                    return;
                } else if (a == 0) {
                    System.out.println("Good bye!");
                } else {
                    System.out.println("incorrect input");
                }
            }
        }





