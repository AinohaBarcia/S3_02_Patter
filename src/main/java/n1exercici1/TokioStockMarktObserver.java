package n1exercici1;

public class TokioStockMarktObserver extends Observer {
    private double price = 34.2;

    public TokioStockMarktObserver(StockAgencies stockAgency) {
        this.stockAgency = stockAgency;
        this.stockAgency.addStockAgency(this);
    }

    @Override
    public void update() {
        System.out.println("Ha invertido " + stockAgency.getVariation()*price+ " € en la bolsa de Tokio");
    }
}
