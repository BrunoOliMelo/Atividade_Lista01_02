import java.util.Scanner;
public class Lista01_02 {
    
    public static void main(String[] args) {
        double numero;
        
        System.out.println("Insira um número: ");
        Scanner input = new Scanner(System.in);
        numero = input.nextDouble();
        
       System.out.println("O número informado foi [" + numero + "] ");
        input.close();
    }
}
