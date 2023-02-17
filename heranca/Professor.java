package heranca;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAum(float aum){
        this.setSalario(this.getSalario() + aum);
    }

    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String e){
        this.especialidade = e;
    }
    public float getSalario(){
        return salario;
    }
    public void setSalario(float s){
        this.salario = s;
    }
}
