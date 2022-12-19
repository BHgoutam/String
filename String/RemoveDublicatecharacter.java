package String;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDublicatecharacter {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Approch 1

        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char) c));
        System.out.println(sb1);

        //Approch 2
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = str.indexOf(ch, i + 1);
            if (index == -1) {
                sb2.append(ch);

            }
        }
        System.out.println(sb2);




        //Approch 3

        char[] arr = str.toCharArray();

        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            boolean repated = false;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    repated = true;
                    break;
                }
            }
            if (!repated) {
                sb3.append(arr[i]);
            }
        }
        System.out.println(sb3);

        // Approch 4

        StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet(); // set does not allow dublicate value
        for (int i = 0; i < str.length(); i++) {

            set.add(str.charAt(i));
        }
        for (Character c : set) {
            sb4.append(c);
        }
        System.out.println(sb4);
    }
}