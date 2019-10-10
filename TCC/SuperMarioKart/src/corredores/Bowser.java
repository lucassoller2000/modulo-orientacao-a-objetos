package corredores;

public class Bowser extends Corredor {
    private int contarVezesQueAnda;
    public Bowser() {
        super(10);
    }

    @Override
    public int calcularBonus() {
        contarVezesQueAnda++;
        if(contarVezesQueAnda <= 2){
            return -2;
        }else{
            return 2;
        }
    }
}
