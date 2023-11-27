package n1exercici1;

public class Main {
    public static void main(String[] args) {

        StockAgencies stockAgency = new StockAgencies();
            new TokioStockMarktObserver(stockAgency);
            new NyStockMarktObserver(stockAgency);

        System.out.println("La compra de 14 acciones asciende a: " );
        stockAgency.setVariation(14);
        System.out.println();
        System.out.println("La compra de 130 acciones asciende a: ");
        stockAgency.setVariation(130);
        System.out.println();
    }
}