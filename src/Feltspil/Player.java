package Feltspil;

public class Player {
    private int saldo;
    public String navn;

    public Player (String n, int saldo){
        this.navn = n;
        this.saldo = saldo;
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
