package heranca;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p1.detalhes();
        p2.detalhes();
        p3.detalhes();
        p4.detalhes();


        p2.setCurso("Informática");
        p3.setNome("2500.75");
        p4.setNome("Estoque");

//        p1.receberAum(550.20);
//        p2.mudarTrabalho();
//        p4.cancelarMatr();
    }
}
