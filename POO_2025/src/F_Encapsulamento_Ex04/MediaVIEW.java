/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex04;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class MediaVIEW {

    public static void main(String[] args) {

        MediaCTR mediaCTR = new MediaCTR();
        MediaDTO mediaDTO = new MediaDTO();

        mediaDTO.setNota01(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da nota 01: ")));
        mediaDTO.setNota02(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da nota 02: ")));

        JOptionPane.showMessageDialog(null, 
            "A média do aluno é: " + mediaCTR.calcularMedia(mediaDTO)
            + "\nO aluno está: " + mediaCTR.determinarAprovacao(mediaDTO));
    }
}
