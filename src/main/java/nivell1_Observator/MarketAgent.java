package nivell1_Observator;

import java.util.ArrayList;
import java.util.List;

public class MarketAgent {

    private List<MarketObserver> observers = new ArrayList<>();
    private double stockValue;


    public void addObservers(MarketObserver observer) {

        observers.add(observer);

    }

    public void removeObservers(MarketObserver observer) {

        observers.remove(observer);

    }

    public void notifyObservers() {

        for(MarketObserver observer : observers) {
            if(observer != null) {
                observer.update(this);
            }
        }




    }

    public double getStockvalue() {
        return stockValue;
    }

    public void setStockvalue(double value) {
        stockValue = value;
        notifyObservers();
    }



}
