/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author Roger Varela
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int cc = 0;
while(cc<10){
     cc++;
    if(cc == 5 || cc == 7 || cc== 4){
        continue;
    
}
    if(cc==7){
        break;
    }
      System.out.println("CAMBALHOTA " + cc);
}

    }
    
}
