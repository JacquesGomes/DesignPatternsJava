package org.example;

import org.example.singleton.SingletonEager;
import org.example.singleton.SingletonLazy;
import org.example.singleton.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {

        //Singleton test
        SingletonLazyHolder lazy = SingletonLazyHolder.getInstancia();
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
        System.out.println(lazy2);

    }
}