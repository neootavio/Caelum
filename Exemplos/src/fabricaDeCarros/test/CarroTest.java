package fabricaDeCarros.test;

import fabricaDeCarros.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

        meuCarro.liga();
        meuCarro.acelera(20);

        System.out.println(meuCarro.velocidadeAtual);
    }
}
