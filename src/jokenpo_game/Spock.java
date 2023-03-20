package jokenpo_game;

import java.util.Map;

public class Spock extends Algoritmo{
    
@Override
public Map<String, String> executar(Tipo pTipo) {
    switch (pTipo) {
        case SPOCK -> valor = "Empate. Spock empata com Spock!";
        case TESOURA -> valor = "Ganhou! Spock refuta a Tesoura!";
        case PEDRA -> valor = "Ganhou! Spock refuta a Pedra!";
        case LAGARTO -> valor = "Perdeu! Lagarto reuta o Spock!";
        case PAPEL -> valor = "Perdeu! Papel corta o Spock!";
        default -> valor = "Opção inválida!";
    }

    resultado.put(KEY, valor);
    return resultado;
}  
}
