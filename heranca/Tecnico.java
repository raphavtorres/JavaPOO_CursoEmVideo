package heranca;

public class Tecnico extends Aluno{
    private int registroProfissional;
    public void praticar(){
        System.out.println("Praticando...");
    }

    public int getRegistroProfissional(){
        return registroProfissional;
    }
    public void setRegistroProfissional(int rp){
        this.registroProfissional = rp;
    }
}