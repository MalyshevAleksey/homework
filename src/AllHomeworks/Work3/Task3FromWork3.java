package AllHomeworks.Work3;
import AllHomeworks.Work2.Task1FromWork2;

import static AllHomeworks.Work1.Task1FromWork1.sysInInt;
import static AllHomeworks.Work2.Task1FromWork2.createArray;
import static AllHomeworks.Work3.Task1FromWork3.*;
import static AllHomeworks.Work3.Task2FromWork3.sumElementsColumns;

public class Task3FromWork3 {
    public static void main(String[] args) {
        Task1FromWork2 applicationWork2Task1 = new Task1FromWork2();
        Task3FromWork3 applicationWork3Task3 = new Task3FromWork3();
        int length = sysInInt("Введите количество строк и столбцов (одно число): ");
        int rndRangeMin = 0, rndRangeMax = 99;
        int[][] array = createAndFillTDA(length, rndRangeMin, rndRangeMax);
        printTwoDimensionalArray(array);
        int [] resultAllParties = applicationWork3Task3.allResult(sumElementsColumns(array, false),
                                                                  sumElementsRows(array, false),
                                                                  sumElementsDiagonal(array, false));
        isItMagicSquare(resultAllParties);
    }
    public static void isItMagicSquare(int [] array) {
        boolean flag = true;
        int i = 0;
        int copy = array[0];
        while ((i < array.length) && (flag)) {
            if (copy != array[i]) {
                flag = false;
            }
            i++;
        }
        if (flag) {
            System.out.println("Матрица является магическим квадратом!");
        }
        else {
            System.out.println("Матрица не является магическим квадратом!");
        }
    }
    public static int[] allResult(int [] columns, int [] rows, int [] diagonal) {
        int [] result = createArray(columns.length + rows.length + 2);
        int count = 0;
        for(int i = 0; i < columns.length; i++) {
            result[i] = columns[i];
            count ++;
        }
        for(int i = 0; i < rows.length; i++) {
            result[count] = rows[i];
            count ++;
        }
        for(int i = 0; i < diagonal.length; i++) {
            result[count] = diagonal[i];
            count ++;
        }
        return result;
    }
    public static int[] sumElementsDiagonal(int [][] array, boolean flag) {
        int summMainDiagonal = 0, summSideDiagonal = 0;
        int[] result = createArray(2);
        for(int i = 0; i < array.length; i++) {
            summMainDiagonal += array[i][i];
            for(int j = 0; j < array.length; j++) {
                if (i + j == array.length - 1) {
                    summSideDiagonal += array[i][j];
                }
            }
        }
        result[0] = summMainDiagonal;
        result[1] = summSideDiagonal;
        if (flag) {
            System.out.printf("Сумма элементов главной диагонали: %d", result[0]);
            System.out.printf("Сумма элементов побочной диагонали: %d", result[1]);
        }
        return result;
    }
}
