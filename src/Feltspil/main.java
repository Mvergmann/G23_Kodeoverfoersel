package Feltspil;   //ligger i feltspil mappen
import TerningeSpil.Input;  // vores input.enter funktion
import java.util.Scanner;   // funktion med brugen af scanner vi senere bruger til System.in

public class main {
    public static final int STARTSALDO = 1000;  // den saldo som hver spiller starter med
    /*
    Det første vi laver i vores main er at vi definere alle vores forskellige objekts.
    vi laver en scanner
    vi får defineret hvad de 2 player hedder
    vi får lavet et player objekt til hver player som indeholder både navn og saldo
    vi laver 2 tur objekter
    vi laver en tile liste objekt
    og en language objekt som bruges til at overføre alt tekst som vi skal printe out.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Language.getWelcome_to_the_game_());
        System.out.println(Language.Getname1());
        String navn1 = scan.nextLine();
        Player player1 = new Player(navn1, STARTSALDO);     //definere første player objekt som player1
        System.out.println(Language.GetName2());
        String navn2 = scan.nextLine(); //
        Player player2 = new Player(navn2, STARTSALDO);     //definere anden player objekt som player2
        System.out.println(Language.getWelcome_to_the_game_() + player1.toString() + Language.and() + player2.toString());
        Turn p2tur = new Turn();
        TileList Tlmain = new TileList();   // definere en tileliste objekt hvor vi kan bruge vores felt array
        Language Langmain = new Language();     // definere et language objekt hvor vi kan calle alle linjer som skal printes ud
        /*

         */
        while (player1.GetSaldo() < 3000 && player2.GetSaldo() < 3000) {
            System.out.println(Language.It_Is() + navn1 + Language.S_Turn_Press_Enter_To_Roll_The_Dice());
            Input.enter();
            int roll1 = p1tur.tur();
            System.out.println(Language.getYouRolled() + roll1);
            System.out.println(Language.You_Landed_On_The_Tile() + Tlmain.getTitle(roll1));
            System.out.println(Tlmain.getFlavourText(roll1));
            System.out.println(Language.You_Have_Gained() + Tlmain.getValue(roll1) + Language.Points());
            player1.AddToSaldo(Tlmain.getValue(roll1));
            System.out.println(Language.Your_Total_Is_Now() + player1.GetSaldo() + Language.Points());

            if (roll1 == 10) {
                System.out.println(Langmain.extraturn());
                Input.enter();
                roll1 = p1tur.tur();
                System.out.println(Language.YOU_ROLLED + roll1);
                System.out.println(Language.You_Landed_On_The_Tile() + Tlmain.getTitle(roll1));
                System.out.println(Tlmain.getFlavourText(roll1));
                System.out.println(Language.You_Have_Gained() + Tlmain.getValue(roll1) + Language.Points());
                player1.AddToSaldo(Tlmain.getValue(roll1));
                System.out.println(Language.Your_Total_Is_Now() + player1.GetSaldo() + Language.Points());
            }

            System.out.println(Language.It_Is() + navn2 + Language.S_Turn_Press_Enter_To_Roll_The_Dice());
            Input.enter();
            int roll2 = p2tur.tur();
            System.out.println(Language.YOU_ROLLED + roll2);
            System.out.println(Language.You_Landed_On_The_Tile() + Tlmain.getTitle(roll2));
            System.out.println(Tlmain.getFlavourText(roll2));
            System.out.println(Language.You_Have_Gained() + Tlmain.getValue(roll2) + Language.Points());
            player2.AddToSaldo(Tlmain.getValue(roll2));
            System.out.println(Language.Your_Total_Is_Now() + player2.GetSaldo() + Language.Points());

            if (roll2 == 10) {
                System.out.println(Langmain.extraturn());
                Input.enter();
                roll2 = p2tur.tur();
                System.out.println(Language.YOU_ROLLED + roll2);
                System.out.println(Language.You_Landed_On_The_Tile() + Tlmain.getTitle(roll2));
                System.out.println(Tlmain.getFlavourText(roll2));
                System.out.println(Language.You_Have_Gained() + Tlmain.getValue(roll2) + Language.Points());
                player2.AddToSaldo(Tlmain.getValue(roll2));
                System.out.println(Language.Your_Total_Is_Now() + player2.GetSaldo() + Language.Points());
            }
        }
        if (player1.GetSaldo() > player2.GetSaldo()) {
            System.out.println(Language.Congratulations() + navn1 + Language.You_Have_Won_The_Game());
            int difference = player1.GetSaldo() - player2.GetSaldo();
            System.out.println(Language.You_Won_With() + difference + Language.Points());
        }

        if (player2.GetSaldo() > player1.GetSaldo()) {
            System.out.println(Language.Congratulations() + navn2 + Language.You_Have_Won_The_Game());
            int difference = player2.GetSaldo() - player1.GetSaldo();
            System.out.println(Language.You_Won_With() + difference + Language.Points());
        }
    }

}
