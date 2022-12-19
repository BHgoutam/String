import java.util.*;


public class firstrepeatingcharacter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            int size = str.length();

            Map<Character, Integer> map = new LinkedHashMap<>();
            int i = 0;

            while (i != size) {

                if (!map.containsKey(arr[i])) {
                    map.put(arr[i], 1);
                } else {

                    int oldval = map.get(arr[i]);
                    int newval = oldval + 1;
                    map.put(arr[i], newval);

                }
                i++;

            }
            Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
            char ch = 0;
            for (Map.Entry<Character, Integer> data : hmap) {

                if (data.getValue() > 1) {

                    ch = data.getKey();
                     break;

                }
            }

            System.out.println(ch);
        }
    }

