package PrimeiroPassos;

public class Variaveis {
    public static void main(String[] args){
        //Aqui iremos descrever todos os tipos de variaveis em java.
        int numero = 12;
        double ValorDecimal = 12.10;
        final double pi = 3.1415;
        boolean ligado = true;
        char sexo = 'M';


        System.out.println("int um numero inteiro simples e peqeno exelente para usar em Idade, " +
                "Quantidade, aqui no exemplo atribuimos o valor de " + numero);
        System.out.println("Double e usado para valores monetarios ou decimal preciso, o valor atribuido " +
                "foi o valor decimal " + ValorDecimal);
        System.out.println("final e uma constate que nunca muda para o nosso exeplo utilizamo o numero " +
                "PI " + pi);
        System.out.println("A proxima variavel e o Boolean que e o ligado ou deslgado o verdadeiro ou o falso" +
                "para esse valor utilizamos o valor de ligado " + ligado);
        System.out.println("A variavel char deve conter apena um caracter e para a sua atribuição deve estar " +
                "dentro de aspas simples e o nosso exemplo seria sexo (" + sexo + ")");
    }
}
