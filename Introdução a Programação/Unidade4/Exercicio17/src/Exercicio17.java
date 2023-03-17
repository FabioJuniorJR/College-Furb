import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio17
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a renda anual:");
        int renda_anual =  teclado.nextInt();

        System.out.print("Digite o numero de dependentes:");
        int n_dependentes =  teclado.nextInt();

        DecimalFormat format = new DecimalFormat("000.00");

        double renda_liquida = (renda_anual - (renda_anual * (n_dependentes*0.02))); 
        System.out.println("Renda liquida R$: "+ format.format(renda_liquida));
        
        if(renda_liquida <= 2000)
        {
            System.out.println("Não paga imposto: R$ "+format.format(renda_liquida));
        }
        else{
            if(renda_liquida >2000 && renda_liquida < 5000)
            {
                double imposto = renda_liquida * 0.05;
                System.out.println("Paga imposto: R$ "+format.format(imposto));
            }
            else{
                if(renda_liquida >5000 && renda_liquida < 10000)
                {
                    double imposto = renda_liquida * 0.1;
                    System.out.println("Paga imposto: R$ "+format.format(imposto));
                }
                else{
                    if(renda_liquida >10000)
                    {
                        double imposto = renda_liquida * 0.15;
                        System.out.println("Paga imposto: R$ "+format.format(imposto));
                    }
    

        teclado.close();
                }
            }
        }
    }
}
