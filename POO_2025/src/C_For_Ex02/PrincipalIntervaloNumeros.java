/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_For_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class PrincipalIntervaloNumeros {

    public static void main(String[] args) {
        IntervaloNumeros intervaloNumeros = new IntervaloNumeros();

        JOptionPane.showMessageDialog(null, "O intervalo de números inteiros é entre os valores informados é:\n" +
                intervaloNumeros.definirIntervalo(
                        Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: ")),
                        Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "))
                )
        );
    }

}
