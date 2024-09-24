package contas.domain;

public class SeguroDeVida implements Tributavel{

    private double valor = 100;
    private String titular;
    private int numeroApolice;

    @Override
    public double getValorImposto() {
        return this.valor*0.02 + 42;
    }

    public void getTipo(){
        System.out.println("Seguro de vida");
    }

    @Override
    public String toString() {
        return "SeguroDeVida{" +
                "valor=" + valor +
                ", titular='" + titular + '\'' +
                ", numeroApolice=" + numeroApolice +
                '}';
    }
}
