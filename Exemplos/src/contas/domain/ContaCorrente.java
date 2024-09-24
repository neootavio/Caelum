package contas.domain;

public class ContaCorrente extends Conta implements Tributavel{

    private double limite = 300;

    @Override
    public double getSaldo(){
        return super.saldo + this.limite;
    }

    public void getTipo(){
        System.out.println("Conta Corrente");
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limite=" + limite +
                ", numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
