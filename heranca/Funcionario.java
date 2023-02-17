package heranca;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    public void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }

    public String getSetor(){
        return setor;
    }
    public void setSetor(String s){
        this.setor = s;
    }
    public boolean getTrabalhando(){
        return trabalhando;
    }
    public void setTrabalhando(boolean t){
        this.trabalhando = t;
    }

}
