public class Main {
    public static void main(String[] args) {

        long productCostCents = 999;
        long vatRatePercent = 5;
        int units = 10000;


        long singleVatCents = (productCostCents * vatRatePercent) / 100;

        long totalCostCents = 0;
        long totalVatCents = 0;


        for (int i = 0; i < units; i++) {
            totalCostCents = totalCostCents + productCostCents;
            totalVatCents = totalVatCents + singleVatCents;
        }

        long totalGrossCents = totalCostCents + totalVatCents;


        System.out.println("VAT per unit: " + (singleVatCents / 100.0));
        System.out.println("Total net sales: " + (totalCostCents / 100.0));
        System.out.println("Total VAT: " + (totalVatCents / 100.0));
        System.out.println("Total gross sales: " + (totalGrossCents / 100.0));
    }
}