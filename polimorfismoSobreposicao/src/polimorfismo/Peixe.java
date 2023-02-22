package polimorfismo;

public class Peixe extends Animal{
    protected String corEscama;
    public void soltarBolha(){
        System.out.println("Soltou bolha...");
    }

    public String getCorEscama(){
        return corEscama;
    }
    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
        System.out.println("Comer sendimentos");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixes não emitem som");
    }
}
