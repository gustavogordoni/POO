/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex07;

/**
 *
 * @author gustavo
 */
public class OrdenacaoCTR {
    OrdenacaoDAO ordenacaoDAO = new OrdenacaoDAO();

    public String ordenarDecrescente(OrdenacaoDTO ordenacaoDTO) {
        return ordenacaoDAO.ordenarDecrescente(ordenacaoDTO);
    }
    
}
