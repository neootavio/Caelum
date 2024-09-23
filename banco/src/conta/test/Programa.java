package conta.test;

import conta.domain.Cliente;
import conta.domain.Conta;

public class Programa {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Otávio");
        cliente.setSobrenome("Elias");
        cliente.setCpf("000.000.000-00");

        Conta conta = new Conta(100122, cliente);
        conta.deposita(10000);
        conta.saca(300);

        System.out.println(conta);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Rayara");
        cliente2.setSobrenome("Beath");
        cliente2.setCpf("000.000.000-00");

        Conta conta2 = new Conta(100310, cliente2, 10000);
        conta2.deposita(10000);
        conta2.saca(700);

        System.out.println(conta2);

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Cida");
        cliente3.setSobrenome("Rocha");
        cliente3.setCpf("000.000.000-00");

        Conta conta3 = new Conta(100100, cliente3);
        conta3.deposita(10000);
        conta3.saca(100);

        System.out.println(conta3);
        System.out.println(cliente2);

    }
}
