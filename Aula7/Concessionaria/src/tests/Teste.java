package tests;

import org.junit.jupiter.api.Test;
import produtos.Artigo;
import produtos.Pneu;
import produtos.Produto;
import produtos.Veiculo;
import servicos.*;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Teste {
    @Test
    public void calcularTotalDeEntradaETotalDoLucroDoDia(){
        //Arrange
        Dia dia = new Dia();
        Servicos revisao = new Revisao(100,10);
        Servicos manutencao = new Manutencao(20,5,"Manutencao",2,1);
        Produto produto = new Veiculo(10,5,3,"Fiat","Uno","Vermelho");
        //Act
        dia.realizarVendasDeProdutos(produto);
        dia.realizarServicos(revisao);
        dia.realizarServicos(manutencao);
        double esperado = 160.11;
        double obtido = dia.consultarTotalDeEntradaDoDia();
        double esperado2 = 2.91;
        double obtido2 = dia.consultarTotalDeEntradaDeLucroDoDia();
        //Assert
        assertEquals(esperado,obtido);
        assertEquals(esperado2,obtido2);
    }

    @Test
    public void realizarVendaDeProdutosEmLoteEOrganizarDeFormaCrescenteEDecrescente(){
        //Arrange
        Dia dia = new Dia();
        List<Produto> listaDeProdutos = new LinkedList<>();
        Produto veiculo = new Veiculo(10000,10,2,"Honda","Civic","Preto");
        Produto artigo = new Artigo(200,2,"Suspensao","Muito Legal");
        Produto veiculo2 = new Veiculo(10,5,3,"Fiat","Uno","Vermelho");
        //Act
        listaDeProdutos.add(veiculo);
        listaDeProdutos.add(veiculo2);
        listaDeProdutos.add(artigo);
        dia.realizarVendasDeProdutosEmLote(listaDeProdutos);
        Produto esperado = veiculo;
        Produto obtido = dia.ordenarProdutosVendidosPorValorTotalEmOrdemDecrescente().get(0);
        Produto esperado2 = veiculo2;
        Produto obtido2 = dia.ordenarProdutosVendidosPorValorTotalEmOrdemCrescente().get(0);
        //Assert
        assertEquals(esperado,obtido);
        assertEquals(esperado2,obtido2);
    }

    @Test
    public void removerUmProdutoEUmServico(){
        //Arrange
        Dia dia = new Dia();
        Produto veiculo = new Veiculo(10000,10,2,"Honda","Civic","Preto");
        Servicos revisao = new Revisao(100,10);
        //Act
        dia.realizarServicos(revisao);
        dia.realizarVendasDeProdutos(veiculo);
        dia.removerProdutosDaLista(veiculo);
        dia.removerServicosDaLista(revisao);
        boolean esperado = true;
        boolean obtido = !dia.getProdutosVendidos().contains(veiculo);
        boolean esperado2 = true;
        boolean obtido2 = !dia.getServicosRealizados().contains(revisao);
        //Assert
        assertEquals(esperado,obtido);
        assertEquals(esperado2,obtido2);
    }

    @Test
    public void calcularValorTotalDoServicoDeTrocaDePneuEOValorBase(){
        //Arrange
        List<Pneu> listaDePneus = new LinkedList<>();
        Pneu pneuDianteiro = new Pneu(50,1);
        Pneu pneuTraseiro = new Pneu(30,1);
        //Act
        listaDePneus.add(pneuDianteiro);
        listaDePneus.add(pneuTraseiro);
        TrocaDePneu trocaDePneu = new TrocaDePneu(listaDePneus);
        double esperado = 201.304;
        double obtido = trocaDePneu.calcularValorTotalServico();
        double esperado2 = 190.4;
        double obtido2 = trocaDePneu.calcularValorBaseServico();
        //Assert
        assertEquals(esperado,obtido);
        assertEquals(esperado2,obtido2);
    }
}