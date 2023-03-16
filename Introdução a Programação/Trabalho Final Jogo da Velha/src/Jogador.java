import java.util.Scanner;

public class Jogador {
    Scanner teclado = new Scanner(System.in);
    private char letraJogador = 'X';
    private Mapa mapa;

    public Jogador(Mapa mapa) {
        this.mapa = mapa;
    }

    public boolean jogar(Scanner teclado) {
        int repetir = 0;
        do {
            System.out.print("Jogador: \nLinha: ");
            int l = teclado.nextInt();
            System.out.print("Coluna: ");
            int c = teclado.nextInt();
            // conferindo
            if ((l < 0) || (l > 2) || (c < 0) || (c > 2)) {
                System.out.println("--------------\nJogada fora do mapa, jogue novamente!");// tirar se precisar ficar igual o da prof
                repetir = 1;
            } else if (!mapa.jogar(l, c, letraJogador)) {
                System.out.println("--------------\nposição inválida!");
                repetir = 1;
            } else {
                // vai fazer repetir caso tenha uma jogada invalida
                repetir = 0;
            }
        } while (repetir == 1);

        if (mapa.verificarGanhador(letraJogador)) {
            System.out.println(" ... Jogador GANHOU!");
            return true;
        } else {
            return false;
        }
    }
}