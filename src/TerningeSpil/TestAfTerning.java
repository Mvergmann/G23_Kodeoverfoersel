package TerningeSpil;

public class TestAfTerning {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        int antGang;
        int toens = 0;

        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int sum8 = 0;
        int sum9 = 0;
        int sum10 = 0;
        int sum11 = 0;
        int sum12 = 0;
        /*
         Her definineres en række variable af type int som bruges til at tælle antal gange tegningerne slår
         forskellige resultater
         */



        for (antGang = 0; antGang < 10000; antGang++) {
            die1.roll();
            die2.roll();
            System.out.println(die1.getFaceValue() + die2.getFaceValue());

            if (die1.getFaceValue() == die2.getFaceValue()) {
                toens++;
            }

            if(die1.getFaceValue() + die2.getFaceValue()==2){
                sum2++;
            }
            if(die1.getFaceValue() + die2.getFaceValue()==3){
                sum3++;
            }  if(die1.getFaceValue() + die2.getFaceValue()==4){
                sum4++;
            }
            if(die1.getFaceValue() + die2.getFaceValue()==5){
                sum5++;
            }
            if(die1.getFaceValue() + die2.getFaceValue()==6){
                sum6++;
            }
            if(die1.getFaceValue() + die2.getFaceValue()==7){
                sum7++;
            }
            if(die1.getFaceValue() + die2.getFaceValue()==8){
                sum8++;
            }
            if(die1.getFaceValue() + die2.getFaceValue()==9){
                sum9++;
            }
            if(die1.getFaceValue() + die2.getFaceValue()==10){
                sum10++;
            }
            if(die1.getFaceValue() + die2.getFaceValue()==11){
                sum11++;
            }
            if(die1.getFaceValue() + die2.getFaceValue()==12){
                sum12++;
            }

        }
        System.out.println("Der blevet slået 2 ens: " + toens + " gange");
        System.out.println("Der blevet slået 2: " + sum2 + " gange");
        System.out.println("Der blevet slået 3: " + sum3 + " gange");
        System.out.println("Der blevet slået 4: " + sum4 + " gange");
        System.out.println("Der blevet slået 5: " + sum5 + " gange");
        System.out.println("Der blevet slået 6: " + sum6 + " gange");
        System.out.println("Der blevet slået 7: " + sum7 + " gange");
        System.out.println("Der blevet slået 8: " + sum8 + " gange");
        System.out.println("Der blevet slået 9: " + sum9 + " gange");
        System.out.println("Der blevet slået 10: " + sum10 + " gange");
        System.out.println("Der blevet slået 11: " + sum11 + " gange");
        System.out.println("Der blevet slået 12: " + sum12 + " gange");
    }
}
