/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
 import javax.swing.JOptionPane;
/**
 *
 * @author Roger Varela
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     float n, s=0, conta=-1, par=-1, impar=0, maisdecem=0, media;
        do {
        n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um número: <br><em>(0 interrompe)</html>"));
        s += n;
        conta++;    
        if (n%2==0){
           par++; 
        } else {
            impar++;
        }
        if (n>=100){
            maisdecem++;
        }
        
        } while (n!=0);
        media = s/conta;
        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr>" + "Total de valores: "+ conta
        + "<br>Total de pares: "+par+"<br>Total de ímpares: "+impar+"<br>Acima de 100: "+maisdecem+
                "<br>Soma dos valores: " + s + "<br>Média dos valores: "+media);
    } 
    
}
   
