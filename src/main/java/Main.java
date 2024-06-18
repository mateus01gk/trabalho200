import java.util.Scanner;
import org.hamcrest.core.IsNull;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" digite seu primeiro nome");
    String nome = sc.next();
    System.out.println("digite seu sobrenome");
    String sobrenome = sc.next();
    System.out.println("digite sua idade:");
    int idade = sc.nextInt();
  
    System.out.println("digite sua altura :");
    double altura = sc.nextDouble();
    System.out.println("digite sua massa em kg:");
    int massa = sc.nextInt();
    double AlturaMateus = altura/100;
    double AlturaQuadrado = AlturaMateus * AlturaMateus;
    double MassaDividida = massa / AlturaQuadrado;
    System.out.println("Seu IMC é :" + MassaDividida);
    
    sc.close();

  }

}