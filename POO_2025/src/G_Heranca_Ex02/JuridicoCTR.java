/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Heranca_Ex02;

/**
 *
 * @author gordoni
 */
public class JuridicoCTR {

    JuridicoDAO juridicoDAO = new JuridicoDAO();

    public String mostrarDadosJuri(JuridicoDTO juridicoDTO) {
        return juridicoDAO.mostrarDadosJuri(juridicoDTO);
    }
}
