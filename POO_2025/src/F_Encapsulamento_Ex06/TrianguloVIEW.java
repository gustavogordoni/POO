/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex06;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class TrianguloVIEW {

    public static void main(String[] args) {

        
        TrianguloCTR trianguloCTR = new TrianguloCTR();
        TrianguloDTO trianguloDTO = new TrianguloDTO();
        
        JOptionPane.showMessageDialog(null, "Classificação de triângulos");
        trianguloDTO.setLado01(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado 01: ")));
        trianguloDTO.setLado02(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado 02: ")));
        trianguloDTO.setLado03(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado 03: ")));
        
        JOptionPane.showMessageDialog(null, trianguloCTR.verificarTriangulo(trianguloDTO));
        
    }

}
