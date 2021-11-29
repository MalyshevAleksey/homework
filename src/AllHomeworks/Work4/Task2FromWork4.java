package AllHomeworks.Work4;
import static AllHomeworks.Work4.Task1FromWork4.sysInStrTypeArrayChar;
public class Task2FromWork4 {
    public static void main(String args[]) {
        char [] charArray = sysInStrTypeArrayChar("Введите строчку: ");
        onlyUpperLetter(charArray);
    }
    public static void onlyUpperLetter(char [] charArray) {
        String onlyUpper = "";
        for(char letter:charArray){
            if(Character.isUpperCase(letter)) {
                onlyUpper += letter;
            }
        }
        System.out.print(onlyUpper);
    }
}