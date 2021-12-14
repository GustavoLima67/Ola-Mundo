import java.util.Scanner;
import java.util.Locale;

public class ProjetoExemploNoGithub{
     public static void main(String[] args) {
      Locale.setDefault(Locale.US); 
      Scanner sc = new Scanner(System.in);

      final double imposto = 5.0;
      System.out.print("Entre com o nome: ");
      String name = sc.nextLine();
      System.out.print("Entre com a idade: ");
      int age = sc.nextDouble();
      if(age < 18){
        while(age != 18){
          System.out.print("Sua idade tem que ser no minimo 18, Digite sua idade novamene");
          age = sc.nextInt();
        }
      }
      System.out.print("Digite seu salario: ");
      double salary = sc.nextDouble();

      double valueTotal = salary - imposto;

      System.out.println("Nome: "+name+
                      "\n Idade: "+age+
                      "\n Salario: "+valueTotal);
      
      sc.close();
     }
}