package bill.of.sale;

/*
  *Created by M.Helal
  *On September 30
  *to calculate and print bill using specified information
 */
public class BillOfSale {

    public static void main(String[] args) {
        double AmountGiven, price, TotalPrice, tax, change;
        AmountGiven = 20;
        price = 12.49;
        tax = (0.13 * price); //calculating tax by turning 13% to a decimal
        TotalPrice = (price + tax);
        change = (AmountGiven - TotalPrice);
        System.out.println("--BILL--\nPrice: $" + price + "\nTax(HST): $" + tax + "\nTotal: $" + TotalPrice + "\nAmount Given: $" + AmountGiven + "\nChange $" + change);

    }

}
