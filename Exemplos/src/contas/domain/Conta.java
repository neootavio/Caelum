package contas.domain;

import java.sql.SQLOutput;

public abstract class Conta {

    int numero;
    String cliente;
    double saldo;

    public void deposita(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido!");
        } else {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " foi realizado com sucesso.");
        }

    }
    public void saca(double valor){
        if(this.saldo < valor){

            System.out.println("Saldo insuficiente");

        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }

    }
    public void trasferePara(Conta conta, double valor){
        saca(valor);
        conta.deposita(valor);
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
