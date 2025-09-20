/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex09;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class AlturaVIEW {
    
    public static void main(String[] args) {
        AlturaCTR alturaCTR = new AlturaCTR();
        AlturaDTO alturaDTO = new AlturaDTO();
        
        alturaDTO.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura: ")));
        alturaDTO.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do peso: ")));
        
        JOptionPane.showMessageDialog(null, "Classificação: \n" + alturaCTR.mostrarResposta(alturaDTO));
    }
    
}
