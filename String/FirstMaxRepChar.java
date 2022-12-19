package String;

import java.util.Scanner;

public class FirstMaxRepChar {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();
        s=s.replaceAll("\\s",""); // it remove all the space between words in string
         int[] arr =new int[127]; // set all array value to 0;
         for(int i=0;i<s.length();i++){

             arr[s.charAt(i)]=arr[s.charAt(i)]+1; //taking ascci value  and converting into  thr valur to 0;
             // arr['a'] = 0+1;
             // arr['b'] = 0+1;
             // arr['b'] = 1+1;
             // arr['b'] = 2+1;



         }
         int max=-1;
         char c='0';
        for(int i=0;i<s.length();i++){

            if(max<arr[s.charAt(i)])
            // -1<1 true
                //-1<2 ture
            {

                max=arr[s.charAt(i)]; //max = 1, max= 2
                c=s.charAt(i); // c=abb
            }
        }
        System.out.println("maximun repeated charcter is "+ c);


    }
}
