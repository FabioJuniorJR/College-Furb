import java.util.Scanner;

public class Exercicio9
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int quantidade_maior20 = 0;

        for (int cont = 0; cont < 3; cont++)
        {
            System.out.print("Digite o nome do aluno(a):");
            String nome = teclado.next();

            System.out.print("Digite a idade do(a) " + nome + " :");
            int idade = teclado.nextInt();

            if (idade == 18)
            {
                System.out.println(nome);
            }
            else{
                if (idade > 20)
                {
                    quantidade_maior20 = quantidade_maior20 + 1;
                    System.out.println(quantidade_maior20+"\n");
                }
                else{
                    System.out.println("A idade é inferior aos valores");
                }
            }
        }
        teclado.close();
    }
}