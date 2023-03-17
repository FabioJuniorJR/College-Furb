import java.util.Scanner;
public class Exercicio5
{
    public static void main(String[] args)
    {
        int novo_numero = 8;
        int numero_antigo = 8;
        int cont = 0;

        Scanner teclado = new Scanner(System.in); 

        System.out.print("Digite um numero maior que 2: ");
        int numero = teclado.nextInt();

        if(numero > 2)
        {
            for(int contador = 1; contador <= numero; contador++);
            {
                cont++;
                if(cont == 3)
                {
                    numero_antigo *= 2;
                    System.out.println(numero_antigo);
                    novo_numero = numero_antigo;
                    cont = 1;
                }
                else{
                    System.out.println(novo_numero);
                }
                novo_numero += 2;
            }
        }
            else{
                System.out.println("Numero Invalido");
        }
        teclado.close();
    }
}