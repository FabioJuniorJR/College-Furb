import java.util.Scanner;
public class Exercicio26
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor:");
        double valor = teclado.nextDouble();
        double distancia = 0;
        double custo_pedagio = 0;
        int trechos_acima = 0;
        int trechos_acima150 = 0;
        int entradas = 0;
        while(custo_pedagio >= 0)
        {
            System.out.println("Digite o valo do pedagio:");
            custo_pedagio = teclado.nextDouble();
            if(custo_pedagio >= 0)
            {
                System.out.println("Digite a distancia:");
                distancia = teclado.nextDouble();
                entradas++;
            }
            if(custo_pedagio > valor)
            {
                trechos_acima++;
            }
        }
        System.out.println("Trechos com valor acima do que nao quer pagar: " + trechos_acima);
        System.out.println("Quantidade de trechos infirmados: " + entradas);
        System.out.println("Trechos acima de 150Km com valor que pode pagar: " + trechos_acima150);
        teclado.close();
    }
}