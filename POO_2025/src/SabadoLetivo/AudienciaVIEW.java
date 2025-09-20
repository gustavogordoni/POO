/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SabadoLetivo;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class AudienciaVIEW {

    public static void main(String[] args) {
        AudienciaCTR audienciaCTR = new AudienciaCTR();
        AudienciaDTO audienciaDTO = new AudienciaDTO();

        JOptionPane.showMessageDialog(null, "Pesquisa de audiência de canal de TV"
                + "\nCanais: 9, 12, 23, 40 ou outro.");
        do {
            audienciaDTO.setCanal(Integer.parseInt(JOptionPane.showInputDialog("Informe o canal: ")));
            audienciaCTR.computarAudiencia(audienciaDTO);
        } while (audienciaDTO.getCanal() != 0);

        JOptionPane.showMessageDialog(null, audienciaCTR.exibirInformacoes(audienciaDTO));
    }

}
