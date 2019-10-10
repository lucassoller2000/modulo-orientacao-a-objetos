public class Mago {
    private int vida;
    private int poderMagico;
    private int nivel;

    public Mago(){
        this.vida = 10;
        this.poderMagico = 2;
        this.nivel = 1;
    }

    public void passarDeNivel(){
        this.nivel ++;
        this.vida += 4;
        this.poderMagico += 2;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setVida(int vida){
        this.vida = vida;
    }
}
