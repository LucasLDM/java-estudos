/*  Escreva um programa Java para obter o caractere no índice fornecido dentro da String. */

package Strings;

import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        
        String texto;
        int posicao;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite algum texto ou palavra: ");
        texto = scan.nextLine();

        System.out.print("Uma posição para achar o caractere: ");
        posicao = scan.nextInt();

        System.out.println("Seu texto/palavra: " + texto);
        System.out.printf("O caractere na posição %d é %s.", posicao, texto.charAt(posicao));

        scan.close();

    }

}
