import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal productCost = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.05");
        BigDecimal units = new BigDecimal("10000");


        BigDecimal singleVatAmount = productCost.multiply(vatRate).setScale(2, RoundingMode.HALF_UP);


        BigDecimal totalCost = productCost.multiply(units);
        BigDecimal totalVat = singleVatAmount.multiply(units);
        BigDecimal totalGross = totalCost.add(totalVat);


        System.out.println("VAT per unit: " + singleVatAmount);
        System.out.println("Total net sales: " + totalCost);
        System.out.println("Total VAT: " + totalVat);
        System.out.println("Total gross sales: " + totalGross);
    }
}