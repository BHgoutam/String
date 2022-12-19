package String;

import java.util.Scanner;

public class DeleteAllOccurrenceCharFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();

        char [] arr= str.toCharArray();
        int size =arr.length;
        char key =sc.next().charAt(0);

        int  i=0;
        String res ="";
        while (i!=size){
            if(arr[i]!= key){
                res += arr[i];

            }
            i++;
        }
        System.out.println(res);
    }
}
