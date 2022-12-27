/*  Escreva um programa Java para obter o caractere (ponto de código Unicode) no índice fornecido dentro da String. */

package Strings;

import java.util.Scanner;

public class Ex002 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String texto = scan.nextLine();

        System.out.print("Posição: ");
        int posicao = scan.nextInt();

        System.out.printf("O caractere %s, tem o código unicode de: %d.", texto.charAt(posicao), texto.codePointAt(posicao));

        scan.close();

    }

}
