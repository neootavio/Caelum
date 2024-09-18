package porta;

public class Porta {
    public boolean aberta;
    public String cor;
    public int dimensaoX;
    public int dimensaoY;
    public int dimensaoZ;

    public void abre() {
        if (!estaAberta()) {
            this.aberta = true;
        }
    }

    public void fecha() {
        if (estaAberta()) {
            this.aberta = false;
        }
    }

    public void pinta(String s) {
        this.cor = s;
    }

    public boolean estaAberta() {
        if (this.aberta == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Porta{" +
                "aberta=" + aberta +
                ", cor='" + cor + '\'' +
                ", dimensaoX=" + dimensaoX +
                ", dimensaoY=" + dimensaoY +
                ", dimensaoZ=" + dimensaoZ +
                '}';
    }
}
