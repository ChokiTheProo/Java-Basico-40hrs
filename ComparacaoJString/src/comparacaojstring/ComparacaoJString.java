/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaojstring;

/**
 *
 * @author Roger Varela
 */
public class ComparacaoJString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
         String nome3 = new String("Gustavo");
         String res;
         res = (nome1==nome3)?"igual":"diferente";
         System.out.println(res);
    }
    
}
