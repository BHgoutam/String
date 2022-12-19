import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Maximumoccurcharacter {


        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            String str= sc.nextLine();
            char[] arr= str.toCharArray();
            int size=str.length();

            Map<Character,Integer> map =new LinkedHashMap<>();
            int i=0;

            while(i!=size){

                if(!map.containsKey(arr[i]))
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
            int maxval =0;
            char maxkey = '0';
            for(Map.Entry<Character,Integer> data : hmap){

                if(data.getValue()>maxval){
             maxval = data.getValue();
             maxkey = data.getKey();

                }
            }
            System.out.print(maxkey);
            System.out.print(maxval);
        }
    }
