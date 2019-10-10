package calculadora;
import produtos.Produto;

public class CalculadoraDeDescontos {
    public static double calcularDescontos(Produto produto, double desconto){
        if (desconto > 100){
            return 0;
        }else if(desconto <0) {
            return produto.calcularValorTotalDoProduto();
        }else {
            return produto.calcularValorTotalDoProduto()- produto.calcularValorTotalDoProduto()* (desconto/100);
        }
    }
}
