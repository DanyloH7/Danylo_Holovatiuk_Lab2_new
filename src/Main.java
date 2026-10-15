public class Main {
    public static void main(String[] args){
        double productCost =9.99;
        double vatRate= 0.05;
        int units = 10000;
        double singleVatamount = productCost * vatRate;
        double totalCost = 0.0;
        double totalVat = 0.0;
        for(int i = 0; i < units;i++){
            totalCost = totalCost + productCost;
            totalVat = totalVat + singleVatamount;
        }
        double totalGross = totalCost + totalVat;

        System.out.println("VAT per unit: " + singleVatamount);
        System.out.println("Total net sales: " + totalCost);
        System.out.println("Total VAT: " + totalVat);
        System.out.println("Total gross sales: " + totalGross);


    }

}

