package Feltspil;

import java.util.Scanner;

public class Player {
    private int saldo = 0;

    private String navn;

    public Player (String navn){
        Scanner plna = new Scanner(System.in);
        navn = plna.nextLine();

    }
    public int GetSaldo (int saldo){
        return saldo;
    }

    public int AddToSaldo (int ammount){
        saldo = saldo + ammount;
        return saldo;
    }
}
