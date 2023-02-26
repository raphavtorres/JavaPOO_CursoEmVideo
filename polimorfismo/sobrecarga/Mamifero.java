package polimorfismo.sobrecarga;

public class Mamifero extends Animal{
    @Override
    public void locomover(){
        System.out.println("Andando");
    }
    @Override
    public void alimentar() {
        System.out.println("Tomando leite");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
