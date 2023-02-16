package pessoaLivro;

import java.util.Random;

public class Livro implements Publicacao{
    public Livro(String tit, String aut, String no, int totPag, Pessoa le){
        this.setTitulo(tit);
        this.setAutor(aut);
        this.setTotPaginas(totPag);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(le);
    }
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public void detalhes(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Número de páginas: " + this.getTotPaginas());
    }

    @Override
    public void abrir() {
        if (this.getAberto())
            System.out.println("Livro já está aberto!");
        else
            this.setAberto(true);
    }
    @Override
    public void fechar() {
        if (!this.getAberto())
            System.out.println("Livro já está fechado!");
        else
            this.setAberto(false);
    }
    @Override
    public void folhear() {
        System.out.println("Folheando...");
        Random random = new Random();
        int pagAle = random.nextInt(this.getTotPaginas());
        this.setPagAtual(pagAle);
    }
    @Override
    public void avancarPag(int numAv) {
        if (this.getPagAtual() + numAv <= this.getTotPaginas())
            this.setPagAtual(this.getPagAtual() + numAv);
        else
            System.out.println("Não tem como avançar tantas páginas!");
    }
    @Override
    public void voltarPag(int numVt) {
        if (this.getPagAtual() - numVt >= 0 )
            this.setPagAtual(this.getPagAtual() - numVt);
        else
            System.out.println("Não tem como voltar tantas páginas!");
    }
}
