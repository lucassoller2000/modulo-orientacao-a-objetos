package produtos;

public class Produto {
    protected double valorBase;
    protected double percentualDeLucro;
    protected final double ICMS=0.13;

    public Produto(double valorBase, double percentualDeLucro) {
        this.valorBase = valorBase;
        this.percentualDeLucro = percentualDeLucro;
    }

    public double calcularValorTotalDoProduto(){
         return valorBase + calcularLucroTotal() + calcularValorTotalDosImpostos();
    }

    public double calcularLucroTotal(){
        return (valorBase + calcularValorTotalDosImpostos())* (percentualDeLucro/100);
    }

    public double calcularValorTotalDosImpostos(){

        return valorBase * ICMS;
    }
}
