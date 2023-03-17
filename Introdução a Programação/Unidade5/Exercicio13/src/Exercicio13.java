import java.util.Scanner;

public class Exercicio13
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int qtdParadas = 0;
        double valor_odometro = 0;
        double qtd_enchido = 0;
        double inicial_odometro = 0;
        double totalKm = 0;
        double total_enchido = 0;
        double autonomiaMedia = 0;
        double autonomia_por_parada = 0;

        System.out.println("Qual e a quantia inicial do Odômetro:");
        inicial_odometro = teclado.nextDouble();
        System.out.println("Quantas paradas foram relizadas");
        qtdParadas = teclado.nextInt();

        for (int indice = 1; indice <= qtdParadas; indice++)
        {
            System.out.println("Valor atual do Odômetro");
            valor_odometro = teclado.nextDouble();
            System.out.println("Quantos litros foram necessarios para encher o tanque:");
            qtd_enchido = teclado.nextDouble();
            for (int ind = 1; ind <= qtdParadas; ind++)
            {
                totalKm = totalKm + (valor_odometro - inicial_odometro);
                total_enchido = total_enchido + qtd_enchido;
                autonomiaMedia = totalKm / total_enchido;
            }
            autonomia_por_parada = (valor_odometro - inicial_odometro) / qtd_enchido;
            System.out.println("A autonomia até está parada foi de: "+ autonomia_por_parada +" Km/L");
            inicial_odometro = valor_odometro;
        }
        System.out.println("A autonomia média foi de: "+ autonomiaMedia + " Km/L");
        teclado.close();
    }
}