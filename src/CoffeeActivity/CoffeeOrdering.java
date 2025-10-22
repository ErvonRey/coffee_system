package CoffeeActivity;

//import here:

class CoffeeOrdering {
    
    private int quantity;
    private boolean loyalCustomer;
    private double bill;
    
    final private double pricePerCup = 120;
    final private double fee = 20;
    final private double discount = 0.10;
    
    public CoffeeOrdering(){
        quantity = 0;
    }
    
    public void display(){
        
        System.out.println("---------------------------------------------");
        System.out.println("Welcome to Java Coffee Shop!");
        System.out.println("Price: 120.00 per cup");
        System.out.println("10% Off for Loyal Members");
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.print("How many orders would you like to order? ");
        
    }
    
    public void transaction(){
        
        this.bill = (quantity * pricePerCup) + fee;
       
        if (loyalCustomer == true) {
            
            double tempBill;
            
            tempBill = this.bill;
            
            tempBill = bill - (bill * discount);
            
            this.bill = tempBill;
            
        }
        
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
        askLoyalty();
    }
    
    public double getBill(){
        return bill;
    }
    
    public void askLoyalty(){
        System.out.print("Has loyalty Card? (Yes OR No): ");
    }
    
    public void loyaltyCard(String userReply){
        
        userReply.toLowerCase();
        
        if (userReply.equals("yes")) {
            
            this.loyalCustomer = true;
        
        } else if (userReply.equals("no")) {
        
            this.loyalCustomer = false;
        
        } else {
        
            System.out.println("Invalid input, please try again.");
            System.out.println("Order processed without Loyalty Card");
        
        }
        
    }
    
    

}


/*

    Implement a coffee order class that encapsulates
    two fields: quantity and LoyaltyCard and computes both
    the gross and final bill for an order. Each cup costs 120, and a one time
    service fee of 20 is added per order.

    service fee - 20
    loyalty card - 10%

*/