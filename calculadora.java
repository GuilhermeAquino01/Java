package exercicios;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
 // DECLAREI MINHA VARIAVEL PARA RECEBER O NUMERO
     double n1 , n2;
     double rSoma, rSub, rMult, rDiv;
     int op;           
 // AQUI SERA MINHA ENTRADA
 Scanner entrada = new Scanner(System.in);
 System.out.println("Insira o primeiro valor:");
 // AQUI ELE RECEBE O PRIMEIRO VALOR
 n1 = entrada.nextDouble();
 System.out.println("Insira o segundo valor");
 n2 = entrada.nextDouble();
 // SAIDA DE DADOS TODOS ESSES COMANDOS SÃO DE LEITURAS
 System.out.println("Selecione uma Operação:");
 System.out.println("[1] - rSoma");
 System.out.println("[2] - rSub");
 System.out.println("[3] - rMult");
 System.out.println("[4] - rDiv");
 System.out.println("Escolha a opção desejada:");
 op =  entrada.nextInt();
    switch(op){
      case 1 :
        rSoma = n1+n2;
    System.out.println("A Soma é: " +rSoma);
    break;
    
      case 2:
        rSub = n1-n2;
     System.out.println("A subtração é:" +rSub);
     break;
     
      case 3:
        rMult = n1*n2;
        System.out.println("A multiplicação é:" +rMult);
     break;
      case 4:
          if(n1<n2){
          System.out.println("Impossivel realizar o Calculo, pois o segundo valor é maior que o primeiro!");
      
            }
          else{
              rDiv = n2/n2;
              System.out.println("A divisão é:" +rDiv);
          }
              break;
          
      default:
        System.out.println("Operação inválida!");
        
         
                  
    }
}
}