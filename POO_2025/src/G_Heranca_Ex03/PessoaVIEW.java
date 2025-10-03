/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Heranca_Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author gordoni
 */
public class PessoaVIEW {

    public static void main(String[] args) {
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        FuncionarioCTR funcionarioCTR = new FuncionarioCTR();

        JOptionPane.showMessageDialog(null, "Cadastrando Funcionário");
        funcionarioDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));

        do {
            funcionarioDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
            if (funcionarioDTO.getIdade() <= 0) {
                JOptionPane.showMessageDialog(null, "Idade inválida!");
            }
        } while (funcionarioDTO.getIdade() <= 0);

        funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
        funcionarioDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));

        funcionarioDTO.setFuncao(JOptionPane.showInputDialog("Informe a função: "));
        funcionarioDTO.setSiape(JOptionPane.showInputDialog("Informe a siape: "));

        JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarDadosFuncionario(funcionarioDTO));

        // --------------------------------------------------------
        AlunoDTO alunoDTO = new AlunoDTO();
        AlunoCTR alunoCTR = new AlunoCTR();

        JOptionPane.showMessageDialog(null, "Cadastrando Aluno");
        alunoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));

        do {
            alunoDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
            if (alunoDTO.getIdade() <= 0) {
                JOptionPane.showMessageDialog(null, "Idade inválida!");
            }
        } while (alunoDTO.getIdade() <= 0);

        alunoDTO.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
        alunoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));

        alunoDTO.setCurso(JOptionPane.showInputDialog("Informe o curso: "));
        alunoDTO.setProntuario(JOptionPane.showInputDialog("Informe o prontuário: "));

        JOptionPane.showMessageDialog(null, alunoCTR.mostrarDadosAluno(alunoDTO));
    }

    private void cadPessoa(PessoaDTO pessoa) {
        pessoa.setNome(JOptionPane.showInputDialog("Informe o nome: "));

        do {
            pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
            if (pessoa.getIdade() <= 0) {
                JOptionPane.showMessageDialog(null, "Idade inválida!");
            }
        } while (pessoa.getIdade() <= 0);

        pessoa.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
        pessoa.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
    }
