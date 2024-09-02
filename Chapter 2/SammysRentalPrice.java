import java.util.Scanner;

public class SammysRentalPrice
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of minutes: ");
        int numberOfMinutes = input.nextInt();

        final int RENTAL_COST_HOUR = 40;
        final int RENTAL_COST_MINUTE = 1;
        final int CONVERSION = 60;

        double hour = numberOfMinutes / CONVERSION;
        double additionalMinute = numberOfMinutes % CONVERSION;

        double pricePerHour = hour * RENTAL_COST_HOUR;
        double pricePerMinute = additionalMinute * RENTAL_COST_MINUTE;
        double totalPrice = pricePerHour + pricePerMinute;

        System.out.println("");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun! S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("");

        System.out.println("Hour/s: " + hour);
        System.out.println("Minute/s: " + additionalMinute);
        System.out.println("Total Price: " + totalPrice);
    }
}