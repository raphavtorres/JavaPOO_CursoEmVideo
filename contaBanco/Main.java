package contaBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Número da conta: "); //transformar em automático
        int num_conta = scanner.nextInt();
        System.out.println("Qual será o tipo de conta?\n[CC] Conta Corrente: \n[CP] CONTA POUPANÇA");
        String tipo_conta = scanner.next();
        System.out.println("Qual o nome do titular da conta?:  ");
        String nome_titular = scanner.next();

        ContaBanco cb1 = new ContaBanco();
        cb1.abrirConta();
        cb1.setNumConta(num_conta);
        cb1.setTipo(tipo_conta);
        cb1.setDono(nome_titular);
    }
}
