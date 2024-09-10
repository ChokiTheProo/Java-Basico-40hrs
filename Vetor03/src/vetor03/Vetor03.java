/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Roger Varela
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double v[] = {2.5,2.1,5.8,-4.5,9.0};
      Arrays.sort(v);
      for (double valor: v) {
          System.out.println(valor +"");
      }
        // TODO code application logic here
    }
    
}
