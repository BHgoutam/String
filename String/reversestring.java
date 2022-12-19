package String;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();
       Arrays.sort(s.toCharArray());
        String rev="";
        for(int i=s.length()-1;i>=0;i--){

            rev=rev+s.charAt(i);

        }
        System.out.println(rev);
    }
}
