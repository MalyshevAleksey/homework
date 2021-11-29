package AllHomeworks.Work2;
public class Task3FromWork2 {
    public static void main(String[] args) {
        Task1FromWork2 application = new Task1FromWork2();
        int length = 5;
        int rndRangeMin = -50;
        int rndRangeMax = 50;
        int[] array = application.createAndFillArrayByRnd(length, rndRangeMin, rndRangeMax);
        application.printIntArray(array);
        System.out.printf("Maximum: %d\n", isMax(array));
        System.out.printf("Maximum: %d\n", isMin(array));
    }
    public static int isMax(int [] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max=array[i];
            }
        }
        return max;
    }
    public static int isMin(int [] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min) {
                min=array[i];
            }
        }
        return min;
    }
}
