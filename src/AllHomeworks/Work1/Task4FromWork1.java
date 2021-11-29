package AllHomeworks.Work1;
import static AllHomeworks.Work1.Task3FromWork1.isPrimeNumber;
public class Task4FromWork1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int num = 1000; num<=2000; num++) {
            boolean flag = isPrimeNumber(num);
            if (flag) {
                sum+=num;
            }
        }
        System.out.println(sum);
    }
}
