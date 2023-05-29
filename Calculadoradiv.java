import java.util.Scanner;

public class Calculadoradiv {
    
    public static void main(String[] args) {
        
        double num1,num2,soma;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero interiro:");
        num1 = scanner.nextInt();
         System.out.print("digite um numero interiro:");
         num2 = scanner.nextInt();
         scanner.close();
         if (num2 == 0 ) {
            System.out.println("NÃO E POSSIVEL DIVISAO");
         }  else {
          
            soma= num1/num2;
            System.out.println("\nO numero digitado foi " + num1);
            System.out.println("\nO numero digitado foi " + num2);
            System.out.println("\nO Resultado: " + soma);
          }  
          

    
    
        }
}

