package AllHomeworks.Work4;
import static AllHomeworks.Work4.Task1FromWork4.sysInStrTypeArrayChar;
public class Task3FromWork4 {
    public static void main(String args[]) {
        char [] charArray = sysInStrTypeArrayChar("Введите строчку: ");
        char [] onlyNumber = arrayCharOnlyNumber(charArray);
        printCharArray(onlyNumber);
    }
    public static char [] arrayCharOnlyNumber(char [] charArray) {
        String string;
        char [] arrayNumbersInString = new char[countNumbersInString(charArray)];
        int index = 0;
        for(char ch: charArray) {
            string = String.valueOf(ch);
            if (string.matches("[0-9]")) {
                arrayNumbersInString[index] = ch;
                index++;
            }
        }
        return arrayNumbersInString;
    }
    public static void printCharArray(char [] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]+" ");
        }
    }
    public static int countNumbersInString(char [] charArray) {
        String string;
        int count = 0;
        for(char ch: charArray) {
            string = String.valueOf(ch);
            if (string.matches("[0-9]")) {
                count++;
            }
        }
        return count;
    }
}
