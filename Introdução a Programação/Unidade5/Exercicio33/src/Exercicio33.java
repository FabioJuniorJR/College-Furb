import java.util.Scanner;

public class Exercicio33
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int voto = 0;
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        int voto_nulo = 0;
        int voto_branco = 0;

        do {
            System.out.print("Digite sua opção de voto (1, 2, 3, 4, 5(nulo), 6(branco), 0(sair): ");
            voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    voto1 += 1;
                    break;
                case 2:
                    voto2 += 1;
                    break;
                case 3:
                    voto3 += 1;
                    break;
                case 4:
                    voto4 += 1;
                    break;
                case 5:
                    voto_nulo += 1;
                    break;
                case 6:
                    voto_branco += 1;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta");
            }
        } while (voto != 0);

       System.out.println("Total para candidato 1: " + voto1);
       System.out.println("Total para candidato 2: " + voto2);
       System.out.println("Total para candidato 3: " + voto3);
       System.out.println("Total para candidato 4: " + voto4);
 
       System.out.println("Total de votos nulos: " + voto_nulo);
       
       System.out.println("Total de votos em branco: " + voto_branco);
     
       int total = voto1 + voto2 + voto3 + voto4 + voto_nulo + voto_branco; 

       float percent_branco = (voto_branco * 100f) / total;
       System.out.println("Percentual de votos em branco: " + percent_branco + "%"); 

       float percent_nulo = (voto_nulo * 100f) / total;
       System.out.println("Percentual de votos nulos: " + percent_nulo + "%");

        teclado.close();
    }
}
