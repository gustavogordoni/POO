package E_Excecao_Ex01;

import javax.swing.JOptionPane;

public class Principal_Tabuada {

    public static void main(String[] args) {
        try {
            Tabuada tabuada = new Tabuada();

            JOptionPane.showMessageDialog(null, "Resposta: "
                    + tabuada.calcular(
                            Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro 001 - Informe um número inteiro!");
            System.out.println("Erro: " + e.getMessage());

        } finally {
            JOptionPane.showMessageDialog(null, "Fim do sistema.");
        }
    }
}
