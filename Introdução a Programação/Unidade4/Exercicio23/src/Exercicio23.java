import java.util.Scanner;
public class Exercicio23
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero do mes:\n1-Janeiro\n2-Fevereiro\n3-Março\n4-Abril\n5-Maio\n6-Junho\n7-Julho\n8-Agosto\n9-Setembro\n10-Outubro\n11-Novembro\n12-Dezembro\n");
        int num_mes =  teclado.nextInt();

        switch (num_mes) {
            case 1:
            System.out.print("Janeiro");
            break; 
            case 2:
            System.out.print("Fevereiro");
            break;
            case 3: 
            System.out.print("Março");
            break; 
            case 4: 
            System.out.print("Abril");
            break; 
            case 5: 
            System.out.print("Maio");
            break; 
            case 6:
            System.out.print("Junho");
            break; 
            case 7: 
            System.out.print("Julho");
            break; 
            case 8: 
            System.out.print("Agosto");
            break; 
            case 9: 
            System.out.print("Setembro");
            break; 
            case 10: 
            System.out.print("Outubro");
            break; 
            case 11: 
            System.out.print("Novembro");
            break; 
            case 12: 
            System.out.print("Dezembro");
            break;
            default: 
            System.out.print("Valor nao Valido");
        }
            teclado.close();
        }
    }