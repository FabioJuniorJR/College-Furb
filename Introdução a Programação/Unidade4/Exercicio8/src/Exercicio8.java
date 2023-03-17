import java.util.Scanner;
public class Exercicio8
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma letra:");
        String letra_entrada = teclado.next().trim().toUpperCase();

        char Letra = letra_entrada.charAt(0);

        if(Letra == 'A' || Letra == 'E' || Letra == 'I' || Letra == 'O' || Letra == 'U' ){
            System.out.println("É vogal:"+Letra);
        }
        else {
        System.out.println("Não é vogal:"+Letra);
        }
        teclado.close();
    }
}

