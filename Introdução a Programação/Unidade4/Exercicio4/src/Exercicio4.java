import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

         Scanner teclado = new Scanner(System.in);

         System.out.print("Digite um número de ponto flutuante maior que 0: ");
         float numero = teclado.nextFloat();

         String numeroS = String.valueOf(numero);
         int posicaoPonto = numeroS.indexOf(".");
         String parteDecimal = numeroS.substring(posicaoPonto, numeroS.length());
         if (!parteDecimal.equals(".0")) {
             System.out.println("Possui casas decimais");
         }  else {
             System.out.println("Não possui casas decimais");
         }


         teclado.close();
    }
}