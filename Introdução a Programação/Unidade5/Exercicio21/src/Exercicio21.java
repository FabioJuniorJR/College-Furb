import java.util.Scanner;

public class Exercicio21
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double Chico_cresc = 0.2;
        double Ze_cresc = 0.3;
        double soma_anos = 0;
       
        System.out.print("Digite Digite a altura do Chico em metros:");
        double alt_Chico = teclado.nextDouble(); 
        
        System.out.print("Digite Digite a altura do Zé em metros:");
        double alt_Ze = teclado.nextDouble();   

        while (alt_Ze < alt_Chico) 
        {
            alt_Chico += Chico_cresc;
            alt_Ze += Ze_cresc;
            soma_anos += 1;
        }
        System.out.print("Zé sera maior que chico em: "+soma_anos+" anos");
        teclado.close();
    }
}