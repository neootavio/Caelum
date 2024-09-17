package conta.test;

import conta.domain.Cliente;
import conta.domain.Conta;

public class Test {

    public static void main(String[] args) {

        Conta minhaConta = new Conta();
        Cliente c = new Cliente();

        minhaConta.titular = c;

        System.out.println(minhaConta);



    }

}
