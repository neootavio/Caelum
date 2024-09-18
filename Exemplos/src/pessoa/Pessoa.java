package pessoa;

public class Pessoa {
    public String nome;
    public int idade;

    public void fazAniversario(){
        this.idade+=1;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
