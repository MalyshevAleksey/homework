package AllHomeworks.Work1;
import java.util.Scanner;
public class Task1FromWork1 {
    public static void main(String[] args) {
        Task1FromWork1 application = new Task1FromWork1();
        int num = sysInInt("Введите шестизначное число ");
        boolean flag = isLuckyNumber(num);
        if (flag) {
            System.out.println("Число счастливое!");
        }
        else {
            System.out.println("Число несчастливое или не шестичзначное!");
        }
    }
    public static boolean isLuckyNumber(int num) {
        String str = num+"";
        boolean flag = false;
        int numEnd = (num % 10) + (num % 100) / 10 + (num % 1000) / 100;
        int numStart = ((num / 100000) + (num / 10000) % 10 + (num / 1000) % 10);
        if (str.length() == 6) {
            if (numStart == numEnd) {
                flag = true;
            }
        }
        return flag;
    }
    public static int sysInInt(String str) {
        System.out.print(str);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
}