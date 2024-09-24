package contas.domain;

import java.sql.SQLOutput;

public abstract class Conta {


    public static int identificador;

    public Conta(){
        identificador++;
    }


    int numero;
    String cliente;
    double saldo;

    public boolean deposita(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return false;
        } else {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " foi realizado com sucesso.");
            return true;
        }
    }

    public boolean saca(double valor) {
        if (this.saldo < valor) {

            System.out.println("Saldo insuficiente");
            return false;

        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
            return true;
        }

    }

    public void trasferePara(Conta conta, double valor) {
        if (saca(valor)) {
            conta.deposita(valor);
        }

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

}
