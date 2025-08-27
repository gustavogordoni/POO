/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_IF_Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class PrincipalOrdenacao {
    
    public static void main(String[] args) {
        
        int n1, n2, n3, n4;
        
        Ordenacao ordenacao = new Ordenacao();

        JOptionPane.showMessageDialog(null, "Informe três números inteiros em ordem crescente, e em seguida um outro qualquer");
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 1° número: "));
        
        do{
            n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 2° número (superior a "+n1+"): "));
            if(n2 < n1)
                JOptionPane.showMessageDialog(null, "Informe um valor superior a "+n1);
        }while(n2 < n1);
        
        do{
            n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 3° número (superior a "+n2+"): "));
            if(n3 < n2)
                JOptionPane.showMessageDialog(null, "Informe um valor superior a "+n2);
        }while(n3 < n2);
        
        n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 4° número (qualquer): "));
        
        JOptionPane.showMessageDialog(null, ordenacao.ordenarDecrescente(n1, n2, n3, n4));        
    }
    
}