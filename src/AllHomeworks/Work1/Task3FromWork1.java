package AllHomeworks.Work1;
import static AllHomeworks.Work1.Task1FromWork1.sysInInt;
public class Task3FromWork1 {
    public static void main(String[] args) {
        Task3FromWork1 application = new Task3FromWork1();
        int num = sysInInt("Введите число ");
        boolean flag = isPrimeNumber(num);
        if (flag) {
            System.out.println("Число простое!");
        }
        else {
            System.out.println("Число не является простым!");
        }
    }
    public static boolean isPrimeNumber(int num) {
        int count = 0;
        boolean flag = false;
        if (num==2) {
            flag = true;
        }
        else if (num%2!=0) {
            for(int i = 1; i<=num; i+=2) {
                if (num%i==0) {
                    count+=1;
                }
            }
            if (count==2) {
                flag = true;
            }
        }
        return flag;
    }
}
