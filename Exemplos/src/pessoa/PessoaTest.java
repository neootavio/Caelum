package pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Naruto";
        pessoa.idade = 12;

        pessoa.fazAniversario();
        pessoa.fazAniversario();

        System.out.println(pessoa);
    }
}
