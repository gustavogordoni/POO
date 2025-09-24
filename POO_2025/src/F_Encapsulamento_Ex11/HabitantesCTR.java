/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex11;

/**
 *
 * @author gustavo
 */
public class HabitantesCTR {
    
    HabitantesDAO habitantesDAO = new HabitantesDAO();
    
    public boolean computarDados(HabitantesDTO habitantesDTO){
        return habitantesDAO.computarDados(habitantesDTO);
    }
    
    public String imprimirDados(HabitantesDTO habitantesDTO){
        return habitantesDAO.imprimirDados(habitantesDTO);
    }
}
