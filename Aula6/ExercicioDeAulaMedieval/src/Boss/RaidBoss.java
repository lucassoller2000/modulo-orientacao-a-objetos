package Boss;

public class RaidBoss extends  Alvo{
    private String nome;
    private int pontosDeDefesa;

    public RaidBoss(int pontosDeVida, String nome, int pontosDeDefesa) {
        super(pontosDeVida);
        this.nome = nome;
        this.pontosDeDefesa = pontosDeDefesa;
    }

    @Override
    public void receberAtaque(int poderDeAtaque){
        if(pontosDeDefesa>0){
            pontosDeDefesa -= poderDeAtaque;
        }else{
            super.receberAtaque(poderDeAtaque);
        }
    }
}
