/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex05;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class SoloVIEW {

    public static void main(String[] args) {
        SoloCTR soloCTR = new SoloCTR();
        SoloDTO soloDTO = new SoloDTO();

        soloDTO.setAmostra(Double.parseDouble(JOptionPane.showInputDialog("Informe a pontuação de água presente na amostra: ")));

        JOptionPane.showMessageDialog(null, "A classificação do solo é: \n" + soloCTR.classificarSolo(soloDTO));
    }

}
