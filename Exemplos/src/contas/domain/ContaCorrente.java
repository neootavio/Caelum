package contas.domain;

public class ContaCorrente extends Conta{

    private double limite = 300;

    @Override
    public double getSaldo(){
        return super.saldo + this.limite;
    }
}
