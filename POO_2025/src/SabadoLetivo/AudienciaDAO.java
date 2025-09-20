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
public class AudienciaDAO {

    public void computarAudiencia(AudienciaDTO audienciaDTO) {

        try {
            switch (audienciaDTO.getCanal()) {
                case 9:
                    audienciaDTO.setC9(audienciaDTO.getC9() + 1);
                    break;
                case 12:
                    audienciaDTO.setC12(audienciaDTO.getC12() + 1);
                    break;
                case 23:
                    audienciaDTO.setC23(audienciaDTO.getC23() + 1);
                    break;
                case 40:
                    audienciaDTO.setC40(audienciaDTO.getC40() + 1);
                    break;
                default:
                    if (audienciaDTO.getCanal() != 0) {
                        audienciaDTO.setOutros(audienciaDTO.getOutros() + 1);
                    }
                    break;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe um número de canal válido (números naturais).\n"
                    + "ERRO: " + e.getMessage());
        }
    }

    public String exibirInformacoes(AudienciaDTO audienciaDTO) {
        return "Canal 9: " + audienciaDTO.getC9()
                + "\nCanal 12: " + audienciaDTO.getC12()
                + "\nCanal 23: " + audienciaDTO.getC23()
                + "\nCanal 40: " + audienciaDTO.getC40()
                + "\nOutros canais: " + audienciaDTO.getOutros();
    }

}
