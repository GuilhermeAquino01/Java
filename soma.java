package exercicios;
import javax.swing.JOptionPane;

public class soma {
   
    public static void main(String[] args) {
    
     
int soma;
int num1; int num2;

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero:"));

num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro numero:"));

soma = num1 + num2; JOptionPane.showMessageDialog(null,"A soma dos numeros e: " + soma);
System.exit(0); 
 }
} 