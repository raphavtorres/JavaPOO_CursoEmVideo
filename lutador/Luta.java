package lutador;

import java.util.Objects;
import java.util.Random;

public class Luta {
    // ATRIBUTOS
    public Luta(){}
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // MÉTODOS ESPECIAIS
    public Lutador getDesafiado(){
        return desafiado;
    }
    public void setDesafiado(Lutador ddo){
        this.desafiado = ddo;
    }
    public Lutador getDesafiante(){
        return desafiante;
    }
    public void setDesafiante(Lutador dant){
        this.desafiante = dant;
    }
    public int getRounds(){
        return rounds;
    }
    public void setRounds(int r){
        this.rounds = r;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean ap){
        this.aprovada = ap;
    }

    // MÉTODOS PRINCIPAIS (PÚBLICOS)
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        Random random = new Random();

        if(this.getAprovada()){
            System.out.println("¨¨¨¨ DESAFIADO ¨¨¨¨");
            this.getDesafiado().apresentar();
            System.out.println("¨¨¨¨ DESAFIANTE ¨¨¨¨");
            this.getDesafiante().apresentar();
            int vencedor = random.nextInt(3);//aleatorio(0..2)

            switch (vencedor){
                case 0:
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println(this.getDesafiado().getNome() + " ganhou a luta!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println(this.getDesafiante().getNome() + " ganhou a luta!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }

        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
}
