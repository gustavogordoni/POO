/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Introducao_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class PrincipalNota {

    public static void main(String[] args) {

        Nota nota = new Nota();

        JOptionPane.showMessageDialog(null, "A média final é: " + 
            nota.calcularMedia(
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da nota 01: ")), 
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da nota 02: ")), 
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da nota 03: ")), 
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso da nota 01: ")), 
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso da nota 02: ")), 
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso da nota 03: "))
            )
        );
    }
}
