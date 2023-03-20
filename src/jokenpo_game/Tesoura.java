package jokenpo_game;

import java.util.Map;

public class Tesoura extends Algoritmo{
    
@Override
public Map<String, String> executar(Tipo pTipo) {
    switch (pTipo) {
        case TESOURA -> valor = "Empate. Tesoura empata com Tesoura!";
        case PAPEL -> valor = "Ganhou! Tesoura corta o Papel!";
        case PEDRA -> valor = "Perdeu! Pedra quebra a Tesoura!";
        case LAGARTO -> valor = "Ganhou! Tesoura corta o Lagarto!";
        case SPOCK -> valor = "Perdeu! Spock refuta a Tesoura!";
        default -> valor = "Opção inválida!";
    }

    resultado.put(KEY, valor);
    return resultado;
}  
}
