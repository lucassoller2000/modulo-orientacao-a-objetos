package servicos;

import produtos.Produto;

public class Manutencao extends Produto implements Servicos {

    private String nome;
    private int quantidadesDePessoasParaRealizarManutencao;
    private double quantidadeDeHorasParaRealizarManutencao;

    public Manutencao(double valorBase, int percentualLucro, String nome, int quantidadesDePessoasParaRealizarManutencao, double quantidadeDeHorasParaRealizarManutencao) {
        super(valorBase, percentualLucro);
        this.nome = nome;
        this.quantidadesDePessoasParaRealizarManutencao = quantidadesDePessoasParaRealizarManutencao;
        this.quantidadeDeHorasParaRealizarManutencao = quantidadeDeHorasParaRealizarManutencao;
    }

    @Override
    public double calcularValorBaseServico() {
        return quantidadeDeHorasParaRealizarManutencao * quantidadesDePessoasParaRealizarManutencao * super.getValorBase();
    }

    @Override
    public double calcularValorTotalServico() {
        return calcularLucroTotal() + calcularValorTotalImpostos() + calcularValorBaseServico();
    }

    @Override
    public double calcularLucroTotalServico() {
        return (calcularValorBaseServico() + calcularValorTotalImpostos()) * ((double) super.getPercentualLucro() / 100);
    }

    public double calcularValorTotalImpostos(){
        return calcularValorBaseServico() * super.getICMS();
    }

}
