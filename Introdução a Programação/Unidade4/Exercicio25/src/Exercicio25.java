import java.util.Scanner;
public class Exercicio25
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor 1:");
        int valor1 =  teclado.nextInt();

        System.out.print("Digite o valor 2:");
        int valor2 =  teclado.nextInt();

        System.out.print("Escolha uma opcao: 1 (Soma de dois numeros), 2 (Diferença entre dois numeros), 3 (Produto entre dois numeros), 4 (Divisão entre dois numeros): ");
        int opcao =  teclado.nextInt();

        switch (opcao) {
            case 1:
            int soma = valor1 + valor2;
            System.out.print("A soma vale: "+soma);
            break;
            case 2:
            int diferenca = valor1 - valor2;
            System.out.print("A diferença vale: "+diferenca);
            break;
            case 3:
            int produto = valor1 * valor2;
            System.out.print("O produto entre dois numeros vale: "+produto);
            break;
            case 4:
            if(valor2 == 0)
            System.out.print("ERRO, o valor inicial nao pode ser 0");
            else{
                if(valor1 != 0 && valor2 != 0);
                double divisao = valor1 / valor2;
                System.out.print("A divisao vale: "+divisao);
            }
            break;
            default:
            System.out.println("Opção Invalida");
        }

            teclado.close();
        }
    }