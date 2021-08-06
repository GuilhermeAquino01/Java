import java.util.Scanner;

public class Exemplo3 {
    public static void main(String args[]) {
        int m, p, resCombinacao, resArranjo;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cálculo do número de combinações");
        System.out.print("Digite M: ");
        m = teclado.nextInt();
        System.out.print("Digite P: ");
        p = teclado.nextInt();

        resCombinacao = combinacao(m,p);
        
        System.out.println("O número de combinações de "+m+" itens em grupos de "+p+" itens ="+resCombinacao);
        
        resArranjo = arranjo(m,p);
        
        System.out.println("O número de arranjos de "+m+" itens em grupos de "+p+" itens ="+resArranjo);
    }
    
    public static int fatorial(int n) {
        int fat=1;
        for (int i=1; i<=n; i++) {
            fat = fat * i;
        } 
        return fat;
    }
    
    public static int combinacao(int m, int p) {
        if (m >= p) 
        {
            return fatorial(m) / (fatorial(p) * fatorial(m-p));    
        }
        else 
        {
            return 0;   
        }
    }
    
    public static int arranjo(int m, int p) {
        if (m >=p)
        {
            return fatorial(m) / fatorial(m-p);
        }
        else 
        {
            return 0;
        }
    }
}