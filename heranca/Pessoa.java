package heranca;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }

    public void detalhes(){
        System.out.println("Nome: " + this.getNome() + " || Idade: " + this.getIdade()+ " || Sexo: " + this.getSexo());
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String s) {
        this.sexo = s;
    }
}
