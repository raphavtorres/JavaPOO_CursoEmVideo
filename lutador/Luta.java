package lutador;

public class Luta {
    public Luta(){}
    private String desafiado;
    private String desafiante;
    private int rounds;
    public String getDesafiado(){
        return desafiado;
    }
    public void setDesafiado(String ddo){
        this.desafiado = ddo;
    }
    public String getDesafiante(){
        return desafiante;
    }
    public void setDesafiante(String dant){
        this.desafiante = dant;
    }
    public int getRounds(){
        return rounds;
    }
    public void setRounds(int r){
        this.rounds = r;
    }

    public void marcarLuta(){}
    public void lutar(){}
}
