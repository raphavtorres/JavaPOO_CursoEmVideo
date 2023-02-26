package polimorfismo.sobrecarga;

public class Cachorro extends Mamifero {
    @Override
    public void alimentar() {
        System.out.println("Comendo ração");
    }
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    public void abanar(){
        System.out.println("Abanando!");
    }
    public void rosnar(){
        System.out.println("Rghhhhh");
    }

    // REAGIR A FRASE
    public void reagir(String frase){
        if (frase.equals("agradavel")) {
            this.abanar();
            this.emitirSom();
        } else {
            this.rosnar();
        }
    }

    // REAGIR COM BASE NO HORÁRIO
    public void reagir(int hora, int minuto){
        if (hora < 12) {
            this.abanar();
        } else if (hora >= 18) {
            System.out.println("Ignorando");
        } else {
            this.abanar();
            this.emitirSom();
        }
    }

    // REAGIR A DONO OU ESTRANHO
    public void reagir(boolean dono){
        if (dono) {
            this.abanar();
        } else {
            this.rosnar();
            this.emitirSom();
        }
    }

    // REAGIR A DEPENDER DA IDADE
    public void reagir(int idade, float peso){
        if (idade <= 5 && peso <= 3)
            this.abanar();
        else if (idade <= 5 && peso > 3)
            this.emitirSom();
        else if (idade > 5 && peso <= 3)
            this.rosnar();
        else
            System.out.println("Ignorando");
    }
}
