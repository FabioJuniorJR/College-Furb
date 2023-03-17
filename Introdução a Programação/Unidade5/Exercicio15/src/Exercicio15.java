import java.util.Scanner;
public class Exercicio15
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double media = 0;

        System.out.print("Digite o nome do aluno(a):");
        String nome = teclado.next();

        while (!nome.equalsIgnoreCase("Fim"))
        {
        System.out.print("Digite a nota1 do:");
        Double nota1 = teclado.nextDouble();
        System.out.print("Digite a nota2 do:");
        double nota2 = teclado.nextDouble();

        media = (nota1 + nota2)/2;
        System.out.println("A media do(a) "+nome+" é: "+media);

        System.out.println("Digite o nome do aluno(a):");
        nome = teclado.next();
        }
        teclado.close();
    }
}