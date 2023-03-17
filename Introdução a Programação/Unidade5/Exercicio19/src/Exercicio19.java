import java.util.Scanner;

public class Exercicio19
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double purchase_price = 0;
        double discount_amount = 0; 
        double earnings_of_the_day = 0;

        System.out.print("Preço da compra R$");
        purchase_price = teclado.nextDouble();

        while (purchase_price != 0)
        {
            if (purchase_price > 500) {
                discount_amount = (purchase_price * 20) / 100;
                System.out.println("Valor do desconto: "+discount_amount);
                purchase_price = purchase_price - discount_amount;
                System.out.println("Valor final da compra: "+purchase_price);
                earnings_of_the_day += purchase_price;

            }
            else {
                if (purchase_price <= 500)
                {
                    discount_amount = (purchase_price * 15) / 100;
                    System.out.println("Valor do desconto: "+discount_amount);
                    purchase_price = purchase_price - discount_amount;
                    System.out.println("Valor final da compra: "+purchase_price);
                    earnings_of_the_day += purchase_price;
                }
            }
            System.out.print("Preço da compra R$");
        purchase_price = teclado.nextDouble();
        }
        System.out.print("Ganhos do dia: "+earnings_of_the_day);
        earnings_of_the_day = teclado.nextDouble();

        teclado.close();
    }
}
