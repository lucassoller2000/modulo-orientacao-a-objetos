import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagoArcanoTest {

    @Test
    public void testarOAumentoDePoder21PorTreinar3VezesNaAcademiaComPoderInicial2(){
        MagoArcano magoArcano = new MagoArcano();
        AcademiaArcana academiaArcana = new AcademiaArcana();
        academiaArcana.treinaNaAcademiaArcana(magoArcano);
        academiaArcana.treinaNaAcademiaArcana(magoArcano);
        academiaArcana.treinaNaAcademiaArcana(magoArcano);

        int poderEsperado=21;
        int poderObtido=magoArcano.getPoderMagico();

        assertEquals(poderEsperado,poderObtido);
    }

    @Test
    public void testarPoderDoFogo8UsandoQuantidadeDeMana1ENivelAcademia5(){
        MagoArcano magoArcano = new MagoArcano();
        AcademiaDoFogo academiaDoFogo = new AcademiaDoFogo(5);

        int nivelDaAcademia = academiaDoFogo.treinarNaAcademiaDoFogo(magoArcano);
        int poderDoFogoEsperado = 8;
        int poderDoFogoObtido =  magoArcano.lancarBolasDeFogo(1,nivelDaAcademia);

        assertEquals(poderDoFogoEsperado,poderDoFogoObtido);
    }
    @Test
    public void testarPoderDoFogo11UsandoQuantidadeDeMana100SendoMenorDoQueManaDoMago4ENivelAcademia5(){
        MagoArcano magoArcano = new MagoArcano();
        AcademiaDoFogo academiaDoFogo = new AcademiaDoFogo(5);

        int nivelDaAcademia = academiaDoFogo.treinarNaAcademiaDoFogo(magoArcano);
        int poderDoFogoEsperado = 11;
        int poderDoFogoObtido =  magoArcano.lancarBolasDeFogo(100,nivelDaAcademia);

        assertEquals(poderDoFogoEsperado,poderDoFogoObtido);
    }

    @Test
    public void testarPoderDoFogo0UsandoQuantidadeDeMana1ESemTreinarNaAcademia(){
        MagoArcano magoArcano = new MagoArcano();
        AcademiaDoFogo academiaDoFogo = new AcademiaDoFogo(5);

        int poderDoFogoEsperado = 0;
        int poderDoFogoObtido =  magoArcano.lancarBolasDeFogo(100,5);

        assertEquals(poderDoFogoEsperado,poderDoFogoObtido);
    }

    @Test
    public void testarPoderDoFogo0UsandoMaximoPossivelDeMana100ENivelAcademia5(){
        MagoArcano magoArcano = new MagoArcano();
        AcademiaDoFogo academiaDoFogo = new AcademiaDoFogo(5);

        int nivelDaAcademia = academiaDoFogo.treinarNaAcademiaDoFogo(magoArcano);
        magoArcano.lancarBolasDeFogo(100, nivelDaAcademia);

        int poderDoFogoEsperado = 0;
        int poderDoFogoObtido =  magoArcano.lancarBolasDeFogo(1, nivelDaAcademia);

        assertEquals(poderDoFogoEsperado,poderDoFogoObtido);
    }

    @Test
    public void testarMana0UsandoMaximoPossivelDeMana100ENivelAcademiaa5(){
        MagoArcano magoArcano = new MagoArcano();
        AcademiaDoFogo academiaDoFogo = new AcademiaDoFogo(5);

        int nivelDaAcademia = academiaDoFogo.treinarNaAcademiaDoFogo(magoArcano);

        magoArcano.lancarBolasDeFogo(100, nivelDaAcademia);
        magoArcano.lancarBolasDeFogo(100, nivelDaAcademia);

        int manaDoFogoEsperada = 0;
        int manaDoFogoObtida = magoArcano.getMana();

        assertEquals(manaDoFogoEsperada,manaDoFogoObtida);
    }
}