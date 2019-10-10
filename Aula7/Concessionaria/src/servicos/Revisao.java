package servicos;

public class Revisao implements Servicos {
    private int valorFixoDaRevisao;
    private int valorFixoDeLucro;

    public Revisao(int valorFixoDaRevisao, int valorFixoDeLucro) {
        this.valorFixoDaRevisao = valorFixoDaRevisao;
        this.valorFixoDeLucro = valorFixoDeLucro;
    }

    @Override
    public double calcularValorBaseServico() {
        return valorFixoDaRevisao;
    }

    @Override
    public double calcularValorTotalServico() {
        return calcularValorBaseServico() + (valorFixoDeLucro/100);
    }

    @Override
    public double calcularLucroTotalServico() {
        return valorFixoDeLucro/100;
    }

}
