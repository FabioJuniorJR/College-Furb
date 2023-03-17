import java.util.Scanner;
public class Exercicio16
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a idade do homem 1:");
        int idade_homem1 =  teclado.nextInt();

        System.out.print("Digite a idade do homem 2:");
        int idade_homem2 =  teclado.nextInt();

        System.out.print("Digite a idade da mulher 1:");
        int idade_mulher1 =  teclado.nextInt();

        System.out.print("Digite a idade da mulher 2:");
        int idade_mulher2 =  teclado.nextInt();

        if(idade_homem1 > idade_homem2 && idade_mulher1 < idade_mulher2)
        {
            int soma_idades = idade_homem1 + idade_mulher1;
            System.out.println("A soma das idades são:"+soma_idades);
            if(idade_homem1 < idade_homem2 && idade_mulher1 > idade_mulher2)
                    {
                        int produto_idades = idade_homem1 * idade_mulher2;
                        System.out.println("O produto das idades são:"+produto_idades);
                    }
                    else{
                        if(idade_homem1 < idade_homem2 && idade_mulher2 > idade_mulher1)
                        {
                            int produto_idades = idade_homem1 * idade_mulher2;
                        System.out.println("O produto das idades são:"+produto_idades);
                        }
                        else{
                            if(idade_homem2 < idade_homem1 && idade_mulher1 > idade_mulher2)
                            {
                                int produto_idades = idade_homem2 * idade_mulher1;
                            System.out.println("O produto das idades são:"+produto_idades);
                            }
                            else{
                                if(idade_homem2 < idade_homem1 && idade_mulher2 > idade_mulher1)
                                {
                                    int produto_idades = idade_homem2 * idade_mulher2;
                                System.out.println("O produto das idades são:"+produto_idades);
                                }
            /*int soma_idades = idade_homem1 + idade_mulher1;
            System.out.println("A soma das idades são:"+soma_idades);*/
        }
    }
}
        }
/*--------------------------------------------------------------------------------------------------------*/
        else{
            if(idade_homem1 > idade_homem2 && idade_mulher2 < idade_mulher1)
            {
                if(idade_homem1 < idade_homem2 && idade_mulher1 > idade_mulher2)
                    {
                        int produto_idades = idade_homem1 * idade_mulher2;
                        System.out.println("O produto das idades são:"+produto_idades);
                    }
                    else{
                        if(idade_homem1 < idade_homem2 && idade_mulher2 > idade_mulher1)
                        {
                            int produto_idades = idade_homem1 * idade_mulher2;
                        System.out.println("O produto das idades são:"+produto_idades);
                        }
                        else{
                            if(idade_homem2 < idade_homem1 && idade_mulher1 > idade_mulher2)
                            {
                                int produto_idades = idade_homem2 * idade_mulher1;
                            System.out.println("O produto das idades são:"+produto_idades);
                            }
                            else{
                                if(idade_homem2 < idade_homem1 && idade_mulher2 > idade_mulher1)
                                {
                                    int produto_idades = idade_homem2 * idade_mulher2;
                                System.out.println("O produto das idades são:"+produto_idades);
                                }
                /*int soma_idades = idade_homem1 + idade_mulher2;
            System.out.println("A soma das idades são:"+soma_idades);*/
            }
        }
    }
}
/*---------------------------------------------------------------------------------------------------------*/
            else{
                if(idade_homem2 > idade_homem1 && idade_mulher1 < idade_mulher2)
                {
                    int soma_idades = idade_homem2 + idade_mulher1;
                    System.out.println("A soma das idades são:"+soma_idades);  
                    if(idade_homem1 < idade_homem2 && idade_mulher1 > idade_mulher2)
                    {
                        int produto_idades = idade_homem1 * idade_mulher2;
                        System.out.println("O produto das idades são:"+produto_idades);
                    }
                    else{
                        if(idade_homem1 < idade_homem2 && idade_mulher2 > idade_mulher1)
                        {
                            int produto_idades = idade_homem1 * idade_mulher2;
                        System.out.println("O produto das idades são:"+produto_idades);
                        }
                        else{
                            if(idade_homem2 < idade_homem1 && idade_mulher1 > idade_mulher2)
                            {
                                int produto_idades = idade_homem2 * idade_mulher1;
                            System.out.println("O produto das idades são:"+produto_idades);
                            }
                            else{
                                if(idade_homem2 < idade_homem1 && idade_mulher2 > idade_mulher1)
                                {
                                    int produto_idades = idade_homem2 * idade_mulher2;
                                System.out.println("O produto das idades são:"+produto_idades);
                                }
                    /*int soma_idades = idade_homem2 + idade_mulher1;
                System.out.println("A soma das idades são:"+soma_idades);*/
                }
            }
        }
    }
/*----------------------------------------------------------------------------------------------------*/
                else{
                    if(idade_homem2 > idade_homem1 && idade_mulher2 < idade_mulher1)
                    {
                        int soma_idades = idade_homem2 + idade_mulher2;
                        System.out.println("A soma das idades são:"+soma_idades);
                        if(idade_homem1 < idade_homem2 && idade_mulher1 > idade_mulher2)
                    {
                        int produto_idades = idade_homem1 * idade_mulher2;
                        System.out.println("O produto das idades são:"+produto_idades);
                    }
                    else{
                        if(idade_homem1 < idade_homem2 && idade_mulher2 > idade_mulher1)
                        {
                            int produto_idades = idade_homem1 * idade_mulher2;
                        System.out.println("O produto das idades são:"+produto_idades);
                        }
                        else{
                            if(idade_homem2 < idade_homem1 && idade_mulher1 > idade_mulher2)
                            {
                                int produto_idades = idade_homem2 * idade_mulher1;
                            System.out.println("O produto das idades são:"+produto_idades);
                            }
                            else{
                                if(idade_homem2 < idade_homem1 && idade_mulher2 > idade_mulher1)
                                {
                                    int produto_idades = idade_homem2 * idade_mulher2;
                                System.out.println("O produto das idades são:"+produto_idades);
                                }
                        /*int soma_idades = idade_homem2 + idade_mulher2;
                    System.out.println("A soma das idades são:"+soma_idades);*/
                    }
        teclado.close();
                            }
                        }
                    }
                }
            }
        }
    }
}
        
    
