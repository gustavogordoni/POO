/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_While_DoWhile_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class PrincipalVogalConsoante {
    
    public static void main(String[] args) {
        VogalConsoante vogalConsoante = new VogalConsoante();
        
        String letra = "";
        
        while(!letra.equals("0")){
            letra = JOptionPane.showInputDialog(null, "Informe uma letra, ou 0 para sair: ");
            vogalConsoante.verificarCaractere(letra);
        }
        
        JOptionPane.showMessageDialog(null, "A quantidade de VOGAIS informadas foi: " + vogalConsoante.getQntVogal());
        JOptionPane.showMessageDialog(null, "A quantidade de CONSOANTES informadas foi: " + vogalConsoante.getQntConsoante());               
    }
    
}
