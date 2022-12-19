public class reverseword {
    public static void main(String[] args) {
        String st ="";
        String s ="bhagwat goutam i love you";
        String a[]= s.split("");
        for (int i=a.length-1;i>=0;i--){
            st = st+a[i];
        }
        System.out.println(st);
    }
}
