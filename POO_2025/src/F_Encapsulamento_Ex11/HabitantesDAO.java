/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_Encapsulamento_Ex11;

/**
 *
 * @author gustavo
 */
public class HabitantesDAO {

    String mensagem = "";

    public boolean computarDados(HabitantesDTO habitantesDTO) {

        if (habitantesDTO.getSexo().equalsIgnoreCase("Masculino")) {
            habitantesDTO.setNumHomens(habitantesDTO.getNumHomens() + 1);
            habitantesDTO.setContador(habitantesDTO.getContador() + 1);
            habitantesDTO.setSomaSalario(habitantesDTO.getSomaSalario() + habitantesDTO.getSalario());

            return true;

        } else if (habitantesDTO.getSexo().equalsIgnoreCase("Feminino")) {
            habitantesDTO.setNumMulheres(habitantesDTO.getNumMulheres() + 1);

            if (habitantesDTO.getSalario() <= 300.00) {
                habitantesDTO.setNumMulheresSal(habitantesDTO.getNumMulheresSal() + 1);
            }

            habitantesDTO.setContador(habitantesDTO.getContador() + 1);
            habitantesDTO.setSomaSalario(habitantesDTO.getSomaSalario() + habitantesDTO.getSalario());

            return true;
        } else {
            return false;
        }
    }

    public String imprimirDados(HabitantesDTO habitantesDTO) {

        mensagem = "A média salarial do Habitantes é: R$" + (habitantesDTO.getSomaSalario() / habitantesDTO.getContador()) + "\n";
        mensagem +=  "O Percentual de Mulheres é: " + (habitantesDTO.getNumMulheres() * 100) / habitantesDTO.getContador() + "%\n";
        mensagem +=  "O Percentual de Mulheres que ganham Salário igual ou inferiror a R$300.00 é: " + (habitantesDTO.getNumMulheresSal() * 100) / habitantesDTO.getNumMulheres() + "%\n";
        mensagem +=  "O Percentual de Homens é: " + (habitantesDTO.getNumHomens() * 100) / habitantesDTO.getContador() + "%\n";

        return mensagem;

    }

}
