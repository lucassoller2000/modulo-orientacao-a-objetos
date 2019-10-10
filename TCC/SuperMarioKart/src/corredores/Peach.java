package corredores;

public class Peach extends Corredor{
    private int contarVezesQueAnda;

    public Peach() {
        super(6);
    }

    @Override
    public int calcularBonus() {
        contarVezesQueAnda++;
        if(contarVezesQueAnda%3 == 0){
            return 2;
        }else {
            return 0;
        }
    }
}
