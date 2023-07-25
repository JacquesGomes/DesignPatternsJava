package org.example.singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    //construtor privado para garantir que ela nunca seja instanciada fora daqui
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
