import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringContainUniquecharacter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();
         char[] arr= str.toCharArray();
         int size=str.length();

        Map<Character,Integer> map =new HashMap<>();
        int i=0;

        while(i!=size){

            if(map.containsKey(arr[i]) == false)
            {
                map.put(arr[i],1);
            }
            else {

                int oldval =map.get(arr[i]);
                int newval =oldval+1;
                map.put(arr[i],newval);

            }
            i++;

        }
        Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
        for(Map.Entry<Character,Integer> data : hmap)
        {

         if(data.getValue()>1){
          System.out.println("does not contain unique character");
      }
        }
        System.out.println("Contain unique character");
    }
}
