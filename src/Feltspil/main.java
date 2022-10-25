package Feltspil;

import TerningeSpil.Input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to the game");
        System.out.println("what is the first players name?");
        String navn1 = scan.nextLine();
        Player player1 = new Player(navn1, 0);
        System.out.println("what is the second players name?");
        String navn2 = scan.nextLine();
        Player player2 = new Player(navn2, 0);
        System.out.println("welcome to the game " + player1.toString() + " and " + player2.toString());
        Turn p1tur = new Turn();
        Turn p2tur = new Turn();
        TileList Tlmain = new TileList();
        Language Langmain = new Language();

        while (player1.GetSaldo() < 3000 && player2.GetSaldo() < 3000) {
            System.out.println(navn1 + " starter med at slå terningerne, tryk enter for at slå");
            Input.enter();
            int roll1 = p1tur.tur();
            System.out.println("du har slået " + roll1);
            System.out.println("det vil sige du lander på felt " + Tlmain.getTitle(roll1));
            System.out.println(Tlmain.getFlavourText(roll1));
            System.out.println("du har fået" + Tlmain.getValue(roll1));
            player1.AddToSaldo(Tlmain.getValue(roll1));
            System.out.println("du er nu op på" + player1.GetSaldo() + " point");
            if (roll1 == 10) {
                System.out.println(Langmain.extraturn());
                roll1 = p1tur.tur();
                System.out.println("du har slået " + roll1);
                System.out.println("det vil sige du lander på felt " + Tlmain.getTitle(roll1));
                System.out.println(Tlmain.getFlavourText(roll1));
                System.out.println("du har fået" + Tlmain.getValue(roll1));
                player1.AddToSaldo(Tlmain.getValue(roll1));
                System.out.println("du er nu op på" + player1.GetSaldo() + " point");
            }


            System.out.println(navn2 + " starter med at slå terningerne, tryk enter for at slå");
            Input.enter();
            int roll2 = p2tur.tur();
            System.out.println("du har slået " + roll2);
            System.out.println("det vil sige du lander på felt " + Tlmain.getTitle(roll2));
            System.out.println(Tlmain.getFlavourText(roll2));
            System.out.println("du har fået" + Tlmain.getValue(roll2));
            player2.AddToSaldo(Tlmain.getValue(roll2));
            System.out.println("du er nu op på" + player2.GetSaldo() + " point");
            if (roll2 == 10) {
                System.out.println(Langmain.extraturn());
                roll2 = p2tur.tur();
                System.out.println("du har slået " + roll2);
                System.out.println("det vil sige du lander på felt " + Tlmain.getTitle(roll2));
                System.out.println(Tlmain.getFlavourText(roll2));
                System.out.println("du har fået" + Tlmain.getValue(roll2));
                player2.AddToSaldo(Tlmain.getValue(roll2));
                System.out.println("du er nu op på" + player2.GetSaldo() + " point");
            }

            if (player1.GetSaldo() > player2.GetSaldo()) {
                System.out.println("tillykke " + navn1 + "du har vundet spillet");
                int difference = player1.GetSaldo() - player2.GetSaldo();
                System.out.println("du vandt med" + difference + " point");
            }
            if (player2.GetSaldo() > player1.GetSaldo()) {
                System.out.println("tillykke " + navn2 + "du har vundet spillet");
                int difference = player2.GetSaldo() - player1.GetSaldo();
                System.out.println("du vandt med" + difference + " point");
            }


        }
    }
}
