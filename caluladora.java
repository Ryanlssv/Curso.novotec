import java.util.Scanner;

public class caluladora {
    public static void main(String[] args) {
        
        int num1,num2,soma;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero interiro:");
        num1 = scanner.nextInt();
         System.out.print("digite um numero interiro:");
        num2 = scanner.nextInt();
        scanner.close();
         

    soma= num1/num2;
    System.out.println("\nO numero digitado foi " + num1);
    System.out.println("\nO numero digitado foi " + num2);
    System.out.println("\nO Resultado: " + soma);
    }   
}
