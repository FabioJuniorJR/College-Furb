import java.util.Scanner;
public class Exercicio1_Problema1046
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a hora do inicio do jogo:");
        int hora_inicio =  teclado.nextInt();
        System.out.print("Digite a hora do termino do jogo:");
        int hora_termino =  teclado.nextInt();
        int jogo_durou = 24 - (24 + hora_inicio - hora_termino ) % 24;
        if(hora_inicio == hora_termino)
        {
            System.out.println("O JOGO DUROU 24 HORAS(S)");
        }
        else{
               System.out.println("O JOGO DUROU "+jogo_durou+" HORAS(S)");
            }
    teclado.close();
    }
}