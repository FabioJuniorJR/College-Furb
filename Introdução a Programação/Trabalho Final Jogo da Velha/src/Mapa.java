public class Mapa {
    private char mapa[][] = new char[3][3];

    public int sortear(int inicio, int fim) {
        return (int) ((Math.random() * fim) - inicio);
    }

    public void limpar() {
        for (int l = 0; l < mapa.length; l++) {
            for (int c = 0; c < 3; c++) {
                mapa[l][c] = ' ';
            }
        }
    }

    public void desenhar(int jogada) {
        System.out.println("-------------  .. " + jogada + "ª jogada");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (c == 0 || c == 1) {
                    System.out.print(mapa[l][c] + " | ");
                } else {
                    System.out.println(mapa[l][c]);
                }
            }
        }
        System.out.println("-------------------------");
    }

    public boolean jogar(int l, int c, char jogador) {
        char teste = ' ';
        if (mapa[l][c] == teste) {
            mapa[l][c] = jogador;
            return true;
        }
        return false;
    }

    public boolean verificarGanhador(char jogador) {
        // diagonal
        if ((mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador)
                || (mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador)) {
            return true;
        }

        for (int i = 0; i < 3; i++) {
            if (mapa[i][0] == jogador && mapa[i][1] == jogador && mapa[i][2] == jogador) {
                return true;
            }
            if (mapa[0][i] == jogador && mapa[1][i] == jogador && mapa[2][i] == jogador) {
                return true;
            }
        }
        /*
         * empate caso ninguem venca int empate = 0; for (int l = 0; l < 3; l++) { for
         * (int c = 0; c < 3; c++) { if (mapa[l][c] == ' ') { empate++; } } } if (empate
         * == 0) { System.out.println("... EMPATOU!"); }
         */
        return false;
    }
}