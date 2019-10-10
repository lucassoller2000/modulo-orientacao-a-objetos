import Personagens.Personagem;

import java.util.Arrays;
import java.util.List;

public class OrdenacaoPorNome {
    public List<Personagem> ordenar(List<Personagem> personagems) {
        Personagem[] personagensOrdenados = new Personagem[personagems.size()];
        personagensOrdenados = personagems.toArray(personagensOrdenados);

        int numeroDePersonagens = personagensOrdenados.length;

        for (int i = 0; i < numeroDePersonagens; i++) {
            for (int j = 0; j < numeroDePersonagens - 1; j++) {
                Personagem personagemA = personagensOrdenados[j];
                Personagem personagemB = personagensOrdenados[j + 1];

                if (this.personagemAMaiorQueB(personagemA, personagemB)) {
                    personagensOrdenados[j] = personagemB;
                    personagensOrdenados[j + 1] = personagemA;
                }
            }
        }

        return Arrays.asList(personagensOrdenados);
    }
    protected boolean personagemAMaiorQueB(Personagem personagemA, Personagem personagemB) {
        return personagemA.getNomeDoPersonagem()
                .compareToIgnoreCase(personagemB.getNomeDoPersonagem())
                > 0;
    }
}
