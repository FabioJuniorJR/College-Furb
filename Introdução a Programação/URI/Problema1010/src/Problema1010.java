/*Neste problema, a tarefa é ler o código de um produto 1, o número de unidades do produto 1, o preço de uma unidade do produto 1, o código de um produto 2, o número de unidades do produto 2 e 
o preço para uma unidade do produto 2. Após, calcule e mostre o valor a ser pago.
                                      10                        6                                   100
Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores: dois inteiros e um valor flutuante com 2 dígitos após a vírgula decimal.

Resultado
O arquivo de saída deve ser uma mensagem como o exemplo a seguir, onde "Valor a pagar" significa Valor a pagar. Lembre-se do espaço após ":" e após o símbolo "R $". O valor deve 
ser apresentado com 2 dígitos após o ponto. 
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class Problema1010
{
    public static void main(String[]args)
    {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.print("Digite codigo produto1:");
        int codigo_produto1 = teclado.nextInt();
        System.out.print("Digite numero produto1:");
        int quantidade_produto1 = teclado.nextInt();
        System.out.print("Digite preco produto1:");
        double preco_produto1 = teclado.nextDouble();
        System.out.print("Digite codigo produto2:");
        int codigo_produto2 = teclado.nextInt();
        System.out.print("Digite numero produto2:");
        int quantidade_produto2= teclado.nextInt();
        System.out.print("Digite preco produto2:");
        double preco_produto2 = teclado.nextDouble();
        double valor_a_pagar = (preco_produto1*quantidade_produto1)+(preco_produto2*quantidade_produto2);

        

        System.out.println("Valor a pagar: R$ "+decimalFormat.format(valor_a_pagar));

        teclado.close();

    }
}

   
        
       
