import java.util.Scanner;

public class CarlysEventPrice
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of guests: ");
        int numberOfGuest = input.nextInt();
        final int PRICE_PER_PERSON = 35;
        int totalPrice = numberOfGuest * PRICE_PER_PERSON;

        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("* Carly's makes the food that makes it a party! *");
        System.out.println("*************************************************");
        System.out.println("");
        System.out.println("Number of guests: " + numberOfGuest);
        System.out.println("Price per guest: " + PRICE_PER_PERSON);
        System.out.println("Total price: " + totalPrice);
        System.out.println("");

        if (numberOfGuest >= 50)
        {
            System.out.println("Note: The event is considered as large event!");
        } else 
        {
            System.out.println("Note: The event is not considered as large event!");

        }
    }
}