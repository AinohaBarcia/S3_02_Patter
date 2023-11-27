package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class StockAgencies {
    private List<Observer> observers = new ArrayList<Observer>();
    private double variation;

    public double getVariation() {
        return variation;
    }

    public void setVariation(double variation) {
        this.variation = variation;
        notifyAllObservers();
    }
    public void addStockAgency (Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        observers.forEach(x->x.update());
    }

}
