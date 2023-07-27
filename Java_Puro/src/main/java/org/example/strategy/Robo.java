package org.example.strategy;

public class Robo {

    private IComportamento strategy;

    public IComportamento getStrategy() {
        return strategy;
    }

    public void setStrategy(IComportamento strategy) {
        this.strategy = strategy;
    }

    public void mover(){
        strategy.mover();
    }

}
