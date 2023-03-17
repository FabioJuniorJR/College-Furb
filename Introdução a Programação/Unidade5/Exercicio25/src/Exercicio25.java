import java.util.Scanner;

public class Exercicio25
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int ponto_joga_D = 0;
        int ponto_joga_E = 0;
        int diferenca_pontuacao = 0;
        String direcao_ponto = "";

        System.out.print("Digite qual jogador marcou o ponto (D)(E) :");
            direcao_ponto = teclado.next();
            
            if(direcao_ponto.equalsIgnoreCase("d"))
            {
                ponto_joga_D += 1;
            }
            else{
                ponto_joga_E += 1;
            }

            diferenca_pontuacao = ponto_joga_D - ponto_joga_E;

            if(diferenca_pontuacao < 0)
            {
                diferenca_pontuacao = diferenca_pontuacao * -1;
            }
        while (ponto_joga_D != 5 || ponto_joga_E != 5) 
        {
            System.out.print("Digite qual jogador marcou o ponto (D)(E) :");
            direcao_ponto = teclado.next();
            
            if(direcao_ponto.equalsIgnoreCase("d"))
            {
                ponto_joga_D += 1;
            }
            else{
                ponto_joga_E += 1;
            }

            diferenca_pontuacao = ponto_joga_D - ponto_joga_E;

            if(diferenca_pontuacao < 0)
            {
                diferenca_pontuacao = diferenca_pontuacao * -1;
            }
        }
        if(ponto_joga_D > ponto_joga_E)
        {
            System.out.print("O jogador da direira ganhou com: "+ponto_joga_D);
        }
        else{
            System.out.print("O jogador da esquerda ganhou com: "+ponto_joga_E);
        }
        teclado.close();
    }
}