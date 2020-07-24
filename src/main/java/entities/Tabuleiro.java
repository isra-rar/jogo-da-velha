package entities;

public class Tabuleiro {

    private char[][] tabuleiro = new char[3][3];

    public void printTabuleiro() {
        System.out.println("  " +tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2]);
        System.out.println(" -----------");
        System.out.println("  " +tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
        System.out.println(" -----------");
        System.out.println("  " +tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2]);
    }

    public boolean addX(int positionX, int positionY) {
        if (tabuleiro[positionX][positionY] == 0) {
            tabuleiro[positionX][positionY] = 'X';
            return true;
        } else {
            System.out.println("Posição já ocupada");
            return false;
        }
    }

    public boolean addO(int positionX, int positionY) {
        if (tabuleiro[positionX][positionY] == 0) {
            tabuleiro[positionX][positionY] = 'O';
            return true;
        } else {
            System.out.println("Posição já ocupada");
            return false;
        }
    }

    public boolean validateEndGameX() {
        if (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') {
            return true;
        } else if (tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') {
            return true;
        } else if (tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') {
            return true;
        } else if (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') {
            return true;
        } else if (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') {
            return true;
        } else if (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') {
            return true;
        } else if (tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X') {
            return true;
        } else if (tabuleiro[2][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][1] == 'X') {
            return true;
        } else if (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateEndGameO() {
        if (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') {
            return true;
        } else if (tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') {
            return true;
        } else if (tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') {
            return true;
        } else if (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') {
            return true;
        } else if (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') {
            return true;
        } else if (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') {
            return true;
        } else if (tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O') {
            return true;
        } else if (tabuleiro[2][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][1] == 'O') {
            return true;
        } else if (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') {
            return true;
        } else {
            return false;
        }
    }
}
