package exercicios;

import javax.swing.JOptionPane;

public class fibonacci {

    public static void main(String [] args){
    
    String sn = JOptionPane.showInputDialog("Informe a quantidade de valor desejado");
    int n = Integer.parseInt(sn);
    JOptionPane.showMessageDialog(null, fibonacci(n));
    }
    
    
    public static long fibonacci(int n){
        long anterior = 1, proximo = 1, resultado = 0;
      if (n == 0 || n ==1){
          return 1;
      }else{ 
          for(int cont = 2; cont <=n; cont++){
              resultado = proximo + anterior;
              anterior = proximo;
              proximo = resultado;
              
          }
      }  
        return resultado;
    
    }

}

