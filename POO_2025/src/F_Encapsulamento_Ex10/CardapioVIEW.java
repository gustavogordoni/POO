/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex10;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class CardapioVIEW {

    public static void main(String[] args) {

        String menu = "Código        Produto     Preço(R$)\n"
                    + "  1         Hamburguer     1.50\n"
                    + "  2        Cheesburguer    1.80\n"
                    + "  3        Misto Quente    1.20\n"
                    + "  4          Americano     2.00\n"
                    + "  5        Queijo Prato    1.00\n"
                    + "Informe o código do produto: ";
        
        try {
            CardapioDTO cardapioDTO = new CardapioDTO();
            CardapioCTR cardapioCTR = new CardapioCTR();

            do {
                cardapioDTO.setProd(Integer.parseInt(JOptionPane.showInputDialog(menu)));                
                if(!cardapioCTR.somarConta(cardapioDTO)) JOptionPane.showMessageDialog(null, "Opção inválida!");
                
            } while (cardapioDTO.getProd() != 0);

            JOptionPane.showMessageDialog(null, cardapioCTR.imprimirConta(cardapioDTO));

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: \n" + e.getMessage());
        }

    }

}
