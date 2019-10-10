package ResidentEvil;

public class  Inventario {
    private Item inventarioDoJogo[][];
    private int espacosDisponiveis;
    private Item item;
    private double pesoTotal;
    private int linhas;
    private int colunas;
    private int cont;

    public Inventario(int linhas, int colunas) {
        inventarioDoJogo = new Item[linhas][colunas];
        this.linhas = linhas;
        this.colunas = colunas;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public Item pegarItemDoInventario(int linhas, int colunas){
        item = inventarioDoJogo[linhas][colunas];
        return item;
    }
    public boolean adicionarItem(Item item) {
        int numeroDeLinhasMatrizItem = item.getNumeroDeLinhasQueOcupa();
        int numeroDeColunasMatrizItem = item.getNumeroDeColunasQueOcupa();
        Item matrizItem [][] = new Item [numeroDeLinhasMatrizItem][numeroDeColunasMatrizItem];

        for (int i = 0; i <= linhas - numeroDeLinhasMatrizItem; i++) {
             r: for (int j = 0; j <= colunas - numeroDeColunasMatrizItem; j++) {
                for (int k = 0; k < numeroDeLinhasMatrizItem; k++) {
                    for (int l = 0; l < numeroDeColunasMatrizItem; l++) {
                        if (inventarioDoJogo[i + k][j + l] != matrizItem[k][l]){
                            continue r;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int contarEspacosDisponiveis(){
        for(int i = 0; i < linhas; i++){
            for(int j =0; j < colunas; j++){
                if(inventarioDoJogo[i][j] == null){
                    espacosDisponiveis++;
                }
            }
        }return espacosDisponiveis;
    }

    public void removerItem(Item item){
        for(int i = 0; i < linhas; i++){
            for(int j =0; j < colunas; j++){
                if(inventarioDoJogo[i][j] == item){
                    inventarioDoJogo[i][j]= null;
                }
            }
        }
    }
}
