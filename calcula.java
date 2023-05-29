import java.util.Scanner;

public class calcula {
    
    public static void main(String[] args) {
        double num1, num2,Resultado;
        int opcao;
        Scanner scanner = new Scanner(System.in);


        System.out.print("BEM-VINDO(A) Ao app CALCULADORA ");
        System.out.print("SOU CAPAZ DE REALIZAR OPERAÇÕES. ");
        System.out.print("Digite um numero inteiro:");
        num1 = scanner.nextInt();
        System.out.print("Digite outro numero inteiro:");
        num2 = scanner.nextInt();
    do{  
    
        System.out.print("Selecione a operação desejada\n ");
    System.out.print(" 1 - adição\n");
    System.out.print(" 2 - subtração\n:");
    System.out.print(" 3 - multiplicação\n ");
    System.out.print(" 4 - divisão ");
    System.out.print("QUAL OPERAÇÃO DEJESADA\n");
    opcao = scanner.nextInt();
  
     switch(opcao) {
        case 1:
        System.out.println("\n operação ecolnhida:adição");
        Resultado = num1 + num2;
        System.out.println("\nO Resultado: " + Resultado);
       break;
        
        case 2: 
        System.out.println("\noperação escolida subtração");
        Resultado = num1 - num2;
        System.out.println("\nO Resultado: " + Resultado);
       break;

       case 3:
       System.out.println("\n operação escolhida nultiplicação ");
       Resultado = num1 * num2; 
       System.out.println("\nO Resultado: " + Resultado);
       break;

       case 4:
       if (num2 != 0 ) {
        Resultado = num1/num2; 
        System.out.print("\n numero digitado" + num1);
        System.out.print("o numero dividido foi" + num2 );
        System.out.print("\n A divisão foi " + Resultado);
        } else { 
         System.out.println("\nnão e posssivel divir por zero ");
        }
        break;

        default:
        System.out.println("\nopção invalida. digite uma opção valida");
        break;
    }

} while (opcao < 1 || opcao > 4);
    
    scanner.close();
    }
}
