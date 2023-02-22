package polimorfismo;

public class Ave extends Animal{
    protected String corPena;
    public void fazerNinho(){
        System.out.println("Fez ninho...");
    }

    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
}
