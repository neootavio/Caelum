package conta.domain;

public class Conta {
    public int numero;
    public Cliente titular = new Cliente();
    public double saldo;
    public double limite;

    public boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean transferePara(Conta destino, double valor){
        boolean retirou = this.saca(valor);

        if(retirou == false){
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Conta " + this.numero + "\nTitular: " + this.titular + "\nSaldo: " + this.saldo;
    }
}
