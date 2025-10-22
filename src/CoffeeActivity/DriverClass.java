package CoffeeActivity;

//import here:
import java.util.Scanner;

public class DriverClass {

    final static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){

        CoffeeOrdering actOne = new CoffeeOrdering();

        actOne.display();

        int tempQuantity = input.nextInt();
        actOne.setQuantity(tempQuantity);

        String userReply = input.next();
        actOne.loyaltyCard(userReply);
        
        actOne.transaction();

        System.out.printf("Total Bill: %.2f", actOne.getBill());
        System.out.println();

    }

}
