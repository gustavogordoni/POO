/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_While_DoWhile_Ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class PrincipalExemploWhile {

    public static void main(String[] args) {
        String letra;

        ExemploWhile exemplowhile = new ExemploWhile();
        letra = JOptionPane.showInputDialog("Informe a letra: ");

        while (letra.equalsIgnoreCase("x")) {
            exemplowhile.verificar(letra);
            letra = JOptionPane.showInputDialog("Informe a letra: ");
        }

        JOptionPane.showMessageDialog(null, exemplowhile.mostra());

    }
}
