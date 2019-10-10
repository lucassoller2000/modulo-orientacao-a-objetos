public class Auxiliar {
    String AdicionarPrefixo(String x, String y){
        StringBuffer frase = new StringBuffer();
        frase.append(x).append(y);
        return frase.toString();
    }
    String AdicionarSufixo(String x, String y){
        StringBuffer frase = new StringBuffer();
        frase.append(x).append(y);
        return frase.toString();
    }
    String AdicionarPrefixoESufixo(String x, String y, String z){
        StringBuffer frase = new StringBuffer();
        frase.append(x).append(y).append(z);
        return frase.toString();
    }
}
