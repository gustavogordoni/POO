/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex05;

/**
 *
 * @author gustavo
 */
public class SoloCTR {
    
    SoloDAO soloDAO = new SoloDAO();
    
    public String classificarSolo(SoloDTO soloDTO) {
        return soloDAO.classificarSolo(soloDTO);
    }    
}
