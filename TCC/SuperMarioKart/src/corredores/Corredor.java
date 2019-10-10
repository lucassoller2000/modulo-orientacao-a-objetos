package corredores;

import erros.AlvoInvalidoException;
import erros.ItemInvalidoException;
import itens.interfacesDeItens.Item;
import itens.interfacesDeItens.ItemDeAtaque;
import itens.interfacesDeItens.ItemDeUso;
import pistas.Pista;
import podium.Podium;

public abstract class Corredor {
    private int vida;
    private int numeroDeCasasQueAnda;
    private int casaOndeJogadorEsta = 0;
    private Item itemEquipado;
    private Pista pistaQueFazParte;

    public Corredor(int vida) {
        this.vida = vida;
        this.numeroDeCasasQueAnda = 3;
    }

    public int getNumeroDeCasasQueAnda() {
        return numeroDeCasasQueAnda;
    }

    public void setPistaQueFazParte(Pista pistaQueFazParte) {
        this.pistaQueFazParte = pistaQueFazParte;
    }

    public int getCasaOndeJogadorEsta() {
        return casaOndeJogadorEsta;
    }

    public void setCasaOndeJogadorEsta(int casaOndeJogadorEsta) {
        this.casaOndeJogadorEsta = casaOndeJogadorEsta;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void andar(){
        if(getCasaOndeJogadorEsta() >= 0){
            if(getCasaOndeJogadorEsta()< pistaQueFazParte.getNumeroDeCasasDaPista()){
                int casaOndeJogadorEstava = this.getCasaOndeJogadorEsta();
                setCasaOndeJogadorEsta(getCasaOndeJogadorEsta() + getNumeroDeCasasQueAnda() + calcularBonus());
                pistaQueFazParte.trocarCorredorDePosicao(this, casaOndeJogadorEstava);
            }
            else{
                pistaQueFazParte.adicionarCorredorNoPodium(this);
                this.setCasaOndeJogadorEsta(-1);
            }
        }
    }

    public int calcularBonus(){
        return 0;
    }

    public void equiparItem(Item item){
        this.itemEquipado = item;
    }

    public void usarItem(ItemDeUso itemDeUso) throws ItemInvalidoException {
        if(this.itemEquipado != itemDeUso){
           throw new ItemInvalidoException("Item inválido");
        }
        itemDeUso.usarItemDeUso(this);
        itemEquipado = null;
    }

    public void usarItem(ItemDeAtaque itemDeAtaque, Corredor corredor) throws AlvoInvalidoException, ItemInvalidoException {
        if(this.itemEquipado != itemDeAtaque){
            throw new ItemInvalidoException("Item inválido");
        }

        if(this == corredor){
            throw new AlvoInvalidoException("Alvo inválido");
        }

        if(this.pistaQueFazParte != corredor.pistaQueFazParte){
            throw new AlvoInvalidoException("Alvo inválido");
        }

        if(corredor.getCasaOndeJogadorEsta() < 0){
            throw new AlvoInvalidoException("Alvo inválido");
        }

        itemDeAtaque.usarItemDeAtaque(corredor);
        itemEquipado = null;
    }

    public void receberAtaque(int dano){
        this.setVida(this.getVida() - dano);
        if(getVida() <= 0){
            pistaQueFazParte.removerCorredorDaPista(this);
            this.setCasaOndeJogadorEsta(-1);
            this.pistaQueFazParte = null;
        }
    }

    public void aumentarVida(int vidaRecuperada){
        this.setVida(this.getVida() + vidaRecuperada);
    }

    public void andar(int numeroDeCasasQueAnda){
        int casaOndeJogadorEstava = this.getCasaOndeJogadorEsta();
        setCasaOndeJogadorEsta(getCasaOndeJogadorEsta() + numeroDeCasasQueAnda);
        pistaQueFazParte.trocarCorredorDePosicao(this, casaOndeJogadorEstava);
    }
}