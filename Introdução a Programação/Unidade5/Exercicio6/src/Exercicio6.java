import java.util.Scanner;
public class Exercicio6
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        double altura = 0;
        double media = 0;
        double soma_alturas = 0;

        for(int cont = 0; cont < 5; cont++)
        {
            System.out.println("Digite a altura das pessoas:");
            altura =  teclado.nextDouble();
            soma_alturas += altura;
        }
        media = soma_alturas / 5;
        System.out.println("A média das alturas é: "+media);

            teclado.close();
    }
}
