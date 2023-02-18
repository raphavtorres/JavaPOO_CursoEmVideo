package heranca;

public class Main {
    public static void main(String[] args){
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Professor pro1 = new Professor();
        Funcionario f1 = new Funcionario();

        //p1.setNome("Pedro");
        a1.setNome("Maria");
        pro1.setNome("Cláudio");
        f1.setNome("Fabiana");
        b1.setNome("Marcos");

        //p1.setSexo("M");
        f1.setSexo("F");
        a1.setIdade(18);
        b1.setIdade(19);

        a1.setCurso("Informática");
        pro1.setSalario(2500.75f);
        f1.setSetor("Estoque");

        //p1.detalhes();
        a1.detalhes();
        pro1.detalhes();
        f1.detalhes();
        b1.detalhes();

        a1.setCurso("Informática");
        pro1.setNome("2500.75");
        f1.setNome("Estoque");

        a1.pagarMens(); // mesmo nome de método, mas funcionamento diferente
        b1.pagarMens();

    }
}
