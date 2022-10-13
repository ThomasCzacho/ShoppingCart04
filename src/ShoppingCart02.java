public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";


        // Declare and initialize numeric fields: price, tax, quantity.
        double itemPrice = 18.99;
        double salesTaxRate = 0.05;
        int itemQuantity = 2;
        double Total;

        
        Total=(itemPrice*salesTaxRate+itemPrice)*itemQuantity;

        String message = custName+" wants to purchase "+itemQuantity+" "+itemDesc;
        System.out.println(message);
        System.out.println("Total cost with tax is: $"+Total);


        // Declare and assign a calculated totalPrice


        // Modify message to include quantity


        // Print another message with the total cost

    }
}
