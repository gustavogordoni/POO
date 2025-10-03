/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Heranca_Ex03;

/**
 *
 * @author gordoni
 */
public class AlunoCTR {
    
    AlunoDAO alunoDAO = new AlunoDAO();
    
    public String mostrarDadosAluno(AlunoDTO alunoDTO) {
        return  alunoDAO.mostrarDadosAluno(alunoDTO);
    }    
}
