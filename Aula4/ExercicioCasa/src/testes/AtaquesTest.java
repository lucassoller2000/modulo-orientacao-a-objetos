package testes;

import armasEDefesas.Ariete;
import armasEDefesas.Arma;
import armasEDefesas.Catapulta;
import org.junit.jupiter.api.Test;
import armasEDefesas.Castelo;
import armasEDefesas.Muro;

import static org.junit.jupiter.api.Assertions.*;

class AtaquesTest {

    @Test
    public void testarSeOCasteloFoiDestruidoPelaCatapultaComAltura4000(){
        //Arrange
        Arma catapulta = new Catapulta("catapulta",4000);
        Muro muro = new Muro();
        Castelo castelo = new Castelo("Kings Landing",1000,muro);
        //Act
        castelo.receberAtaque(catapulta);
        boolean esperado = true;
        boolean obtido = castelo.saberSeFoiDestruido();
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void testarSeOCasteloFoiDestruidoPelaArma20(){
        //Arrange
        Arma arma = new Arma("pedra");
        Muro muro = new Muro();
        Castelo castelo = new Castelo("Dragon Stone",1000,muro);
        //Act
        castelo.receberAtaque(arma);
        boolean esperado = false;
        boolean obtido = castelo.saberSeFoiDestruido();
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void testarSeADefesaDoMuroDiminiuiPra9000DepoisDeReceberAtaqueDeAriete1000(){
        //Arrange
        Arma ariete = new Ariete("ariete",true);
        Muro muro = new Muro();
        Castelo castelo = new Castelo("Winterfell",1000,muro);
        //Act
        castelo.receberAtaque(ariete);
        int esperado = 9000;
        int obtido = muro.getPontosDeDefesaDoMuro();
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void testarSeAaDefesaDoMuroDiminiuiPra9980DepoisDeReceberAtaqueDeArma20(){
        //Arrange
        Arma arma = new Arma("lança");
        Muro muro = new Muro();
        Castelo castelo = new Castelo("Casterly Rock",1000,muro);
        //Act
        castelo.receberAtaque(arma);
        int esperado = 9980;
        int obtido = muro.getPontosDeDefesaDoMuro();
        //Assert
        assertEquals(esperado,obtido);
    }
    @Test
    public void testarSeAaDefesaDoCasteloDiminiuiPra1000DepoisDeReceber2AtaquesDeCatapulta4500(){
        //Arrange
        Arma catapulta = new Catapulta("catapulta",500);
        Muro muro = new Muro();
        Castelo castelo = new Castelo("High Garden",10000,muro);
        //Act
        castelo.receberAtaque(catapulta);
        castelo.receberAtaque(catapulta);
        int esperado = 1000;
        int obtido = castelo.getPontosDeDefesaDoCastelo();
        //Assert
        assertEquals(esperado,obtido);
    }
}