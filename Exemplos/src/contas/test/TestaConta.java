package contas.test;

import contas.domain.ContaCorrente;
import contas.domain.ContaPoupanca;
import contas.domain.SeguroDeVida;

public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaCorrente contaCorrente1 = new ContaCorrente();
        SeguroDeVida seguroDeVida = new SeguroDeVida();


        System.out.println(seguroDeVida.getValorImposto());
        System.out.println(seguroDeVida.toString());

        contaCorrente.deposita(1000);

        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.deposita(1000);

        contaPoupanca.aplicaRendimento(contaPoupanca.getSaldo());

        System.out.println("Saldo = " + contaPoupanca.getSaldo());

        System.out.println(contaCorrente1);

        System.out.println(contaPoupanca);

        System.out.println(ContaPoupanca.identificador);

        System.out.println("Imposto " + contaCorrente.getValorImposto());
    }
}
