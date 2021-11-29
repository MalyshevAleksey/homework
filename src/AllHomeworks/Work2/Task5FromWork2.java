package AllHomeworks.Work2;
import static AllHomeworks.Work2.Task3FromWork2.isMax;
import static AllHomeworks.Work2.Task3FromWork2.isMin;
public class Task5FromWork2 {
    public static void main(String[] args) {
        Task1FromWork2 applicationTask1 = new Task1FromWork2();
        Task4FromWork2 applicationTask4 = new Task4FromWork2();
        int maxIndex = 0, minIndex = 0;
        double average = 0;
        int length = 5;
        int rndRangeMin = -50;
        int rndRangeMax = 50;
        int[] array = applicationTask1.createAndFillArrayByRnd(length, rndRangeMin, rndRangeMax);
        applicationTask1.printIntArray(array);
        int max = isMax(array);
        int min = isMin(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i]==max) {
                max=array[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==min) {
                min=array[i];
                minIndex = i;
            }
        }
        System.out.print("\n");
        if (minIndex > maxIndex) {
            minIndex += maxIndex;
            maxIndex = minIndex - maxIndex;
            minIndex -= maxIndex;
        }
        for (int i = minIndex; i <= maxIndex; i++) {
            average += array[i];
        }
        average /= maxIndex - minIndex + 1;
        System.out.println(average);
    }
}
