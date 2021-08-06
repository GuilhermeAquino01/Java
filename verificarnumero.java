package exercicios;
 import java.util.Scanner;
public class verificarnumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      int numero;
      System.out.println("Digite um valor seja negativo ou positivo");
      numero = entrada.nextInt();
       
      if (numero > 0){
      System.out.println("Valor positivo");
      } 
      else {
      System.out.println("Valor negativo");
      } 
    }     
    }

    
   

