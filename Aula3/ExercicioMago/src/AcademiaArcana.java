public class AcademiaArcana {
    int contarNumeroDeTreinos;

    public void treinaNaAcademiaArcana(MagoArcano magoArcano){
        magoArcano.dobrarAtributos();
        contarNumeroDeTreinos++;
        if(contarNumeroDeTreinos==3){
            magoArcano.receberBonusDePoderMagico();
        }
    }
}
