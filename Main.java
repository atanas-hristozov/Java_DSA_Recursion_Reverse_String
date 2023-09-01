import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(stringReverse(input));
        System.out.println(stringReverse02(input));

    }

    private static String stringReverse(String text) {
        int length = text.length();
        if(length == 0){
            return text;
        }
        char lastCharacter = text.charAt(length-1);
        String withoutLastChar = stringReverse(text.substring(0, length-1));
        return lastCharacter + withoutLastChar;
    }
    private static String stringReverse02(String text) {
        int length = text.length();
        if(length == 0){
            return text;
        }
        return stringReverse(text.substring(1,length)) + text.charAt(0);
    }
}