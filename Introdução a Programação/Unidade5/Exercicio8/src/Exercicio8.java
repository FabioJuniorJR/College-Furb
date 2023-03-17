import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double maior = 0;
        double menor = 0;
        double media = 0;

        System.out.println("Digite a quantidade de números:");
        int num = teclado.nextInt();

        for(int cont = 1; cont <= num; cont++)
        {
            System.out.println("Digite um número:");
            double numero = teclado.nextDouble();

            if (numero < 0)
            {
                if (numero > 0) {
                    media = media + numero;
                    cont++;
                }
            }
            System.out.println("Média é " + media / cont++);
            System.out.println("Menor número negativo é " + menor);

            teclado.close();
        }
    }
}