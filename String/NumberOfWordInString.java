package String;

import java.util.Scanner;

public class NumberOfWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        String st[] =str.split(" ");
        System.out.println("Word present in string " + st.length);
    }
}
