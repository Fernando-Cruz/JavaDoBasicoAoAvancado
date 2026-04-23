/* Desafio 2 - Faça um programa que leia um numero e exiba o dia correspondente da semana.
*  O programa deve seguir as seguintes regras:
*       Solicitar ao usuário o numero de 1 a 7.
*       O programa deve exibir o dia da semana correspondente ao numero inserido, conforme a tabela abaixo;
*       1 - Domingo, 2 - Segunda, 3 - Terça, 4 - Quarta, 5 - Quinta, 6 - sexta, 7 - Sabado.
*       Caso o usuario insira um numero fora desse intervalo (ou seja, um numero menor que que 1 e maior q 7
*       o programa deverá exibir a mensagem "valor inválida", indicando que o numero não correspondem a um dia
*       da semana.
*       O SISTEMA deve garantir um numero valido.
*
*/
package Desafios;

import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Solicitar ao usuário um numero de um a 7.
        System.out.println("Entre com um numero de 1 a 7.");

        //verificar se você o que o usuário digito e um numero valido, caso não informar o erro.
        if(scanner.hasNextInt()){
            int numero = scanner.nextInt();

                switch(numero){
                    //verificar se o numero está entre o range solicita caso nao informa o erro.
                    case 1:
                        System.out.println("Domingo");
                        break;
                    case 2:
                        System.out.println("Segunda");
                        break;
                    case 3:
                        System.out.println("Terça");
                        break;
                    case 4:
                        System.out.println("Quarta");
                        break;
                    case 5:
                        System.out.println("Quinta");
                        break;
                    case 6:
                        System.out.println("Sexta");
                        break;
                    case 7:
                        System.out.println("Sabado");
                        break;
                    default:
                        //Mostrar a saida valida ao usuário
                        System.out.println("Entre com un numero entre 1 e 7.");
                }

        } else {
            System.out.println("Favor entrar um um numero valido.");
        }


    }
}
