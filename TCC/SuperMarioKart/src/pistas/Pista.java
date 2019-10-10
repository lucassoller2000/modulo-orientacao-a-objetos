package pistas;

import corredores.Corredor;
import podium.Podium;

public abstract class Pista {

    private int numeroDeCasasDaPista;
    private CasaDaPista [] casaDaPista;
    private Podium podiumDaPista = new Podium();

    public Pista(int numeroDeCasasDaPista) {
        this.numeroDeCasasDaPista = numeroDeCasasDaPista;
        casaDaPista = new CasaDaPista[numeroDeCasasDaPista];
        for(int i = 0; i < numeroDeCasasDaPista; i += 1){
            casaDaPista[i] = new CasaDaPista();
        }
    }

    public int getNumeroDeCasasDaPista() {
        return numeroDeCasasDaPista;
    }

    public CasaDaPista getCasaDaPista(int indice) {
        if(indice < numeroDeCasasDaPista){
            return casaDaPista[indice];
        }else {
            return null;
        }
    }

    public Podium getPodiumDaPista() {
        return podiumDaPista;
    }

    public void adicionarCorredor(Corredor corredor){
        corredor.setPistaQueFazParte(this);
        casaDaPista[0].armazenarCorredoresNaCasa(corredor);
    }

    public void trocarCorredorDePosicao(Corredor corredor, int casaOndeEstava){
        if( numeroDeCasasDaPista > corredor.getCasaOndeJogadorEsta() && numeroDeCasasDaPista > casaOndeEstava && casaOndeEstava >= 0){
            casaDaPista[casaOndeEstava].removerCorredorDaCasa(corredor);
            casaDaPista[corredor.getCasaOndeJogadorEsta()].armazenarCorredoresNaCasa(corredor);
        }
    }

    public void removerCorredorDaPista(Corredor corredor){
        casaDaPista[corredor.getCasaOndeJogadorEsta()].removerCorredorDaCasa(corredor);
    }

    public void adicionarCorredorNoPodium(Corredor corredor){
        podiumDaPista.receberCorredor(corredor);
    }
}
