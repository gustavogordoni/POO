/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex07;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class OrdenarVIEW {

    public static void main(String[] args) {
        OrdenacaoDTO ordenacaoDTO = new OrdenacaoDTO();
        OrdenacaoCTR ordenacaoCTR = new OrdenacaoCTR();

        JOptionPane.showMessageDialog(null, "Informe três números inteiros em ordem crescente, e em seguida um outro qualquer");

        ordenacaoDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o 1° número:")));

        do {
            ordenacaoDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o 2° número:")));
            if (ordenacaoDTO.getN2() < ordenacaoDTO.getN1()) {
                JOptionPane.showMessageDialog(null, "Informe um valor superior a " + ordenacaoDTO.getN1());
            }

        } while (ordenacaoDTO.getN2() < ordenacaoDTO.getN1());

        do {
            ordenacaoDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o 3° número:")));
            if (ordenacaoDTO.getN3() < ordenacaoDTO.getN2()) {
                JOptionPane.showMessageDialog(null, "Informe um valor superior a " + ordenacaoDTO.getN2());
            }
        } while (ordenacaoDTO.getN3() < ordenacaoDTO.getN2());

        ordenacaoDTO.setN4(Integer.parseInt(JOptionPane.showInputDialog("Informe o 4° número (qualquer): ")));

        JOptionPane.showMessageDialog(null, ordenacaoCTR.ordenarDecrescente(ordenacaoDTO));
    }
}
