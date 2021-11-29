package AllHomeworks.Work3;
import AllHomeworks.Work2.Task1FromWork2;

import java.util.Random;
import static AllHomeworks.Work1.Task1FromWork1.sysInInt;
import static AllHomeworks.Work2.Task1FromWork2.createArray;

public class Task1FromWork3 {
    public static void main(String[] args) {
        Task1FromWork2 application = new Task1FromWork2();
        int length = sysInInt("Введите количество строк и столбцов (одно число): ");
        int rndRangeMin = 0, rndRangeMax = 99;
        int[][] array = createAndFillTDA(length, rndRangeMin, rndRangeMax);
        printTwoDimensionalArray(array);
        sumElementsRows(array, true);
    }
    public static int[][] createAndFillTDA(int length, int rndRangeMin, int rndRangeMax) {
        int[][] array = new int[length][length];
        Random rnd = new Random();
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                array[i][j] = rnd.nextInt(rndRangeMin, rndRangeMax+1);
            }
        }
        return array;
    }
    public static void printTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int [] sumElementsRows(int [][] array, boolean flag) {
        int summ = 0;
        int[] result = createArray(array.length);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                summ += array[i][j];
            }
            result[i] = summ;
            summ = 0;
        }
        if (flag) {
            for (int i = 0; i < array.length; i++) {
                System.out.printf("Сумма элементов %d-й строки: %d\n", i+1, result[i]);
            }
        }
        return result;
    }
}
