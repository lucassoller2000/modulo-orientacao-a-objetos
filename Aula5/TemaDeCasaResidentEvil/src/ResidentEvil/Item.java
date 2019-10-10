package ResidentEvil;

public class Item {
    private String nome;
    private int numeroDeLinhasQueOcupa;
    private int numeroDeColunasQueOcupa;
    private double peso;
    private Inventario inventario;

     public Item(String nome, int numeroDeLinhasQueOcupa, int numeroDeColunasQueOcupa, double peso) {
         this.nome = nome;
         this.numeroDeLinhasQueOcupa = numeroDeLinhasQueOcupa;
         this.numeroDeColunasQueOcupa = numeroDeColunasQueOcupa;
         this.peso = peso;
     }

     public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public int getNumeroDeLinhasQueOcupa() {
        return numeroDeLinhasQueOcupa;
    }

    public int getNumeroDeColunasQueOcupa() {
        return numeroDeColunasQueOcupa;
    }


}