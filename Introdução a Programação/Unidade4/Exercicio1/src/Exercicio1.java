import java.util.Scanner;
public class Exercicio1
{
    public static void main(String[]args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o total de Horas Trabalhadas:");
        double Horas_Trbalhadas = teclado.nextDouble();

        System.out.print("Digite o Valor da Hora:");
        double Valor_hora = teclado.nextDouble();

        System.out.print("Digite o total de Horas Extras:");
        double Hora_Extra = teclado.nextDouble();

        double Salario_Base = Horas_Trbalhadas*Valor_hora;  
        System.out.println("Salario Base:"+ Salario_Base);

        if (Hora_Extra == 0){
            System.out.println("O salario do mes é:"+Salario_Base);
        }
        else {
            double Salario_Extra = (Hora_Extra * (Valor_hora /2));
            double Salario_Final = Salario_Base + Salario_Extra;
            System.out.println("O salario total do mes é:"+Salario_Final);
        }
        teclado.close();
    }
}