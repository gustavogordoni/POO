package A_Introducao_Ex01;

public class Cliente {

    private String nome, rg;

    public String mostrar(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;

//        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome +
//                                            "\nO rg informado foi: " + this.rg);
//        System.out.println("O nome informado foi: " + this.nome + 
//                            "\nO rg informado foi: " + this.rg);

        return "O nome informado foi: " + this.nome + "\nO rg informado foi: " + this.rg;
    }//Fecha o método mostrar

    public String mostrarNome(String nome) {
        this.nome = nome;

//        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome);
//
//        System.out.println("O nome informado foi: " + this.nome);

        return "O nome informado foi: " + this.nome;
    }//Fecha o método mostrarNome

}//Fechar classe
