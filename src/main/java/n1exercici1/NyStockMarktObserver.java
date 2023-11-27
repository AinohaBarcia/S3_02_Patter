package n1exercici1;

public class NyStockMarktObserver extends Observer {
    private double price = 44.6;

    public NyStockMarktObserver(StockAgencies stockAgency) {
        this.stockAgency = stockAgency;
        this.stockAgency.addStockAgency(this);
    }

    @Override
    public void update() {
        System.out.println("Ha invertido " + stockAgency.getVariation()*price+ " € en la bolsa de Nueva YHork");
    }
}
