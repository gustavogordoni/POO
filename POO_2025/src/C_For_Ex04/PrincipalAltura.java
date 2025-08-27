/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_For_Ex04;

import javax.swing.JOptionPane;
/**
 *
 * @author gustavo
 */
public class PrincipalAltura {

    public static void main(String args[]) {
        Altura altura = new Altura();

        int qnt = 20;

        for (int i = 0; i < qnt; i++) {
            altura.somarAlturas(Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Informe o valor da " + (i+1) + "° altura: ")
            ), qnt);
        }
        
        JOptionPane.showMessageDialog(null, altura.exibirInfo());

    }

}
