/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_IF_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class PrincipalSolo {

    public static void main(String[] args) {
        Solo solo = new Solo();

        JOptionPane.showMessageDialog(null, "Classificação do solo: " + 
            solo.classificarSolo(
                Double.parseDouble(
                    JOptionPane.showInputDialog("Informe a pontuação de água presente na amostra: "))
            )
        );
    }
}