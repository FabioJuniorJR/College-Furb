import java.util.Scanner;

public class JogoDaVelha {
    Scanner teclado = new Scanner(System.in);
    Mapa jogoMapa = new Mapa();
    PC jogoPC = new PC(jogoMapa);
    Jogador jogoJogador = new Jogador(jogoMapa);

    private JogoDaVelha() {

        String opcao;
        jogar(teclado);
        do {
            System.out.print("Deseja jogar novamente(s/n)? ");
            opcao = teclado.next();
            switch (opcao) {
                case "s":// sim continuar
                    jogar(teclado);
                    break;
                case "n":// nao continuar
                    break;
                default:
                    System.out.println(" .. opção inválida .. ");
                    break;
            }
        } while (!opcao.equalsIgnoreCase("n"));
    }

    private void jogar(Scanner teclado) {
        int jogada = 1;
        jogoMapa.limpar();
        int pJogador = jogoMapa.sortear(0, 2);
        // primeiro jogador
        if (pJogador == 0) {
            System.out.println("O jogador inicia");
            jogoJogador.jogar(teclado);
        } else {
            System.out.println("O PC inicia");
            jogoPC.jogar();
        }
        jogoMapa.desenhar(jogada);
        // resto do jogo
        for (jogada = 2; jogada <= 10; jogada++) { // alternar jogadas
            if (jogada == 10) {
                System.out.println(" ... EMPATOU!");
                break;
            }
            if (pJogador == 0) {
                pJogador = 1;
                System.out.println("Vez do PC");
                if (jogoPC.jogar()) {
                    jogoMapa.desenhar(jogada);
                    break;
                }
            } else if (pJogador == 1) {
                pJogador = 0;
                if (jogoJogador.jogar(teclado)) {
                    jogoMapa.desenhar(jogada);
                    break;
                }
            }
            jogoMapa.desenhar(jogada);
        }
    }

    public static void main(String[] args) {
        new JogoDaVelha();
    }
}