public class Exercicio2 {
    public static double f(double x) {
        return x*x - 3*x + 5;
    }
    
    public static void geraIntervalo(double xi, double xf, double salto) {
        for(double x=xi; x<=xf; x+=salto) {
            System.out.println("x="+x+" , f(x)="+f(x));    
        }            
    }
    
    public static void main(String [] args) {
        geraIntervalo(0, 3, 0.25);
    }
}