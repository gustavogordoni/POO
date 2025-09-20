/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex08;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class CrescenteVIEW {

    public static void main(String[] args) {

        try {
            CrescenteCTR crescenteCTR = new CrescenteCTR();
            CrescenteDTO crescenteDTO = new CrescenteDTO();

            crescenteDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número inteiro: ")));
            crescenteDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número inteiro: ")));
            crescenteDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número inteiro: ")));

            JOptionPane.showMessageDialog(null, "A ordem crescente é: \n" + crescenteCTR.mostrarResposta(crescenteDTO));
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
}
