package servicos;

import produtos.Produto;

import java.util.*;

public class Dia {
    private List<Produto> produtosVendidos;
    private List<Servicos> servicosRealizados;

    public Dia() {
        this.produtosVendidos = new LinkedList<>();
        this.servicosRealizados = new LinkedList<>();
    }

    public void realizarVendasDeProdutos(Produto produto){
        if(!produtosVendidos.contains(produto)){
            produtosVendidos.add(produto);
        }
    }

    public void realizarServicos(Servicos servicos){
        if(!servicosRealizados.contains(servicos)){
            servicosRealizados.add(servicos);
        }
    }

    public void realizarVendasDeProdutosEmLote(List<Produto> listaDeProdutos){
        produtosVendidos.addAll(listaDeProdutos);
    }

    public double consultarTotalDeEntradaDoDia(){
        return consultarTotalDeEntradaDeProdutos() + consultarTotalDeEntradaDeServicos();
    }

    public double consultarTotalDeEntradaDeLucroDoDia(){
        return consultarTotalDeEntradaDeLucroDeProdutos() + consultarTotalDeEntradaDeLucroDeServicos();
    }

    public double consultarTotalDeEntradaDeServicos(){
        double totalDeEntradaDeServicos = 0;
        for (Servicos servicos : servicosRealizados){
            totalDeEntradaDeServicos += servicos.calcularValorTotalServico();
        }
        return totalDeEntradaDeServicos;
    }

    public double consultarTotalDeEntradaDeProdutos(){
        double totalDeEntradaDeProdutos = 0;
        for (Produto produto : produtosVendidos){
            totalDeEntradaDeProdutos += produto.calcularValorTotal();
        }
        return totalDeEntradaDeProdutos;
    }

    public double consultarTotalDeEntradaDeLucroDeServicos(){
        double totalDeEntradaDeLucroDeServicos = 0;
        for (Servicos servicos : servicosRealizados){
            totalDeEntradaDeLucroDeServicos += servicos.calcularLucroTotalServico();
        }
        return totalDeEntradaDeLucroDeServicos;
    }

    public double consultarTotalDeEntradaDeLucroDeProdutos(){
        double totalDeEntradaDeLucroDeProdutos = 0;
        for (Produto produto : produtosVendidos){
            totalDeEntradaDeLucroDeProdutos += produto.calcularLucroTotal();
        }
        return totalDeEntradaDeLucroDeProdutos;
    }

    public List<Produto> ordenarProdutosVendidosPorValorTotalEmOrdemCrescente(){
        Produto[] produtosOrdenados = new Produto[produtosVendidos.size()];
        produtosOrdenados = produtosVendidos.toArray(produtosOrdenados);
        Produto aux;
        int numeroDeProdutos = produtosOrdenados.length;
        for(int i = 0; i< numeroDeProdutos; i++){
            for(int j = 0; j < numeroDeProdutos-1; j++){
                Produto produtoA = produtosOrdenados[j];
                Produto produtoB = produtosOrdenados[j + 1];

                if(produtoA.calcularValorTotal() > produtoB.calcularValorTotal()){
                    produtosOrdenados[j] = produtoB;
                    produtosOrdenados[j + 1]= produtoA;
                }
            }
        }
        return Arrays.asList(produtosOrdenados);
    }

    public List<Produto> ordenarProdutosVendidosPorValorTotalEmOrdemDecrescente(){
        Produto[] produtosOrdenados = new Produto[produtosVendidos.size()];
        produtosOrdenados = produtosVendidos.toArray(produtosOrdenados);
        Produto aux;
        int numeroDeProdutos = produtosOrdenados.length;
        for(int i = 0; i< numeroDeProdutos; i++){
            for(int j = 0; j < numeroDeProdutos-1; j++){
                Produto produtoA = produtosOrdenados[j];
                Produto produtoB = produtosOrdenados[j + 1];

                if(produtoA.calcularValorTotal() < produtoB.calcularValorTotal()){
                    produtosOrdenados[j] = produtoB;
                    produtosOrdenados[j + 1]= produtoA;
                }
            }
        }
        return Arrays.asList(produtosOrdenados);
    }

    public void removerProdutosDaLista(Produto produto){
        if(this.produtosVendidos.contains(produto)){
            produtosVendidos.remove(produto);
        }
    }

    public void removerServicosDaLista(Servicos servicos){
        if(this.servicosRealizados.contains(servicos)){
            servicosRealizados.remove(servicos);
        }
    }

    public List<Produto> getProdutosVendidos() {
        return produtosVendidos;
    }

    public List<Servicos> getServicosRealizados() {
        return servicosRealizados;
    }
}
