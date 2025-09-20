/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex08;

/**
 *
 * @author gustavo
 */
public class CrescenteCTR {
    
    CrescenteDAO crescenteDAO = new CrescenteDAO();            
    
    public String mostrarResposta(CrescenteDTO crescenteDTO){
        return crescenteDAO.mostrarResposta(crescenteDTO);
    }
    
}
