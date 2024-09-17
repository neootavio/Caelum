package conta.test;

import conta.domain.Conta;

public class Programa {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.saldo = 1000;
        minhaConta.numero = 1000022;
        //minhaConta.titular = "Otávio";

        minhaConta.deposita(500);

        minhaConta.saca(300);

        System.out.println(minhaConta);
    }
}
