package Feltspil;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to the game");
        System.out.println("what is the first players name?");
        String navn1 = scan.nextLine();
        Player player1 = new Player(navn1,0);
        System.out.println("what is the second players name?");
        String navn2 = scan.nextLine();
        Player player2 = new Player(navn2,0);
        System.out.println("welcome to the game " + player1.toString() + " and " + player2.toString());

        while (player1.GetSaldo() < 3000 && player2.GetSaldo()){

        }


    }
}
