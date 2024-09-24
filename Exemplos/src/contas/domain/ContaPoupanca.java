package contas.domain;

public class ContaPoupanca extends Conta{
    private static final double RENDIMENTO_POUPANÇA = 0.005;

    public void aplicaRendimento(double saldo){
        super.saldo = saldo + saldo*RENDIMENTO_POUPANÇA;
    }

    public void getTipo(){
        System.out.println("Conta Poupança");
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
