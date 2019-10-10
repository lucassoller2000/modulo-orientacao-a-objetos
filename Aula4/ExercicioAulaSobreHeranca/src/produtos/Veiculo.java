package produtos;

public class Veiculo extends Produto{
    protected double potencia;
    protected String marca;
    protected String modelo;
    protected String cor;
    protected final double PIS = 0.017;
    protected final double COFINS = 0.076;
    protected double IPI;

    public Veiculo(double valorBase, double percentualDeLucro, double potencia, String marca,
                   String modelo, String cor) {
        super(valorBase, percentualDeLucro);
        this.potencia = potencia;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        if (this.potencia <= 1){
            this.IPI = 0.02;
        }else{
            this.IPI = 0.08;
        }
    }

    @Override
    public double calcularValorTotalDosImpostos(){
        return (valorBase * IPI) + (valorBase * ICMS) + (valorBase * PIS) + (valorBase * COFINS);
    }
}
