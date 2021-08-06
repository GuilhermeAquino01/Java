
package exercicios;
import javax.swing.JOptionPane;



public class divisaodedoisnumeros {
    public static void main(String[] args){
    
    float num, den;
    float div;
    
    
    num = Float.parseFloat(JOptionPane.showInputDialog("Insira o numerador:"));
    den = Float.parseFloat(JOptionPane.showInputDialog("Insira o denominador:"));
    
        if(den <= 0){
        JOptionPane.showMessageDialog(null,"Impossivel realizar essa divisão");
        }else{ div = num/den;
        JOptionPane.showMessageDialog(null, "O Resultado é:" +div);
        }
    }
     
       
    
    }    
    
    
    
    
    
    
    
    
    

