package Feltspil;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Player {
    private int saldo = 0;

    public String navn;

    public Player (String n, int s){
        this.navn = n;
        this.saldo = s;
    }
    public int GetSaldo (int saldo){
        return saldo;
    }

    public int AddToSaldo (int ammount){
        saldo = saldo + ammount;
        return saldo;
    }
    public String toString (){
        return this.navn;
    }
}
