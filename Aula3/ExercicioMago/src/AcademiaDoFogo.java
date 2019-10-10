public class AcademiaDoFogo {
    private int nivelPoder;

    public AcademiaDoFogo (int nivelPoder){
        this.nivelPoder = nivelPoder;
    }

    public int treinarNaAcademiaDoFogo(MagoArcano magoArcano){
        magoArcano.saberSeOMagoTreinouNaAcademiaDoFogo(true);
        return nivelPoder;
    }
}
