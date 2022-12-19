import java.util.*;


public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();
        char[] arr= str.toCharArray();
        int size=str.length();

        Map<Character,Integer> map =new LinkedHashMap<>(); // DECLEARING LinkedhasMAP  to store data sequentially
        int i=0;

        while(i!=size){

            if(!map.containsKey(arr[i])) // checking weather key is present or not
            {
                map.put(arr[i],1); // if not then we need to add value to map;
            }
            else {

                int Old_value = map.get(arr[i]); // if map contain key then we need to get key value
                int New_value = Old_value + 1; // we have to add old key value to 1;
                map.put(arr[i],New_value);   // then update the key with new value ;

            }
                i++; // increasing the i value;

        }
        Set<Map.Entry<Character,Integer>> hmap = map.entrySet();  // Using entrySet() to get the entry's of the map
        for(Map.Entry<Character,Integer> data : hmap){ //

            if(data.getValue()==1){
                System.out.print(data.getKey());
                break;
            }
        }
    }
}