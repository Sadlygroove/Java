import java.util.Arrays;

/**
* Java LVL one, lesson two
*
* @author Alexander Marchishin
* @version data 15.01.2019
 */

public class HW2Lesson {

    public static void main(String[] args) {}
// #1
    public static void invert() {
        int[] arr = {1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] != 0) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
        }
// #2
    public static void fill(){
        int[] arr = new int[8];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }
// #3
    public static void rename(){
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
// #4
    public static void fillMatrix() {
        int [][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = arr[i][j] + 1;
            }
            for (int a = 4; i >= 0; i--) {
                for (int b = 4; b >= 0; b-- ){
                    arr[a][b] = arr [a][b] -1;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

}
