import java.util.Scanner;

public class Exercicio22
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double aumento_anual = 0;
        double salario_inicial = 0;
        double salario_adiante = 0;
        int ano_atual = 0;
        double valor_aumento= 0;
        double aumento = 1.5;
        
       System.out.print("Digite o ano de contratacao:");
        ano_atual = teclado.nextInt(); //1995
        System.out.print("Digite o salario inicial:");
        salario_inicial = teclado.nextDouble(); //1995

        ano_atual += 1;
        valor_aumento = (salario_inicial * 1.5) /100;//1996
        salario_adiante = salario_inicial + valor_aumento;

        while (ano_atual != 2000) 
        {
        ano_atual += 1; //1997
        aumento = aumento * 2;
        valor_aumento = (salario_adiante * aumento) /100;
        salario_adiante = salario_adiante + valor_aumento;
        }
        System.out.println("O salario atual do funcionario é: "+salario_adiante);
        teclado.close();
    }
}