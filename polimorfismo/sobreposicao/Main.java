package polimorfismo.sobreposicao;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru cang = new Canguru();
        Cachorro cac = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish gold = new GoldFish();
        Arara ara = new Arara();

        cang.locomover();
        cac.locomover();
        cang.emitirSom();
        cac.emitirSom();
    }
}