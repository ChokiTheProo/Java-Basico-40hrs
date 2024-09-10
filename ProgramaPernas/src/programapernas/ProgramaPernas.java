/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Roger Varela
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas");
        int perna = tec.nextInt();
         String tipo;
        System.out.print("Isso é um: ");
        switch (perna){
            case 1:
                tipo ="Saci";
                break;
            case 2 :
                tipo = "bipede";
                break;
            case 3:
                tipo = "tripe";
                break;
            case 4:
                tipo = "quadrupete";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "et";
                break;
                
        }
        System.out.println(tipo);
   
    }
    
}
