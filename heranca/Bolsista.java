package heranca;

public class Bolsista extends Aluno{
    private float bolsa;
    public void renovarBolsa(){

    }
    @Override
    public void pagarMens(){
        System.out.println(this.nome + " é bolsista! Pagamento facilidado.");
    }

    public float getBolsa(){
        return bolsa;
    }
    public void setBolsa(float b){
        this.bolsa = b;
    }
}
