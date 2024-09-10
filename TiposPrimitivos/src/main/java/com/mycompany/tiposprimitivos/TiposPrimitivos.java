/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Roger Varela
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite o nome: ");
        String nome = teclado.nextLine();
       System.out.print("digite a nota: ");
      float nota = teclado.nextFloat();
        ;
     
        System.out.println("a nota e "+ nota);
        System.out.printf("a nota de %s é %.2f \n",nome,+ nota );
        System.out.format("a nota de %s é %.1f",nome,+nota);
        
    }
}
