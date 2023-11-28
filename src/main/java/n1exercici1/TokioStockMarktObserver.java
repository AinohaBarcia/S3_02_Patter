package n1exercici1;

public class TokioStockMarktObserver extends Observer {

    private float price = 34.3F;
    public TokioStockMarktObserver(StockAgencies stockAgency) {
        this.stockAgency = stockAgency;
        this.stockAgency.addStockAgency(this);
    }

    @Override
    public void update() {
        System.out.println("Ha invertido " + stockAgency.getActions()*price+ " € en la bolsa de Tokio");
    }
}
