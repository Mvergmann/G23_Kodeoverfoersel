package Feltspil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    @Test

    void positivebalance(){
        int STARTSALDO = 1000;
        String navn1 = "Test";
        int fail = 0;
        int antalslag = 0;

        for (int i = 0; i < 50000;i++){
           var player1 = new Player(navn1, STARTSALDO);
            var Tlmain = new TileList();
            var p1tur = new Turn();
            int roll1 = p1tur.tur();

          int balance =  player1.AddToSaldo(Tlmain.getValue(roll1));
        //int balance = -1;
            if(balance < 0){
                System.out.println("Error negativ balance");
                fail++;
                break;
            }
            antalslag++;
        }
        assertEquals(0,fail);
        System.out.println("Test has concluded " + fail + " fails");
        System.out.println("Testet over " + antalslag);
    }


}