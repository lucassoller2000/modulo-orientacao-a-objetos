public class MagoArcano {
    private int vida;
    private int mana;
    private int nivel;
    private int poderMagico;
    int poderBolaDeFogo;
    boolean treino;

    public MagoArcano(){
        this.vida = 10;
        this.mana = 4;
        this.nivel = 1;
        this.poderMagico = 2;
    }

    public void dobrarAtributos(){
        this.vida *= 2;
        this.mana *= 2;
        this.poderMagico *= 2;
        this.nivel++;
    }

    public void receberBonusDePoderMagico(){
        this.poderMagico+=5;
    }

    public int lancarBolasDeFogo(int quantidaDeMana, int nivelDaAcademia){
        if(this.mana>0 && this.treino){
            if(this.mana>quantidaDeMana || this.mana==quantidaDeMana) {
                this.poderBolaDeFogo = poderMagico + quantidaDeMana + nivelDaAcademia;
                this.mana -= quantidaDeMana;
            }else {
                this.poderBolaDeFogo = poderMagico + mana + nivelDaAcademia;
                this.mana=0;
            }
            return poderBolaDeFogo;
        }else {
            return 0;
        }
    }

    public void saberSeOMagoTreinouNaAcademiaDoFogo(boolean treino){
        this.treino=treino;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public int getMana() {
        return mana;
    }
}
