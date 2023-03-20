package jokenpo_game;

import java.util.Map;

public class Pedra extends Algoritmo{
  
@Override
public Map<String, String> executar(Tipo pTipo) {
    switch (pTipo) {
        case PEDRA -> valor = "Empate. Pedra empata com Pedra!";
        case TESOURA -> valor = "Ganhou! Pedra quebra Tesoura!";
        case PAPEL -> valor = "Perdeu! Papel embrulha a Pedra!";
        case LAGARTO -> valor = "Ganhou! Pedra refuta o Lagarto!";
        case SPOCK -> valor = "Perdeu! Spock refuta a Pedra!";
        default -> valor = "Opção inválida!";
    }

    resultado.put(KEY, valor);
    return resultado;
}
}
