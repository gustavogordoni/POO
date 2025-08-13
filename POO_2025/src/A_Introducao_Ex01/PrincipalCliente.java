package A_Introducao_Ex01;

import javax.swing.JOptionPane;

public class PrincipalCliente {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        System.out.println("==== Chamando os métodos do objeto ====\n");

        JOptionPane.showMessageDialog(null, cliente.mostrar(JOptionPane.showInputDialog("Informe o nome"),
                JOptionPane.showInputDialog("Informe o RG")));

        JOptionPane.showMessageDialog(null, cliente.mostrarNome(JOptionPane.showInputDialog("Informe o nome 2")));

        System.out.println("\n==== Fim da Chamada aos métodos do objeto ====\n");

    }//Fechar main

}//Fechar clinte
