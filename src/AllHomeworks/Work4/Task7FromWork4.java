package AllHomeworks.Work4;

import java.util.Scanner;
import static AllHomeworks.Work4.Task6FromWork4.wordWithMaxCountUniqSymbols;

public class Task7FromWork4 {
    public static void main(String[] args) {
        String str = sysInStrTypeString("Введите слова через пробел: ");
        System.out.println(wordWithMaxCountUniqSymbols(str.trim().split("\\s+")));
    }
    public static String sysInStrTypeString(String outScreen) {
        System.out.print(outScreen);
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }
}
