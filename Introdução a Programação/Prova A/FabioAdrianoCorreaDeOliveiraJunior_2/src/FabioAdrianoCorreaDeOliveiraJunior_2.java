import java.util.Scanner;
public class FabioAdrianoCorreaDeOliveiraJunior_2
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da nota1:");
        double nota1 =  teclado.nextInt();

        System.out.print("Digite o valor da nota2:");
        double nota2 =  teclado.nextInt();

        System.out.print("Digite o valor da nota3:");
        double nota3 =  teclado.nextInt();

        double notaBaixa = 0;
        double notaMedia = 0;
        double notaAlta = 0;

        if(nota1 < nota2 && nota1 < nota3 ) 
        {
            notaBaixa = nota1 + 0.1; 
        }
            else{
                if(nota2 < nota1 && nota2 < nota3)
                {
            notaBaixa = nota2 + 0.1;
                }
            else{
                if(nota3 < nota1 && nota3 < nota2)
                {
            notaBaixa = nota3 + 0.1;
                }
            }
        }
        if(nota1 > nota2 && nota1 < nota3 || nota1 > nota3 && nota1 < nota2)
        {
            notaMedia = nota1 + 0.2; 
        }
        else{
            if(nota2 > nota1 && nota2 < nota3 || nota2 < nota1 && nota2 > nota3)
            {
        notaMedia = nota2 + 0.2;
            }
            else{
                notaMedia = nota3 + 0.2;
            }
        }
        if(nota1 > nota2 && nota1 > nota3)
        {
            notaAlta = nota1 + 0.3;
        }
        else{
            if(nota2 > nota1 && nota2 > nota3)
            {
                notaAlta = nota2 + 0.3;
            }
            else{
                notaAlta = nota3 + 0.3;
            }
        }

        System.out.print("Digite a opcao_Menu: 1 (média simples), 2 (média ponderada): ");
        int opcao_Menu = teclado.nextInt();

        switch(opcao_Menu){
            case 1:
            double media_simples = (nota1 + nota2 + nota3) / 3;
            System.out.println("O valor da média simples do aluno:"+media_simples);
            break;
            case 2:
            double media_ponderada = (notaBaixa * 0.4) + (notaMedia * 0.1) + (notaAlta * 0.5);
            System.out.println("O valor da média ponderada do aluno:"+media_ponderada);
            break;
            default:
            System.out.println("Valor invalido do menu");
        }

        teclado.close();
    }
} 
