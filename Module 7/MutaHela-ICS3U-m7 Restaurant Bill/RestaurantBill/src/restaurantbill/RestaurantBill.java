package restaurantbill;

import java.text.*;

/*
  *Created by M.Helal
  *On October 2
  *to create a mock restaurant bill 
 */
public class RestaurantBill {

    public static void main(String[] args) {
        // initialize variables
        double mealCost = 39.45;
        double tax = 0.13;

        // calculate the cost of the meal with tax
        double mealTax = tax * mealCost;
        double mealTotalCost = mealTax + mealCost;

        // output the formatted bill to the user
        DecimalFormat twoDigits = new DecimalFormat("##.##");
        System.out.println("Restaurant Bill" + "\n---------------"
                + "\n" + "\nMeal:\t$" + mealCost + "\nHST:\t$"
                + twoDigits.format(mealTax) + "\nTotal:\t$"
                + twoDigits.format(mealTotalCost));
    }

}
