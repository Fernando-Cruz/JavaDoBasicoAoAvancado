package Funcaos;

import java.util.Scanner;

public class FuncaoIfDois {
    public static void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a primeira nota do aluno");

        double nota1 = scanner.nextDouble();

        System.out.println("Entre com a Segunda nota do aluno");

        double nota2 = scanner.nextDouble();

        System.out.println("Entre com a terceira nota do aluno");

        double nota3 = scanner.nextDouble();

        System.out.println("Entre com a quarta nota do aluno");

        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)  / 4;

        if(media >= 7){

            System.out.println("Aluno aprovado");

        } else if(media >= 5 ){

            System.out.println("Aluno em recuperação");

        } else {

            System.out.println("Aluno reprovado");
        }
        scanner.close();
    }
}
