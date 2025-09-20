/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex09;

/**
 *
 * @author gustavo
 */
public class AlturaDAO {

    private String resposta;

    public String mostrarResposta(AlturaDTO alturaDTO) {

        if (alturaDTO.getAltura() < 1.20) {
            if (alturaDTO.getPeso() <= 60) {
                this.resposta = "A";
            } else if ((alturaDTO.getPeso() > 60) && (alturaDTO.getPeso() <= 90)) {
                this.resposta = "D";
            } else {
                this.resposta = "G";
            }

        } else if ((alturaDTO.getAltura() >= 1.20) && (alturaDTO.getAltura() < 1.70)) {
            if (alturaDTO.getPeso() <= 60) {
                this.resposta = "B";
            } else if ((alturaDTO.getPeso() > 60) && (alturaDTO.getPeso() <= 90)) {
                this.resposta = "E";
            } else {
                this.resposta = "H";
            }
        } else if (alturaDTO.getAltura() >= 1.70) {
            if (alturaDTO.getPeso() <= 60) {
                this.resposta = "C";
            } else if ((alturaDTO.getPeso() > 60) && (alturaDTO.getPeso() <= 90)) {
                this.resposta = "F";
            } else {
                this.resposta = "I";
            }
        }

        return "A classificação é: " + this.resposta;
    }
}
