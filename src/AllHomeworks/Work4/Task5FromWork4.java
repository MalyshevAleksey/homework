package AllHomeworks.Work4;

import static AllHomeworks.Work4.Task1FromWork4.sysInStrTypeArrayChar;

public class Task5FromWork4 {
    public static void main(String[] args){
        char [] charArray = sysInStrTypeArrayChar("Введите строчку: ");
        String result = uniqueSymbolsInStr(charArray);
        System.out.println(result);
    }
    public static String uniqueSymbolsInStr(char [] charArray){
        StringBuffer buffer = new StringBuffer();
        for (char ch: charArray){
            if (buffer.toString().contains(String.valueOf(ch)) == false){
                buffer.append(ch);
            }
        }
        String result = buffer.toString();
        return result;
    }

}