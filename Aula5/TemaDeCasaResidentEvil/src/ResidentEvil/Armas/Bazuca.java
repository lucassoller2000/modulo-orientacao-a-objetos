package ResidentEvil.Armas;

import ResidentEvil.Item;
import ResidentEvil.Municoes.MisselDeBazuca;

public class Bazuca extends Item {

    public Bazuca() {
        super("Bazuca", 4, 10, 30);
    }

    public void atirarComBazuca(MisselDeBazuca misselDeBazuca){
        misselDeBazuca.getInventario().removerItem(misselDeBazuca);
    }
}
