/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Heranca_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author gordoni
 */
public class ClienteVIEW {
    
    public static void main(String[] args) {
        FisicoDTO fisicoDTO = new FisicoDTO();
        FisicoCTR fisicoCTR = new FisicoCTR();
        
        fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome do Cliente FÍSICO:"));
        fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe o cidade do Cliente FÍSICO:"));
        fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado do Cliente FÍSICO:"));
        fisicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço do Cliente FÍSICO:"));
        
        fisicoDTO.setCpf(JOptionPane.showInputDialog("Informe o CPF do Cliente FÍSICO:"));
        fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG do Cliente FÍSICO:"));
        
        JOptionPane.showMessageDialog(null, fisicoCTR.mostrarDadosFisi(fisicoDTO));
        
        
        // ----------------------------
        
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoCTR juridicoCTR = new JuridicoCTR();
        
        juridicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome do Cliente JURIDICO:"));
        juridicoDTO.setCidade(JOptionPane.showInputDialog("Informe o cidade do Cliente JURIDICO:"));
        juridicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado do Cliente JURIDICO:"));
        juridicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço do Cliente JURIDICO:"));
        
        juridicoDTO.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ do Cliente JURIDICO:"));
        juridicoDTO.setIe(JOptionPane.showInputDialog("Informe o IE do Cliente JURIDICO:"));
        
        JOptionPane.showMessageDialog(null, juridicoCTR.mostrarDadosJuri(juridicoDTO));
    }
    
}
