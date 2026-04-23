/* Desafio 1 - Verificação de vogal ou consoante
*  Faça um programa em java que pegue a entrada digitada pelo usuário e verifique se e uma vogal ou
* consoante.
* Caso o usuário digite algo que não seja uma vogal ou uma consoante o sistema deve retornar um erro.
*/
package Desafios;

import java.util.Scanner;

public class Desafio01 {

    public static String verificaVogalConsoante(String texto){
        String vogais = "AEIOUaeiou";

        char primeiraLetra = texto.charAt(0);

        char achou = 'N';

        for(int i = 0; i < vogais.length(); i++) {

            char letraAtual = vogais.charAt(i);

            if (letraAtual == primeiraLetra) {
                achou = 'S';
            }
        }
        if(achou == 'S') {
            return "A letra e uma vogal";
        } else {
            return  "A letra e uma consoante";
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite uma vogal ou uma consoante!");

        String letra = scanner.nextLine();


        if(letra.length() >= 0 && letra.length() <= 1) {

            String resultado = verificaVogalConsoante(letra);

            System.out.println(resultado);
        } else {
            System.out.println("Voce tem que digitar apenas uma letra ou charecter valido, fim do sistema!");
        }

        scanner.close();
    }
}
