import java.util.Scanner;

public class Exercicio7 
{
    public static void main(String[] args)
     {
        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o peso da carta (g): ");
        int peso = teclado.nextInt(); 
        float preco = 0f;
        if (peso <= 50) {
            preco = 0.45f;
        } else {
            peso -= 50; 
            int pesoExcedente = peso / 20; 
            
            if (peso % 20 != 0) { 
                pesoExcedente += 1;  
            }
            
            float precoExcedente = pesoExcedente * 0.45f; 
            preco = 0.45f + precoExcedente;
        }
        
        System.out.println("Preço a pagar R$" + preco);
        teclado.close();
    }

}