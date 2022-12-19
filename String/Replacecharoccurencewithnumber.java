package String;

import java.util.Scanner;

public class Replacecharoccurencewithnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str  =sc.nextLine();
        System.out.println("enter character to replace");
        char chartoreplace = sc.next().charAt(0);

        if(str.indexOf(chartoreplace)==-1){
            System.out.println("give charcter is not present in string");

        }
        int count=1;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch == chartoreplace){
                str =str.replaceFirst(String.valueOf(chartoreplace),String.valueOf(count)); // it replace the first occurence of char into number
                count++;

            }
        }
        System.out.println(str);
    }
}
