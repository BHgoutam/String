package String;

public class RotationalString {
    public static void main(String[] args) {

        String s1 = "ARADHYA";
        String keystring ="RAADHYA";
        String newstring =s1.concat(s1);

        if(newstring.contains(keystring)){

            System.out.println("Rotational string");
        }
        else {
            System.out.println("not rotational string");
        }


    }
}
