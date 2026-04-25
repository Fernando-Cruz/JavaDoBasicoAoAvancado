/* Desafio - 04 : Faça um programa que leia uam quantidade inderteminada de numeros positivos e negativos
*  conte quantos deles estão nos seguintes intervalos (0-25) (26-50) (51-75) (75-100).
*
*  O sistema deve obdecer as seguintes regras:
*       1 - Solicitar ao usuário que insita numeros positivos.
*       2 - Classificar cada numero inserido dentro dos intervalos acima.
*       3 - A incerssão de numero deve continuar até o usuário digitar um numero negativo.
*       4 - Se o numero for maior que 100 eve ser ignorado.
*       5 - Ao final o sistema deve mostrar quantos numeros teve cada intervalo.
*/
package Desafios;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args){

        //Criação das variaveis que irão armazenar cada intervalo.
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;

        //variavél para cotrole do while
        char encerra = 'N';

        //Criação a variavel de entrada do teclado
        Scanner scanner = new Scanner(System.in);

        while (encerra == 'N') {
            //Solicitação ao usuário digitar um numero entre 1 e 100 ou negativo para encerrar.
            System.out.println("Favor entre com um numero de 1 a 100 ou negativo para encerrar o programa.");

            //verifica se o que foi inserido e um numero.
            if(scanner.hasNextInt()) {

                //Atribui a entrada do teclado.
                int numero = scanner.nextInt();

                if(numero < 0) {

                    //se numero for menor que zero finaliza o sistema
                    encerra = 'S';

                } else if (numero >= 0 && numero <= 25 ) {

                    //Entra no primero intervalo
                    intervalo1 = intervalo1 + 1;

                } else if (numero >= 26 && numero <= 50 ) {

                    //Entra no Segundo intervalo
                    intervalo2 = intervalo2 + 1;

                }else if (numero >= 51 && numero <= 75 ) {

                    //Entra no terceiro intervalo
                    intervalo3 = intervalo3 + 1;

                } else if (numero >= 76 && numero <= 100 ) {

                    //Entra no Quarto intervalo
                    intervalo4 = intervalo4 + 1;
                }

            }else {
                //Informar para o usuário que o valor informado não e um numero.
                System.out.println("Vafor inserir um numero valido!");
                //Zerar a variavél de teclado para não ficar em looping
                scanner.next();
            }
        }
        //Mostrar o resultado de cada intervalo.
        System.out.println("");
        System.out.println("O intervalod de  0 a 25  teve " + intervalo1 + " numero.");
        System.out.println("O intervalod de 26 a 50  teve " + intervalo2 + " numero.");
        System.out.println("O intervalod de 51 a 75  teve " + intervalo3 + " numero.");
        System.out.println("O intervalod de 76 a 100 teve " + intervalo4 + " numero.");

        //Informar Sistema foi encerrado.
        System.out.println("Sistema encerrado!");

        //Fechar a variavél de entrada de teclado
        scanner.close();
    }


}
