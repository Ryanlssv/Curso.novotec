import java.util.Scanner;

public class Estoque2{ 

    public static void main(String[] args) {
        double num1, num2,Resultado;
        int opcao = 1 ;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("BEM VINDO AO ESTOQUE");
        System.out.println("\nestoque atual:500 ");
        num1 = 500;
        System.out.print("Digite um numero inteiro :");
        num2 = scanner.nextInt();
      
        do{
          System.out.println("\nSelecione o produto:");
          System.out.println("opção 1: Racão magunum ");
          System.out.println("opção 2: Ração golden  ");
          System.out.println("opção 3: Ração Gram ");
          opcao = scanner.nextInt();
         switch  ( opcao ) {
          default:
                System.out.println("\n opção invalida "); 
                  break;
         }
        } while (opcao < 1 || opcao > 3 );
            
        
        
        do {
            System.out.println("\no que vai fazer:");
            System.out.println( "opção 1: Retirar");
            System.out.println( "opção 2: Armazenar ");
           opcao = scanner.nextInt();
           
           
            switch ( opcao ) {
                case 1:
                System.out.println("\n opção 1 selecionada");
                if (num2 >num1){   

                } else {
                Resultado = num1 - num2;
                System.out.println("\n Quantia atualizada: " + Resultado);
                }
                break;
               case 2:
                System.out.println("\n opção 2 selecionada");
                Resultado = num1 + num2;
                System.out.println("\n Quantia atualizada : " + Resultado);
                break;
                  
                default:
                System.out.println("\n opção invalida "); 
                  break;
                }
             
             } while (opcao == 1 || opcao > 2 );
            
             scanner.close();
    }
        
}
 