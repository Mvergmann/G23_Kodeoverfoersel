package TerningeSpil;

import java.util.Scanner;

public class Input {

        public static String enter()
        {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            return s;
        }

        public static String name()
        {
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();
            return name;
        }
        public static int antalslag()
        {
            Scanner antal = new Scanner(System.in);
            int testantal = antal.nextInt();
            return testantal;
        }
    }


