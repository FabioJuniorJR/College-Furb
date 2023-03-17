import java.util.Scanner;

public class Exercicio24
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double limite_peso = 0;
        double peso_peixe = 0;
        double soma_peso_peixes = 0;

       System.out.print("Digite o limite de peso da pesca em KG:");
       limite_peso = teclado.nextInt();
       System.out.print("Digite o peixe em gramas:");
       peso_peixe = teclado.nextDouble(); 

       soma_peso_peixes += peso_peixe;
    
        while (soma_peso_peixes < limite_peso) 
        {
            System.out.print("deseja informar o peso de mais alguem peixe? (SIM)(NAO):");
            String instrucao = teclado.next();

            if(instrucao.equalsIgnoreCase("sim"))
            {
            System.out.print("Digite o peso do peixe em gramas:");
            peso_peixe = teclado.nextDouble();

            soma_peso_peixes += peso_peixe;

            }
        }
        System.out.println("Limite de peso excedido");
        System.out.println("O peso total de peixes é: "+soma_peso_peixes);
        System.out.println("Fim");
        teclado.close();
    }
}