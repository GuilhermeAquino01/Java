import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3;
        
        System.out.print("Digite a medida dos três lados do triângulo: ");
        lado1 = teclado.nextDouble();
        lado2 = teclado.nextDouble();
        lado3 = teclado.nextDouble();
        
        System.out.println("Existência do triângulo: "+existeTriangulo(lado1, lado2, lado3));
    }
    
    public static boolean existeTriangulo(double A, double B, double C) {
        if ( (Math.abs(B-C) < A) && (A < B+C) ) {
            return true;
        }  
        else {
            return false;
        }
    }
}