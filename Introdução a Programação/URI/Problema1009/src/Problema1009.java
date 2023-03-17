//import java.text.DecimalFormat;
//import java.util.Scanner;
//public class Problema1009//Main
//{
    //public static void main(String[]args)
   // {
//Faça um programa que leia o nome do vendedor, seu salário fixo e o valor total da venda feita por ele mesmo no mês (em dinheiro). Considerando que esse vendedor recebe 15% sobre,
//todos os produtos vendidos, escreva o salário final (total) desse vendedor no final do mês, com duas casas decimais.

//- Não se esqueça de imprimir o final da linha após o resultado, caso contrário você receberá “Erro de apresentação”.

//- Não se esqueça dos espaços em branco.

//Entrada
//O arquivo de entrada contém um texto (nome do funcionário) e dois valores de precisão dupla, que são o salário do vendedor e o valor total vendido por ele.

//Resultado
//Imprime o salário total do vendedor, conforme o exemplo dado. 
        //Scanner teclado = new Scanner(System.in);
       // DecimalFormat decimalFormat = new DecimalFormat("000.00");

        
       // String nome_cidadao = teclado.next();

       
      //  double salario_fixo_cidadao = teclado.nextDouble();

        
      //  double valor_venda_mes = ;
      

      //  double salario_final = salario_fixo_cidadao + valor_venda_mes; 

        //System.out.println("salario_final = "+decimalFormat.format(salario_final));
      //  teclado.close();

   // }
//}
import java.text.DecimalFormat;
import java.util.Scanner;
public class Problema1009
{
    public static void main(String[]args)
    {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("digite o nome");
        String nome_vendedor = teclado.next();

        System.out.println("digite o salario fixo");
        double salario_fixo_vendedor = teclado.nextDouble();

        System.out.println("digite o valor venda mes");
        double valor_venda_mes = teclado.nextDouble();
      
        double porcentagem = valor_venda_mes * 15 / 100.0f;
        
        double salario_final = salario_fixo_vendedor + porcentagem; 

        System.out.println("TOTAL = R$ "+decimalFormat.format(salario_final));
       
        teclado.close();

    }
}