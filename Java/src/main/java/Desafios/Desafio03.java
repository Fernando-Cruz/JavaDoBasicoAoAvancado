/* Desafio 3 - Faça um programa que peça uma nota, entre zero e 10.
*  Regras:
*           Solicitar ao usuário usuário que insira uma nota entre 0 e 10.
*           Verificar se a nota inserida e valida se esta dentro do range solicitado.
*/

package Desafios;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int encerra = -1;

        while (encerra == -1){

            System.out.println("favor inserir uma nota ente 0 e 10");

            if(scanner.hasNextInt()) {

                int nota = scanner.nextInt();

                if (nota >= 0 && nota <= 10) {

                    System.out.println("A nota foi de " + nota);
                    encerra = 0;

                } else {

                    System.out.println("Nota inserida invalida!");
                }

            } else {

                System.out.println("Favor inserir um numero entre 1 e 10!");
                //Aqui preciamos zerar a variavél para não entrar em loop infinito.
                scanner.next();

            }
        }


        scanner.close();
    }
}
