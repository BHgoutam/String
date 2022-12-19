package String;

import java.util.Scanner;

public class Reversebystringbulderandbuffer {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();


        StringBuffer sb= new StringBuffer(str);
        System.out.println("using string buffer method");
        System.out.println(sb.reverse());

        StringBuilder sbl= new StringBuilder(str);
        System.out.println("using string builder method");
        System.out.println(sbl.reverse());

    }
}
