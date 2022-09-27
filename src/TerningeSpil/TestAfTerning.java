package TerningeSpil;

public class TestAfTerning {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        int antGang;
        int toens = 0;

        for (antGang = 0; antGang < 1000; antGang++) {
            die1.roll();
            die2.roll();
            System.out.println(die1.getFaceValue() + die2.getFaceValue());
            if (die1.getFaceValue() == die2.getFaceValue()) {
                toens++;
            }
        }
        System.out.println("Der blevet slået 2 ens: " + toens + " gange");
    }
}
