package ResidentEvil.Armas;
import ResidentEvil.Item;
import ResidentEvil.Municoes.Municao;

public class Arma extends Item {
    private int numeroDeTiros;
    private int numeroDeMunicaoPorTiro;
    private int numeroDeMunicaoQueCabem;
    private int numeroDeMunicaoNaArma;
    private String nomeAuxiliar;

    public Arma(String nome, int numeroDeLinhasQueOcupa, int numeroDeColunasQueOcupa, double peso,
                int numeroDeTiros, int numeroDeMunicaoPorTiro) {
        super(nome, numeroDeLinhasQueOcupa, numeroDeColunasQueOcupa, peso);
        this.numeroDeTiros = numeroDeTiros;
        this.numeroDeMunicaoPorTiro = numeroDeMunicaoPorTiro;
        this.numeroDeMunicaoQueCabem = numeroDeTiros * numeroDeMunicaoPorTiro;
        this.numeroDeMunicaoNaArma = numeroDeMunicaoQueCabem;
    }

    public void atirar(){
        if(numeroDeMunicaoNaArma>0){
            numeroDeMunicaoNaArma-= numeroDeMunicaoPorTiro;
        }
    }

    public void recarregar(Municao municao){
        nomeAuxiliar = municao.getNome().replace("Municao","");
        if(this.getNome().equals(nomeAuxiliar)){
                int numeroDeBalasASeremColocadasNaArma = numeroDeMunicaoQueCabem - numeroDeMunicaoNaArma;
                municao.setQuantidadeDeMunicao(municao.getQuantidadeDeMunicao()-numeroDeBalasASeremColocadasNaArma);
                if(municao.getQuantidadeDeMunicao()==0) {
                   municao.getInventario().removerItem(municao);
                }
                numeroDeMunicaoNaArma += numeroDeBalasASeremColocadasNaArma;
        }
    }

    public int getNumeroDeMunicaoNaArma() {
        return numeroDeMunicaoNaArma;
    }
}
