package controlador;

import java.lang.reflect.Method;

public interface Controlador {
    public abstract Method ligar();
    public abstract Method desligar();
    public abstract Method abrirMenu();
    public abstract Method fecharMenu();
    public abstract Method maisVolume();
    public abstract Method menosVolume();
    public abstract Method ligarMudo();
    public abstract Method desligarMudo();
    public abstract Method play();
    public abstract Method pause();
}
