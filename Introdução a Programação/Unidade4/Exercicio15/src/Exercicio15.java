import java.util.Scanner;
public class Exercicio15
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite os meses de admissão:");
        int tempo_adm  =  teclado.nextInt();

        if(tempo_adm <= 12)
        {
            System.out.println("Recebera 5% de reajuste");
        }
        else{
            if(tempo_adm >= 13 && tempo_adm <=48)
            {
                System.out.println("Recebera 7% de reajuste"); 
            }

        teclado.close();
       }
    }
}