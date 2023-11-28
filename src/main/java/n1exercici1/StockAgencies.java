package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class StockAgencies {
    private List<Observer> observers = new ArrayList<Observer>();
    private float actions;

    public float getActions() {
        return actions;
    }

    public void setActions(float actions) {
        this.actions = actions;
        notifyAllObservers();
    }
    public void addStockAgency (Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        observers.forEach(x->x.update());
    }

}
