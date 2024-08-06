//VINICIUS SOARES INOCENCIO//

package javaentrada;

import java.util.Scanner;

public class JavaEntrada {

   
   public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
          double valorInteira = 32.0;
          System.out.print("Digite a idade: ");
          int idade = scanner.nextInt();
          boolean meiaEntrada = false;
          
          if (idade <= 12) {
              meiaEntrada = true;
          } 
          
          else {
              System.out.print("Você possui uma carteira de estudante? (S/N): ");
              char resposta = scanner.next().charAt(0);
              if (resposta == 'S' || resposta == 's') {
                  meiaEntrada = true;
              }
          }
          
          double valorFinal;
          
          if (meiaEntrada) {
              valorFinal = valorInteira / 2;
          } 
          
          else {
              valorFinal = valorInteira;
          }
          
          System.out.println("Valor do ingresso: R$ " + valorFinal);
          System.out.println("Bom passeio! ");
         scanner.close();
      }
  }
}
    

