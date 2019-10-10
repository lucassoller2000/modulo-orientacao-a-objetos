package produtos;

public class Artigo extends Produto{
    protected String nomeDoProduto;
    protected String descricaoDoProduto;

    public Artigo(double valorBase, double percentualDeLucro, String nomeDoProduto, String descricaoDoProduto) {
        super(valorBase, percentualDeLucro);
        this.nomeDoProduto = nomeDoProduto;
        this.descricaoDoProduto = descricaoDoProduto;
    }
}
