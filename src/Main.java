public class Main {
    public static void main(String[] args){

        long productCostCents = 999;
        long vatRatePercent = 5; // 5%
        int units = 10000;


        long singleVatAmountCents = (productCostCents * vatRatePercent) / 100;

        long totalCostCents = 0;
        long totalVatCents = 0;

        for(int i = 0; i < units; i++){
            totalCostCents += productCostCents;
            totalVatCents += singleVatAmountCents;
        }

        long totalGrossCents = totalCostCents + totalVatCents;


        System.out.println("VAT per unit: " + formatMoney(singleVatAmountCents));
        System.out.println("Total net sales: " + formatMoney(totalCostCents));
        System.out.println("Total VAT: " + formatMoney(totalVatCents));
        System.out.println("Total gross sales: " + formatMoney(totalGrossCents));
    }


    private static String formatMoney(long cents) {
        long dollars = cents / 100;
        long remainder = Math.abs(cents % 100);
        return dollars + "." + (remainder < 10 ? "0" : "") + remainder;
    }
}