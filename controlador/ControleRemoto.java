package controlador;

import java.lang.reflect.Method;

public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }
    private boolean getLigado(){
        return ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private boolean getTocando(){
        return tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    @Override
    public Method ligar() {
        return null;
    }

    @Override
    public Method desligar() {
        return null;
    }

    @Override
    public Method abrirMenu() {
        System.out.println(getLigado());
        System.out.println(getVolume());
        for (int i = 0; i < getVolume(); i += 10){
            System.out.println("|");
        }
        System.out.println(getTocando());
        return null;
    }

    @Override
    public Method fecharMenu() {
        System.out.println("Fechando MENU");
        return null;
    }

    @Override
    public Method maisVolume() {
        if(getLigado()){
            setVolume(getVolume() + 1);
        }
        return null;
    }

    @Override
    public Method menosVolume() {
        if(getLigado()){
            setVolume(getVolume() - 1);
        }
        return null;
    }

    @Override
    public Method ligarMudo() {
        if(getLigado() && getVolume() > 0){
            setVolume(0);
        }
        return null;
    }

    @Override
    public Method desligarMudo() {
        if(getLigado() && getVolume() == 0){
            setVolume(50);
        }
        return null;
    }

    @Override
    public Method play() {
        if(getLigado() && !getTocando()){
            setTocando(true);
        }
        return null;
    }

    @Override
    public Method pause() {
        if(getLigado() && getTocando()){
            setTocando(false);
        }
        return null;
    }
}
