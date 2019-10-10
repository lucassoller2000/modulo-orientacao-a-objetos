package servicos;

import produtos.Pneu;
import java.util.List;

public class TrocaDePneu implements Servicos {
    private List<Pneu> listaDePneus;
    private final double valorBaseDeMaoDeObra = 50;
    private final double valorBaseDeLucro = 5;

    public TrocaDePneu(List<Pneu> listaDePneus) {
        this.listaDePneus = listaDePneus;
    }

    @Override
    public double calcularValorBaseServico() {
        double valorBaseDosPneus= 0;
        for(Pneu pneu : listaDePneus){
            valorBaseDosPneus += pneu.calcularValorBaseDosPneus();
        }
        return listaDePneus.size() * valorBaseDeMaoDeObra + valorBaseDosPneus;
    }

    @Override
    public double calcularValorTotalServico() {
        double valorTotalDosPneus= 0;
        for(Pneu pneu : listaDePneus){
            valorTotalDosPneus += pneu.calcularValorTotal();
        }
        return listaDePneus.size() * (valorBaseDeMaoDeObra + valorBaseDeLucro) + valorTotalDosPneus;
    }

    @Override
    public double calcularLucroTotalServico() {
        return listaDePneus.size() * (valorBaseDeLucro/100);
    }
}
