package heranca;

public class Aluno extends Pessoa{
    private boolean matr;
    private String curso;
    public void cancelarMatr(){
        System.out.println("Matrícula cancelada!");
    }
    public void pagarMens(){
        System.out.println("Pagando mensalidade de aluno: " + this.getNome());
    }

    public boolean getMatr(){
        return matr;
    }
    public void setMatr(boolean m){
        this.matr = m;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String c){
        this.curso = c;
    }
}
