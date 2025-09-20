/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex09;

/**
 *
 * @author gustavo
 */
public class AlturaCTR {

    AlturaDAO alturaDAO = new AlturaDAO();

    public String mostrarResposta(AlturaDTO alturaDTO) {
        return alturaDAO.mostrarResposta(alturaDTO);
    }
}
