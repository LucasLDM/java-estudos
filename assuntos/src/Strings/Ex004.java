/* Escreva um programa Java para comparar duas strings lexicograficamente. Duas strings são lexicograficamente iguais se tiverem o mesmo comprimento e contiverem os mesmos caracteres nas mesmas posições. */

package Strings;

import java.util.Scanner;

public class Ex004 {
    
    static Scanner scan = new Scanner(System.in);

    public static void comparaStrings(String str1, String str2){

        if(str1.compareTo(str2) == 0){
            System.out.printf("%s e %s são lexicograficamente iguais.", str1, str2);
        }
        else if(str1.compareTo(str2) < 0){
            System.out.printf("Lexicograficamente, %s é maior que %s.", str1, str2);
        }
        else if(str1.compareTo(str2) > 0){
            System.out.printf("Lexicograficamente, %s é menor que %s.", str1, str2);
        }

    }

    public static void main(String[] args){

        System.out.print("Digite um texto: ");
        String texto1 = scan.nextLine();

        System.out.print("Digite outro texto: ");
        String texto2 = scan.nextLine();

        comparaStrings(texto1, texto2);

    }

}
