/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex10;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class CardapioDAO {

    boolean valida;
    String conta;
    double HAMBURGER = 1.50, CHEESEBURGUER = 1.80, MISTOQUENTE = 1.20, AMERICANO = 2.00, QUEIJOPRATO = 1.00;
    
    DecimalFormat decimalformat = new DecimalFormat("#,###.00");

    public boolean somarConta(CardapioDTO cardapioDTO) {
        try {
            valida = true;
            if (cardapioDTO.getProd() == 1) {
                cardapioDTO.setNumero_h(cardapioDTO.getNumero_h() + 1);
                cardapioDTO.setTotal(cardapioDTO.getTotal() + HAMBURGER);
            } else if (cardapioDTO.getProd() == 2) {
                cardapioDTO.setNumero_c(cardapioDTO.getNumero_c() + 1);
                cardapioDTO.setTotal(cardapioDTO.getTotal() + CHEESEBURGUER);
            } else if (cardapioDTO.getProd() == 3) {
                cardapioDTO.setNumero_m(cardapioDTO.getNumero_m() + 1);
                cardapioDTO.setTotal(cardapioDTO.getTotal() + MISTOQUENTE);
            } else if (cardapioDTO.getProd() == 4) {
                cardapioDTO.setNumero_a(cardapioDTO.getNumero_a() + 1);
                cardapioDTO.setTotal(cardapioDTO.getTotal() + AMERICANO);
            } else if (cardapioDTO.getProd() == 5) {
                cardapioDTO.setNumero_q(cardapioDTO.getNumero_q() + 1);
                cardapioDTO.setTotal(cardapioDTO.getTotal() + QUEIJOPRATO);
            } else if (cardapioDTO.getProd() != 0) {
                valida = false;
            }

            return this.valida;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro 001");
            return this.valida = false;
        }
    }    

    public String imprimirConta(CardapioDTO cardapioDTO) {
        try {
            this.conta = "===========================================";
            this.conta += "\nProduto     | Quantidade    | Valor     ";
            this.conta += "\n===========================================";

            if (cardapioDTO.getNumero_h() >= 1) {
                this.conta += "\nHamburger           " + cardapioDTO.getNumero_h() + "               R$" + cardapioDTO.getNumero_h() * HAMBURGER;
            }
            if (cardapioDTO.getNumero_c() >= 1) {
                this.conta += "\nCheeseburger     " + cardapioDTO.getNumero_c() + "               R$" + cardapioDTO.getNumero_c() * CHEESEBURGUER;
            }
            if (cardapioDTO.getNumero_m() >= 1) {
                this.conta += "\nMisto Quente     " + cardapioDTO.getNumero_m() + "               R$" + cardapioDTO.getNumero_m() * MISTOQUENTE;
            }
            if (cardapioDTO.getNumero_a() >= 1) {
                this.conta += "\nAmericano           " + cardapioDTO.getNumero_a() + "               R$" + cardapioDTO.getNumero_a() * AMERICANO;
            }
            if (cardapioDTO.getNumero_q() >= 1) {
                this.conta += "\nQueijo Prato        " + cardapioDTO.getNumero_q() + "               R$" + cardapioDTO.getNumero_q() * QUEIJOPRATO;
            }

            this.conta += "\n===========================================";
            this.conta += "\nTotal:   R$" + decimalformat.format(cardapioDTO.getTotal());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro 002");
        }

        return this.conta;
    }

}
