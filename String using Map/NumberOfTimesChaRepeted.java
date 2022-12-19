import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfTimesChaRepeted {
    public static void main(String[] args) {
        Map<Character,Integer> map =new HashMap(); //creating map object
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str  =sc.nextLine();

        char[] chars = str.toCharArray();
        for(char ch:chars){ //checking for each character
            if(!map.containsKey(ch)) // checking weather map contains key or not
            {
                map.put(ch,1);

            }else {
                int value =map.get(ch); // if key is present in map then we get key value and increase  by 1
                map.put(ch,value+1);
            }
        }
        System.out.println(map);
    }
}
