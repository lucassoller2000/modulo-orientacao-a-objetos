package armasEDefesas;

public class Arma {
    protected String nomeDaArma;
    protected int poderDeAtaque;
    protected String tipoDeAtaque;

    public Arma(String nomeDaArma) {
        this.nomeDaArma = nomeDaArma;
        poderDeAtaque = 20;
        tipoDeAtaque = "normal";
    }

    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }
}
