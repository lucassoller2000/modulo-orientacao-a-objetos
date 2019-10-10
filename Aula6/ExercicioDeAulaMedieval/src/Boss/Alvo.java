package Boss;

public class Alvo {
    private int pontosDeVida;

    public Alvo(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void receberAtaque(int poderDeAtaque){
        this.pontosDeVida -= poderDeAtaque;
    }

    public int getPontosDeVida() {
        if(this.pontosDeVida<0){
            pontosDeVida = 0;
        }
        return pontosDeVida;
    }
}
