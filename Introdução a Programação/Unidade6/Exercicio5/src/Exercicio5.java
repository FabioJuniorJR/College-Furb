import java.util.Scanner;
public class Exercicio5
{
    public Exercicio5()
    {
        Scanner teclado = new Scanner(System.in);
        String vetorHomem[] = new String[5];
        String vetorMulher[] = new String[5];
        float vetorAfinidade[] = new float[5];
        respostasHomem(vetorHomem, teclado);
        respostasMulher(vetorMulher, teclado);
        calculoAfinidade(vetorHomem, vetorMulher, vetorAfinidade);
    }
    public void respostasHomem(String vetorHomem[], Scanner teclado)
    {
        System.out.println("1-Gosta de musica Sertaneja");
        vetorHomem[0] = teclado.nextLine();
        System.out.println("2-Gosta de Futebol");
        vetorHomem[1] = teclado.nextLine();
        System.out.println("3-Gosta DE Seriados");
        vetorHomem[2] = teclado.nextLine();
        System.out.println("4-Gosta de Redes Sociais");
        vetorHomem[3] = teclado.nextLine();
        System.out.println("5-Gosta da Oktoberfest");
        vetorHomem[4] = teclado.nextLine();
    }

    public void respostasMulher(String vetorMulher[], Scanner teclado)
    {
            System.out.println("1-Gosta de musica Sertaneja");
        vetorMulher[0] = teclado.nextLine();
        System.out.println("2-Gosta de Futebol");
        vetorMulher[1] = teclado.nextLine();
        System.out.println("3-Gosta DE Seriados");
        vetorMulher[2] = teclado.nextLine();
        System.out.println("4-Gosta de Redes Sociais");
        vetorMulher[3] = teclado.nextLine();
        System.out.println("5-Gosta da Oktoberfest");
        vetorMulher[4] = teclado.nextLine();
    }

    public void calculoAfinidade(String vetorHomem[], String vetorMulher[], float vetorAfinidade[])
    {
        float indiceAfinidade = 0;
        for(int indice = 0; indice < vetorAfinidade.length; indice++)
        {
            if(vetorHomem[indice].equalsIgnoreCase("sim") && vetorMulher[indice].equalsIgnoreCase("sim"))
            {
                indiceAfinidade += 3;
            }
            else{
                if(vetorHomem[indice].equalsIgnoreCase("ind") && vetorMulher[indice].equalsIgnoreCase("sim") || vetorHomem[indice].equalsIgnoreCase("ind") && vetorMulher[indice].equalsIgnoreCase("nao"))
                {
                    indiceAfinidade += 1;
                }
                else{
                    if((vetorMulher[indice].equalsIgnoreCase("ind") && vetorHomem[indice].equalsIgnoreCase("sim") || vetorMulher[indice].equalsIgnoreCase("ind") && vetorHomem[indice].equalsIgnoreCase("nao")))
                    {
                        indiceAfinidade += 1;
                    }
                else{
                    if(vetorHomem[indice].equalsIgnoreCase("sim") && vetorMulher[indice].equalsIgnoreCase("nao") || vetorHomem[indice].equalsIgnoreCase("nao") && vetorMulher[indice].equalsIgnoreCase("sim") )
                    {
                        indiceAfinidade -= 2;
                    }
                }
            }
        }
    }
        if(indiceAfinidade >= 15)
        {
            System.out.println("Casem");
        }
        else{
            if(indiceAfinidade >= 10 && indiceAfinidade <= 14)
            {
                System.out.println("Vocês têm muita coisa em comum!");
            }
            else{
                if(indiceAfinidade >= 5 && indiceAfinidade <= 9)
                {
                    System.out.println("Talvez não dê certo :(");
                }
                else{
                    if(indiceAfinidade >= 0 && indiceAfinidade <= 4)
                    {
                        System.out.println("Vale um encontro");
                    }
                    else{
                        if(indiceAfinidade <= -1 && indiceAfinidade >= -9)
                        {
                            System.out.println("Melhor não perder tempo");
                        }
                        else{
                            if(indiceAfinidade <= -10)
                            {
                                System.out.println("Vocês se odeiam!");
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
        new Exercicio5();
    }
}




