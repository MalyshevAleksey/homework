package AllHomeworks.Work4;

import java.util.Scanner;
import static AllHomeworks.Work4.Task5FromWork4.uniqueSymbolsInStr;

public class Task6FromWork4 {
    public static void main(String[] args) {
        String[] arrayStr = arrayWordsStr();
        System.out.println(wordWithMaxCountUniqSymbols(arrayStr));
    }
    public static String[] arrayWordsStr() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите к-во слов: ");
        int countWords = in.nextInt();
        String[] arrayWords = new String[countWords];
        for (int i = 0; i < countWords; i++){
            System.out.printf("Напишите %d-е слово: ", i+1);
            arrayWords[i] = in.next();
        }
        return arrayWords;
    }
    public static String wordWithMaxCountUniqSymbols(String[] arrayStr) {
        String maxUniqWord = new String();
        String[] arrayUniqueStr = new String[arrayStr.length];
        int index = 0;
        for (String string: arrayStr) {
            arrayUniqueStr[index] = uniqueSymbolsInStr(string.toCharArray());
            index++;
        }
        for (int i = 1; i < arrayUniqueStr.length; i++){
            if (arrayUniqueStr[i].length() > arrayUniqueStr[i-1].length()) {
                maxUniqWord = arrayStr[i];
            }
            else {
                maxUniqWord = arrayStr[i-1];
            }
        }
        return maxUniqWord;
    }
}
