import java.util.Scanner;
public class Exercicio6
{
    public static void main(String[]args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite digite a letra M, F ou I:");
        String letra = teclado.next();
        letra = letra.toUpperCase();
        letra = letra.trim();
       
        char primeira_lertra = letra.charAt(0);

        if(primeira_lertra == 'M')
        {
            System.out.println("Masculino");
        }
        else
        if(primeira_lertra == 'F')
        {
            System.out.println("Feminino");
        }
        else
        if(primeira_lertra == 'I')
        {
            System.out.println("Nao Informado");
        }
        else
        System.out.println("Entrada Incorreta");

        teclado.close();
        
    }
}








