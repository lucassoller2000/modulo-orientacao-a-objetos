class CalculadoraInteligente {
    String apresentarSoma(Calculadora calculadora, Auxiliar auxiliar, int x, int y){
        int resultado = calculadora.somar(x,y);
        return auxiliar.AdicionarSufixo("Resultado da soma: ", String.valueOf(resultado));
    }
    String apresentarSubtracao(Calculadora calculadora, Auxiliar auxiliar, int x, int y){
        int resultado = calculadora.subtrair(x,y);
        return auxiliar.AdicionarSufixo("Resultado da subtração: ", String.valueOf(resultado));
    }
    String apresentarMultiplicacao(Calculadora calculadora, Auxiliar auxiliar, int x, int y){
        int resultado = calculadora.multiplicar(x,y);
        return auxiliar.AdicionarSufixo("Resultado da multiplicação: ", String.valueOf(resultado));
    }
    String apresentarDivisao(Calculadora calculadora, Auxiliar auxiliar, double x, double y){
        double resultado = calculadora.dividir(x,y);
        return auxiliar.AdicionarSufixo("Resultado da divisão: ", String.valueOf(resultado));
    }
}