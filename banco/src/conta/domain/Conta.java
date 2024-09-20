package conta.domain;

public class Conta {

    public static int identificador;

    private int numero;
    private Cliente cliente;
    private double saldo;
    private double limite;

    public Conta() {
        identificador++;
    }

    public Conta(int numero, Cliente cliente) {
        this();
        this.numero = numero;
        this.cliente = cliente;
    }

    public Conta(int numero, Cliente cliente, double limite){
        this(numero, cliente);
        this.limite = limite;

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

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

    public boolean transferePara(Conta destino, double valor) {
        boolean retirou = this.saca(valor);

        if (retirou == false) {
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Conta{" + "ID = " + identificador +
                " numero=" + numero +
                ", cliente=" + cliente +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
