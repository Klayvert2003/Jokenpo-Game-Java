package jokenpo_game;

import java.util.Map;

public class Lagarto extends Algoritmo{
    
@Override
public Map<String, String> executar(Tipo pTipo) {
    switch (pTipo) {
        case LAGARTO -> valor = "Empate. Lagarto empata com Lagarto!";
        case TESOURA -> valor = "Perdeu! Tesoura corta o Lagarto!";
        case PEDRA -> valor = "Perdeu! Pedra refuta o Lagarto!";
        case PAPEL -> valor = "Ganhou! Lagarto come o Papel!";
        case SPOCK -> valor = "Ganhou! Lagarto refuta o Spock!";
        default -> valor = "Opção inválida!";
    }

    resultado.put(KEY, valor);
    return resultado;
}  
}
