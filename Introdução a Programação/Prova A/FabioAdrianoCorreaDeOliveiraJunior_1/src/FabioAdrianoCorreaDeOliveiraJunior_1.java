import java.util.Scanner;
public class FabioAdrianoCorreaDeOliveiraJunior_1
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a renda anual:");
        int rendaAnual =  teclado.nextInt();

        System.out.print("Digite a quantidade de dependentes:");
        int qtDependentes  =  teclado.nextInt();

        double rendaLiquida = rendaAnual - (rendaAnual * qtDependentes * 0.02);

        double impostoAPagar =  0;

        if(rendaLiquida > 2000 && rendaLiquida <= 5000 || rendaLiquida > 5000 && rendaLiquida <= 10000)
        {
            impostoAPagar = rendaLiquida * 0.05;
            System.out.println("O imposto a pagar equivale a:"+impostoAPagar);
        }
        else{
            if(rendaLiquida > 10000)
            {
            impostoAPagar = rendaLiquida * 0.1;
            System.out.println("O imposto a pagar equivale a:"+impostoAPagar);
            }
            else{
                impostoAPagar = rendaLiquida * 0.15;
                System.out.println("O imposto a pagar equivale a:"+impostoAPagar);
            }
        }
        teclado.close();
    }
}