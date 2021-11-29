package AllHomeworks.Work2;
public class Task2FromWork2 {
    public static void main(String[] args) {
        int sum = 0;
        Task1FromWork2 application = new Task1FromWork2();
        int length = 5;
        int rndRangeMin = -50;
        int rndRangeMax = 50;
        int[] array = application.createAndFillArrayByRnd(length, rndRangeMin, rndRangeMax);
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0) {
                sum+=array[i];
            }
        }
        application.printIntArray(array);
        System.out.print("\n"+sum);
    }
}
