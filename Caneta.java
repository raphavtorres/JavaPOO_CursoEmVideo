public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected String carga;
    private boolean tampada;
    public void escrever(){
    }

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Está tampada?: " + this.tampada);
    }
    public void rabiscar(){
        if (!this.tampada) {
            System.out.println("Rabiscando");
        } else {
            System.out.println("Destampe a caneta");
        }
    }

    public void pintar(){
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

}
