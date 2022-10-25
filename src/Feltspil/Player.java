package Feltspil;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Player {
    private int saldo = 1000;

    public String navn;

    public Player (String n, int s){
        this.navn = n;
        this.saldo = s;
    }
    public int GetSaldo (){
        return this.saldo;
    }

    public int AddToSaldo (int ammount){
        saldo = saldo + ammount;
        return saldo;
    }
    public String toString (){
        return this.navn;
    }
}
