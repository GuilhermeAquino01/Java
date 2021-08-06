package exercicios;

import java.util.Scanner;

public class nome {

    public static void main(String[] args) {
        try (Scanner texto = new Scanner(System.in)) {
            String Nome;
            System.out.println("Digite o nome completo");
            Nome = texto.nextLine();
            System.out.println("Bem vindo " + Nome);
        }
    } 
   
}
