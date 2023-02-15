package lutador;

public class Lutador {
    //Construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int der, int emp) {

    }
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Getter e Setters
    public String getNome(){
        return this.nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public int getIdade(){
        return idade;
    }
    public void getIdade(int id){
        this.idade = id;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float a){
        this.altura = a;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria(){
        if (this.peso < 52.2 || this.peso > 120.2)
            System.out.println("Inválido");
        else if(this.peso <= 70.3)
            System.out.println("Leve");
        else if(this.peso <= 83.9)
            System.out.println("Médio");
        else if(this.peso <= 120.2)
            System.out.println("Pesado");
    }
    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int emp){
        this.empates = emp;
    }
    // Métodos
    public void apresentar(){
        System.out.println("ENTRANDO NO RING, TEMOS " + this.getNome() + " PESANDO " + this.getPeso());
        System.out.println("NACIONALIDADE DA " + this.getNacionalidade());
        System.out.println("TEM " + this.getIdade() + " E " + this.getAltura() + " METROS DE ALTURA");
        System.out.println("DA CATEGORIA: PESO" + this.getCategoria() + " POSUI " + this.vitorias + " VITÓRIAS, " + this.getDerrotas() + " DERROTAS E " + this.getEmpates());
    }
    public void status(){
        System.out.println("-----FICHA DE STATUS DO LUTADOR-----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    public void ganharLuta(){
        System.out.println(this.nome + " ganhou a luta!");
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        System.out.println(this.nome + "Perdeu a luta!");
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        System.out.println("Luta empatada!");
    }

}
