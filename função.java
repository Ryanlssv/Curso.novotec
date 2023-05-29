import java.util.Scanner;

public class função {
 public static void main(String[] args) {
 
 
    int num;
    Scanner scanner = new Scanner ( System.in);
    System.out.print("Digite sua nota:");
    num = scanner.nextInt();
   scanner.close();


   if (num < 7) {
    System.out.println("aluno reporvado kkkk");
  }  else {
    System.out.println("aluno aprovado :(");
  }  
}
}
