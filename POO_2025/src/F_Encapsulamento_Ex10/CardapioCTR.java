/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex10;

/**
 *
 * @author gustavo
 */
public class CardapioCTR {
    
    CardapioDAO cardapioDAO = new CardapioDAO();
    
    public boolean somarConta(CardapioDTO cardapioDTO) {
        return cardapioDAO.somarConta(cardapioDTO);
    }
    
    public String imprimirConta(CardapioDTO cardapioDTO) {
        return cardapioDAO.imprimirConta(cardapioDTO);
    }    
}
