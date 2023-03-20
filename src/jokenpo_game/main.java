package jokenpo_game;

import java.util.Random;
import java.util.Scanner;

public class main {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        var jokenpo = new Jokenpo();

        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, LAGARTO-LAGARTO, 5-SPOCK ]\n");
        int jogada = sc.nextInt();
        int computador = new Random().nextInt(5) + 1;
        System.out.println("O COMPUTADOR escolheu: " + Tipo.getInstance(computador));

        var algoritmo = getAlgoritmo(jogada);

        jokenpo.setAlgoritmo(algoritmo);
        Tipo tipoJogadaComputador = Tipo.getInstance(computador);

        jokenpo.jogar(tipoJogadaComputador);

        sc.close();

    }
    private static Algoritmo getAlgoritmo(Integer pId) {
        Algoritmo algoritmo = null;
        switch (pId) {
            case 1 -> algoritmo = new Pedra();
            case 2 -> algoritmo = new Papel();
            case 3 -> algoritmo = new Tesoura();
            case 4 -> algoritmo = new Spock();
            case 5 -> algoritmo = new Lagarto();
            default -> throw new IllegalStateException("Unexpected value: " + pId);
        }
        return algoritmo;
    }
}
