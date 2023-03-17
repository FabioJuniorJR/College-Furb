import java.util.Scanner;
public class Exercicio22
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero do curso: \n1-Ciencia da Computacao \n2-Licenciatura da Computacao \n3-Sistemas de Informacao\n");
        int curso =  teclado.nextInt();

        switch (curso) {
            case 1: System.out.print("Ciencia da Computacao");
            break; 
            case 2: System.out.print("Licenciatura da Computacao");
            break;
            case 3: System.out.print("Bacharel em Sistemas de Informacao");
            break;
            default: System.out.print("Curso Invalido");
        }
        
        teclado.close();
    }
}