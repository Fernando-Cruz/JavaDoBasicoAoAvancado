package Funcaos;

import java.util.Scanner;

public class FuncaoIf {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a sua idade");
    int idade = scanner.nextInt();

    if(idade >= 18){
        System.out.println("Você e maior de idade");
    } else {
        System.out.println("Você e menor de idade");
    }
    scanner.close();
    }
}
