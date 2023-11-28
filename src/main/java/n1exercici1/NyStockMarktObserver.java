package n1exercici1;

public class NyStockMarktObserver extends Observer {
    private float price = 44.6F;

    public NyStockMarktObserver(StockAgencies stockAgency) {
        this.stockAgency = stockAgency;
        this.stockAgency.addStockAgency(this);
    }

    @Override
    public void update() {
        System.out.println("Ha invertido " + stockAgency.getActions()*price+ " € en la bolsa de Nueva York");
    }
}
