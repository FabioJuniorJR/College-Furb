public class Exercicio10 {
    public static void main(String[] args) {

        int soma = 0;
        int pod = 0;
        String str1 = 0;
        String str = 0;
        int cont = 0;
        for(int indice = 0; indice <= 10000; indice++)
        {
            for(int ind = 0; ind <= 10000; indice++)
            {
                soma = indice + ind;
                pod = soma * soma;
                str1 = indice + ind;
                str2 = pod;
                if(str1.equals(str2))
                {
                    System.out.println("[" + (cont + 1) + "]" + indice + " + " + ind + " = " + soma + " -> " + pod);
                }
            }
        }
    }
}
