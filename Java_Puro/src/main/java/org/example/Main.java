package org.example;

import org.example.facade.Facade;
import org.example.singleton.SingletonEager;
import org.example.singleton.SingletonLazy;
import org.example.singleton.SingletonLazyHolder;
import org.example.strategy.*;

public class Main {
    public static void main(String[] args) {

        //Singleton test
        /*SingletonLazyHolder lazy = SingletonLazyHolder.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazyHolder.getInstancia();
        System.out.println(lazy);

        SingletonLazy lazy1 = SingletonLazy.getInstancia();
        System.out.println(lazy1);
        lazy1 = SingletonLazy.getInstancia();
        System.out.println(lazy1);

        SingletonEager lazy2 = SingletonEager.getInstancia();
        System.out.println(lazy2);
        lazy2 = SingletonEager.getInstancia();
        System.out.println(lazy2);*/

        //Strategy

        /*IComportamento normal = new ComportamentoNormal();
        IComportamento agressivo = new ComportamentoAgressivo();
        IComportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();*/

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "123123");

    }
}