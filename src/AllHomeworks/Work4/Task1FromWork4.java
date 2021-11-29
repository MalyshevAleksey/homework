package AllHomeworks.Work4;
import static AllHomeworks.Work1.Task1FromWork1.sysInInt;
import java.util.Scanner;

public class Task1FromWork4 {
    public static void main(String args[]) {
        char [] charArray = sysInStrTypeArrayChar("Введите строчку: ");
        int countOutSymbol = sysInInt("Введите максимальное к-во выводимых символов: ");
        sysOutChars(charArray, countOutSymbol);
    }
    public static char[] sysInStrTypeArrayChar(String outScreen) {
        System.out.print(outScreen);
        Scanner in = new Scanner(System.in);
        char [] string = in.next().toCharArray();
        return string;
    }
    public static void sysOutChars(char [] ch, int countOutSymbol) {
        boolean flag = true;
        while (flag) {
            if (countOutSymbol <= ch.length) {
                for (int i = 0; i < countOutSymbol; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(ch[j]);
                    }
                    System.out.println();
                }
                flag = false;
            } else {
                System.out.println("Введенное к-во выводимых символов больше длины слова");
                countOutSymbol = sysInInt("Введите число еще раз: ");
            }
        }
    }
}
