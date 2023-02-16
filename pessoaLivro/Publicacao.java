package pessoaLivro;

public interface Publicacao {
    public void abrir();
    public void fechar();
    public void folhear();
    public void avancarPag(int numAv);
    public void voltarPag(int numVt);
}
