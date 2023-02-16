package aula04;

import static java.lang.System.*;

public class Aula04 {
    public static void main(String[]args){
        Caneta c1 = new Caneta("Fabeer Castell", "Azul", 0.5F);

//        c1.setModelo("Faber Castell");
//        //c1.modelo = "BIC"; // poderia fazer isso se fosse público
//
//        c1.setPonta(0.5F);
//        // c1.status();
//
//        System.out.println("Tenho uma caneta do modelo: " + c1.getModelo());
//        // Vai dar erro porque modelo é privado;
//        //System.out.println("Tenho uma caneta: " + c1.modelo);

        c1.status();
    }
}
