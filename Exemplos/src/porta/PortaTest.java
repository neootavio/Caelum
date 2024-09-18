package porta;

public class PortaTest {
    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.cor = "Marron";
        porta.dimensaoX = 80;
        porta.dimensaoY = 200;
        porta.dimensaoZ = 5;

        System.out.println(porta);

        porta.abre();

        System.out.println(porta);
        porta.fecha();
        porta.pinta("Preto");
        System.out.println(porta.estaAberta());
        System.out.println(porta);

    }
}
