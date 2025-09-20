/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex06;

/**
 *
 * @author gustavo
 */
public class TrianguloCTR {
    TrianguloDAO trianguloDAO = new TrianguloDAO();    
    
    public String verificarTriangulo(TrianguloDTO trianguloDTO) {
        return trianguloDAO.verificarTriangulo(trianguloDTO);
    }
    
}
