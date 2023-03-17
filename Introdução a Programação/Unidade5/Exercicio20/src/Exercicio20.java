import java.util.Scanner;

public class Exercicio20
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double massa_inicial = 0;
        double massa_final = 0;
        double soma_tempo_levado = 0;

        System.out.print("Digite massa inicial em KG:");
        massa_inicial = teclado.nextDouble();  
        
        soma_tempo_levado += 50;
        massa_final = massa_inicial /2 ;

        while (massa_final >= 0.5)
        {
            soma_tempo_levado += 50;
            massa_final = massa_final /2 ;
        }
         System.out.println("A massa inicial é: "+massa_inicial);
         System.out.println("A massa final é: "+massa_final);
         System.out.println("O tempo levado em segundos foi de: "+soma_tempo_levado+" segundos");
         soma_tempo_levado = soma_tempo_levado / 60;
         System.out.println("O tempo levado em minutos foi de: "+soma_tempo_levado+" minutos");
        teclado.close();
    }
}