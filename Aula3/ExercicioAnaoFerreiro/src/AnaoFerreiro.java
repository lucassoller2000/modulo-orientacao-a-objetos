public class AnaoFerreiro {
    private int idade;
    private int nivelDeHabilidade;
    private Machado machado;
    int poder;

    public AnaoFerreiro(int idade, int nivelDeHabilidade){
        this.idade = idade;
        this.nivelDeHabilidade = nivelDeHabilidade;
    }

    public Machado forjarMachado(){
        int poder = this.nivelDeHabilidade;
        if(this.idade>=100 && this.idade<=200){
            poder += 2;
        }
        return new Machado(poder);
    }
    public int  melhorarMachado(){
        if(this.idade>150 && this.nivelDeHabilidade>5 && this.machado.getPoderMachado()<20){
            if(this.nivelDeHabilidade>=6 && this.nivelDeHabilidade <=10){
                return 2;
            }else if(this.nivelDeHabilidade>10){
                return 3;
            }
        }return 0;
    }
}
