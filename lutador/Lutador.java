package lutador;

public class Lutador {
    //Construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int der, int emp) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(der);
        this.setEmpates(emp);
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
    public void setIdade(int id){
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
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;

    }
    private void setCategoria(){
        if (this.peso < 52.2 || this.peso > 120.2)
            this.categoria = "Inválido";
        else if(this.peso <= 70.3)
            this.categoria = "Leve";
        else if(this.peso <= 83.9)
            this.categoria = "Médio";
        else if(this.peso <= 120.2)
            this.categoria = "Pesado";
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
        System.out.println("ENTRANDO NO RING, TEMOS " + this.getNome() + ", PESANDO " + this.getPeso() + " Kg");
        System.out.println("DIRETAMENTE DO(A) " + this.getNacionalidade());
        System.out.println("COM " + this.getIdade() + " ANOS E " + this.getAltura() + " METROS DE ALTURA");
        System.out.println("DA CATEGORIA: PESO " + this.getCategoria());
        System.out.println("POSUI " + this.getVitorias() + " VITÓRIAS, " + this.getDerrotas() + " DERROTAS E " + this.getEmpates() + " EMPATES");
    }
    public void status(){
        System.out.println("-----FICHA DE STATUS DO LUTADOR-----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: Peso " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

}
