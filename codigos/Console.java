package codigos;

import java.util.Scanner;

public class Console {
  public static void console(){
    Scanner entrada = new Scanner(System.in);

    System.out.print("Informe seu nome: ");
    String nome = entrada.nextLine();
    System.out.print("Informe seu Sobrenome: ");
    String sobrenome = entrada.nextLine();
    System.out.print("Informe sua idade: ");
    int idade = entrada.nextInt();
    entrada.nextLine(); // Pega o /n do buffer
    
    System.out.printf("\n\n%s %s tem %d anos", nome, sobrenome, idade);

    entrada.close();
  }
}
