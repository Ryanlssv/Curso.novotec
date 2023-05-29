import java.util.Scanner;

public class Switchcase {
    
    public static void main(String[] args) {
        int opcao = 1 ;

        Scanner scanner = new Scanner(System.in);
        do{
          
        System.out.println("opção 1: x salada ");
        System.out.println("opção 2: x burguer ");
        System.out.println("opção 3: x TUDO ");
        System.out.println("\nSelecione sua refeição:");
        opcao = scanner.nextInt();
           } while (opcao <1 || opcao > 3);
          

        switch (opcao) {
        case 1:
         System.out.println("\nopção 1 selecionada");
           break;
        case 2:
         System.out.println("\nopção 2 selecionada");
           break;
        case 3: 
        System.out.println("\nopção 3 selecionada");  
           break;
         default:
         System.out.println("\nopção invalida "); 
           break;


         } 
         scanner.close(); 
        }
    } 

