import java.util.Scanner;

public class Exercicio16
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double altura = 0;
        double soma_alt_m = 0;
        double soma_alt_f = 0;
        String sexo = "";
        double media_alt_f = 0;
        double media_alt_grupo = 0;
        double soma_alt_grupo = 0;
        int quantidade_mulheres = 0;
        double num_peoples = 0;
        int num_loops = 0;

        System.out.print("Digite a altura:");
        altura = teclado.nextDouble();
        System.out.print("Digite o sexo(F)(M):");
        sexo = teclado.next();

        num_loops += 1;
        num_peoples = num_loops;
        
    
        while (altura != 0)
        {
            if (sexo.equalsIgnoreCase("M"))
            {
                soma_alt_m += altura;
            }
            else{
                if (sexo.equalsIgnoreCase("F"))
                {
                    soma_alt_f += altura;
                    quantidade_mulheres += 1;
                }
            }
        System.out.print("Digite a altura:");
        altura = teclado.nextDouble();
        System.out.print("Digite o sexo(F,f)(M,m):");
        sexo = teclado.next();  

        num_loops += 1;
        num_peoples = num_loops;

        if(altura == 0)
        {
            num_peoples -= 1; 

            media_alt_f = soma_alt_f / quantidade_mulheres;
        System.out.println("A média das alturas das mulhesres é:"+media_alt_f);

        soma_alt_grupo = soma_alt_grupo + soma_alt_f + soma_alt_m;
        media_alt_grupo = soma_alt_grupo / num_peoples;
        System.out.print("A média das alturas do grupo é:"+media_alt_grupo);
        } 
        }
        teclado.close();
    }
}