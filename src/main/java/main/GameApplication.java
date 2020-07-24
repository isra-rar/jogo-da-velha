package main;

import entities.Tabuleiro;

import java.util.Scanner;

public class GameApplication {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro();

        Scanner scanner = new Scanner(System.in);
        boolean jogadorX;
        boolean jogadorY;
        boolean finish = false;

        tabuleiro.printTabuleiro();

        do {
            do {
                System.out.println("Jogador X informe o N da linha e da coluna");
                jogadorX = tabuleiro.addX(scanner.nextInt(), scanner.nextInt());
                tabuleiro.printTabuleiro();

            } while (!jogadorX);

            if (tabuleiro.validateEndGameX() || tabuleiro.validateEndGameO()) {
                finish = true;
                break;
            }
                
            do {
                System.out.println("Jogador O informe  o N da linha e da coluna");
                jogadorY = tabuleiro.addO(scanner.nextInt(), scanner.nextInt());
                tabuleiro.printTabuleiro();

            } while (!jogadorY);

            if (tabuleiro.validateEndGameX() || tabuleiro.validateEndGameO()) {
                finish = true;
                break;
            }

        } while (!finish);

    }
}
