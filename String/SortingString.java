package String;

import java.util.Arrays;
import java.util.Scanner;

public class SortingString {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String  str =sc.nextLine();
        char[] arr = str.toCharArray(); // providing string into array charcter;
        char temp;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println(new String(arr));

        // Approch 2

        char[] charArray =str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}
