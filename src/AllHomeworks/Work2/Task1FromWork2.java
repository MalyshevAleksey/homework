package AllHomeworks.Work2;
import java.util.Random;
public class Task1FromWork2 {
    public static void main(String[] args) {
        Task1FromWork2 application = new Task1FromWork2();
        int length = 5;
        int rndRangeMin = 10;
        int rndRangeMax = 100;
        int[] array = application.createAndFillArrayByRnd(length, rndRangeMin, rndRangeMax);
        application.printIntArray(array);
    }
    public static int[] createAndFillArrayByRnd(int length, int rndRangeMin, int rndRangeMax) {
        int[] array = createArray(length);
        array = fillArrayByRnd(array, rndRangeMin, rndRangeMax);
        return array;
    }
    public static int [] createArray(int length) {
        int[] array = new int[length];
        return array;
    }
    public static int [] fillArrayByRnd(int [] array, int rndRangeMin, int rndRangeMax) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(rndRangeMin, rndRangeMax+1);
        }
        return array;
    }
    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
    }
}
