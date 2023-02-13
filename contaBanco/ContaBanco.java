package contaBanco;

import java.util.Objects;

public class ContaBanco {
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int num){
        this.numConta = num;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){
        this.setStatus(true);
        if (Objects.equals(this.tipo, "CC"))
            this.depositar(50F);
        // se tipo == CP
        else if (Objects.equals(this.tipo, "CP"))
            this.depositar(150F);
        else
            System.out.println("!ERRO! |MOTIVO: VALOR DE ENTRADA INVÁLIDO|");
    }
    public void fecharConta(){
        if (this.saldo > 0){
            this.sacar(this.saldo);
            System.out.println("DINHEIRO REMANESCENTE SACADO! |VALOR: " + this.saldo + "|");
        } else if (this.saldo < 0){
            System.out.println("NÃO FOI POSSÍVEL FAZER O FECHAMENTO DA CONTA! |MOTIVO: EM DÉBITO|");
        }
    }
    public void depositar(float valor_dep){
        this.saldo += valor_dep;
    }
    public void sacar(float valor_saq){
        if (!this.status)
            System.out.println("NÃO FOI POSSÍVEL FAZER O SAQUE! |MOTIVO: CONTA PRECISA ESTAR ABERTA|");
        else
            if (this.saldo < valor_saq)
                this.saldo += valor_saq;
            else
                System.out.println("NÃO FOI POSSÍVEL FAZER O SAQUE! |MOTIVO: SALDO INSUFICIENTE|");
    }
    public void pagarMensal(){
        if (Objects.equals(this.tipo, "CC"))
            this.sacar(12F);
        if (Objects.equals(this.tipo, "CP"))
            this.sacar(20F);
    }
}
