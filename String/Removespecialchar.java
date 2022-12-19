package String;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Removespecialchar {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String  str =sc.nextLine();

        String  plainstring = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plainstring);
    }
}
