/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex03;

/**
 *
 * @author gustavo
 */
public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
    public String verificarIdade(MotoristaDTO motoristaDTO){
        return motoristaDAO.verificarIdade(motoristaDTO);
    }   
}
