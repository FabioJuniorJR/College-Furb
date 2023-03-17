import java.util.Scanner;
public class Exercicio11
{
    public static void main(String[]args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a Data de nascimento do filho 1:");
        int filho1 = entrada.nextInt();

        System.out.print("Digite a Data de nascimento do filho 2:");
        int filho2 = entrada.nextInt();

        System.out.print("Digite a Data de nascimento do filho 3:");
        int filho3 = entrada.nextInt();

        if(filho1 == filho2 && filho1 == filho3)
        {
           System.out.println("São Trigemeos: Filho1, Filho2 e Filho3"); 
        }
        else 
        if(filho1 == filho2 )
        {
            System.out.println("São Gemeos: Filho1 e Filho2");
            System.out.println("Filho3 não é Gemeo"); 
        } 
        else
        if(filho1 == filho3)
        {
            System.out.println("São Gemeos: Filho1 e Filho3");
            System.out.println("Filho2 não é Gemeo"); 
        }  
        else
        if(filho2 == filho3)
        {
            System.out.println("São Gemeos: Filho2 e Filho3");
            System.out.println("Não é Gemeo: Filho1"); 
        }    
        else
        if(filho1 != filho2 && filho1 != filho3)
        {
            System.out.println("São Irmaões: Filho1, Filho2 e Filho3");
        }
        entrada.close();
    }
}