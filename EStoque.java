import java.util.Scanner;

public class EStoque{ 

    public static void main(String[] args) {
        double num1, num2,Resultado;
        int opcao = 1 ;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("BEM VINDO AO ESTOQUE");
        System.out.print("Digite o numero do estoque atual:");
        num1 = scanner.nextInt();
        System.out.print("Digite um numero interio:");
        num2 = scanner.nextInt();
        
        do{
            System.out.println("\nSelecione o produto:");
            System.out.println("opção 1: Racão magunum ");
            System.out.println("opção 2: Ração golden  ");
            System.out.println("opção 3: Ração Gram ");
            opcao = scanner.nextInt();

            switch (opcao) {
            default:
            System.out.println("\nopção invalida "); 
            break;}
            } while (opcao <1 || opcao > 3 );
        
        
        do {
            System.out.println("\no que vai fazer:");
            System.out.println( "opção 1: Retirar");
            System.out.println( "opção 2: Armazenar ");
           opcao = scanner.nextInt();
           
           
            switch ( opcao ) {
                case 1:
                System.out.println("\n opção 1 selecionada");
                if (num2 > num1) {
                    System.out.println("Não há produtos suficientes");
                  }else{
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
             
             } while (opcao <1 || opcao > 2 );
            
             scanner.close();
    }
        
}
 