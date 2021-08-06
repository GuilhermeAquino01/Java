package exercicios;
import java.util.Scanner;
public class mediafor
{
public static void main (String[]args){
double media = 0;
double resultado = 0;
int contador = 1;
Scanner numero = new Scanner (System.in);
System.out.println("Média Aritmética de 280 núemros");
System.out.println("===================================");
for (contador=1;contador<=10;contador++){
System.out.println("Digite um número");
int num = numero.nextInt();
resultado = resultado + num;
}
media = resultado/10;
System.out.println("===================================");
System.out.println("O resultado dos números digitados é: "+media);
}
}


