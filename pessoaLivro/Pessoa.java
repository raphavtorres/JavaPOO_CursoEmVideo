package pessoaLivro;

public class Pessoa {
    public Pessoa(String na, int id, String s){
        this.setNome(na);
        this.setIdade(id);
        this.setSexo(s);
    }
    private String nome;
    private int idade;
    private String sexo;

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getSexo(){
        return sexo;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public void setSexo(String s){
        this.sexo = s;
    }
    public void fazerNiver(){
        this.setIdade(this.getIdade() + 1);
    }
}
