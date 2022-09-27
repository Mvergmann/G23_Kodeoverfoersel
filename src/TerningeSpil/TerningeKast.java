package TerningeSpil;

import java.util.Scanner;

public class TerningeKast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Die die1 = new Die();
        Die die2 = new Die();
        int sum1;
        int sum2;
        int point1 = 0;
        int point2 = 0;
        Tur kastsp1 = new Tur();
        Tur kastsp2 = new Tur();


        System.out.println("Skriv navnet på spiller 1: ");
        String spiller1 = sc.nextLine();
        System.out.println("Skriv navnet på spiller 2: ");
        String spiller2 = sc.nextLine();


        while (point1 < 40 && point2 < 40) {


            System.out.println(spiller1 + " kaster terningerne");
            kastsp1.tur();
            sum1 = kastsp1.sum;
            System.out.println("du har slået " + kastsp1.getDie1Value() + " og " + kastsp1.getDie2Value());
            point1 += sum1;
            System.out.println("du har nu: " + point1 + " point.");

            if (kastsp1.getDie1Value() == 1 && kastsp1.getDie2Value() == 1){
                System.out.println("Du har slået to, 1'ere og mister alle dine point");
                point1 = 0;

            }

            while (kastsp1.getDie1Value() == kastsp1.getDie2Value()) {
                System.out.println(spiller1 + " slog 2 ens! Kast igen! ");
                kastsp1.tur();
                sum1 = kastsp1.sum;
                System.out.println("du har slået " + kastsp1.getDie1Value() + " og " + kastsp1.getDie2Value());
                point1 += sum1;
                System.out.println("du har nu: " + point1 + " point.");

            }
            System.out.println(spiller2 + " kaster terningerne");
            kastsp2.tur();
            sum2 = kastsp2.sum;
            System.out.println("du har slået " + kastsp2.getDie1Value() + " og " + kastsp2.getDie2Value());
            point2 += sum2;
            System.out.println("du har nu: " + point2 + " point");

            if (kastsp2.getDie1Value() == 1 && kastsp2.getDie2Value() == 1) {
                System.out.println("Du har slået to, 1'ere og mister alle dine point");
                point2 = 0;
            }

            while (kastsp2.getDie1Value() == kastsp2.getDie2Value()) {
                System.out.println(spiller2 + " slog to ens, kast igen!");
                kastsp2.tur();
                sum2 = kastsp2.sum;
                System.out.println("du har slået " + kastsp2.getDie1Value() + " og " + kastsp2.getDie2Value());
                point2 += sum2;
                System.out.println("du har nu: " + point2 + " point");
            }

            }
        if (point1 > 40) {
            System.out.println(spiller1 + " har vundet!");
            System.out.println("Scoren blev: " + spiller1 + " point og " + spiller2 + " point");
        } else {
            System.out.println(spiller2 + " har vundet!");
            System.out.println("Scoren blev: " + point1 + " point til " + spiller1 + " og " + point2 + " point til " + spiller2);
        }
        }

    }

