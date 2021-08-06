import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3;
        
        System.out.print("Digite a medida dos três lados do triângulo: ");
        lado1 = teclado.nextDouble();
        lado2 = teclado.nextDouble();
        lado3 = teclado.nextDouble();
        
        System.out.println("Tipo do triângulo: "+tipoTriangulo(lado1, lado2, lado3));
    }
    
    public static boolean existeTriangulo(double A, double B, double C) {
        if ( (Math.abs(B-C) < A) && (A < B+C) ) {
            return true;
        }  
        else {
            return false;
        }
    }
    
    public static String tipoTriangulo(double A, double B, double C) {
        if ( existeTriangulo(A,B,C) ) {
            if ( (A!=B) && (B!=C) ) {
                return "escaleno";
            }
            else {
                if ( (A==B) && (B==C) ) {
                    return "equilátero";
                }
                else {
                    return "isósceles";
                }
            }
        }
        else {
            return "Não existe o triângulo";
        }
    }
}