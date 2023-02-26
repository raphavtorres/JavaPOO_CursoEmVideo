package assistirVideo;

import polimorfismo.sobreposicao.Cachorro;

public class Main {
    public static void main (String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Josué", "M", 12, "josicreison");
        g[1] = new Gafanhoto("Ester", "F", 14, "tetezinha");

        //System.out.println(g[0].toString());

        Visualizacao vis[] = new Visualizacao[5];

        vis[0] = new Visualizacao(g[0], v[2]); // Josué assiste HTML
        vis[0].avaliar();
        System.out.println(vis[0].toString());


        vis[1] = new Visualizacao(g[0], v[1]); // Josué assiste PHP
        vis[0].avaliar(87.0F);
        System.out.println(vis[1].toString());
    }
}
