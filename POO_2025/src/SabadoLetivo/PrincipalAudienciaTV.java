package SabadoLetivo;

import javax.swing.JOptionPane;

public class PrincipalAudienciaTV {

    public static void main(String[] args) {

        AudienciaTV audienciatv = new AudienciaTV();

        int canal;
        String menu = "==== PESQUISA DE AUDIÊNCIA ====\n"
                + "Digite o número do canal assistido:\n"
                + " 9  - Canal 9\n"
                + "12 - Canal 12\n"
                + "23 - Canal 23\n"
                + "40 - Canal 40\n"
                + "Outro número - Outros canais\n"
                + " 0  - Encerrar pesquisa\n\n";

        do {
            canal = Integer.parseInt(JOptionPane.showInputDialog(menu + "Informe o canal: "));
            audienciatv.computarAudiencia(canal);
        } while (canal != 0);

        JOptionPane.showMessageDialog(null, "Resultado da Pesquisa: \n\n" + audienciatv.exibirInformacoes());
    }
}
