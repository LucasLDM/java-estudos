/* Escreva um programa Java para comparar duas strings lexicograficamente, ignorando as diferenças entre maiúsculas e minúsculas. */

package Strings;

import java.util.Scanner;

public class Ex003 {
    
    static Scanner scan = new Scanner(System.in);

    public static void comparaStrings(String str1, String str2){

        if(str1.compareToIgnoreCase(str2) == 0){
            System.out.printf("%s e %s são lexicograficamente iguais.", str1, str2);
        }
        else if(str1.compareToIgnoreCase(str2) < 0){
            System.out.printf("Lexicograficamente, %s é maior que %s.", str1, str2);
        }
        else if(str1.compareToIgnoreCase(str2) > 0){
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

