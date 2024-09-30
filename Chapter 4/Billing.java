class Billing
{
    public void computeBill(double price) 
    {
        double total = price * (1 + 0.08);
        System.out.println("The total price for the bill is: " + total);
    }

    public void computeBill(double price, int quantity) 
    {
        double total = (price * quantity) * (1 + 0.08);
        System.out.println("The total price for the bill is: " + total);
    }


    public void computeBill(double price, int quantity, int discount) 
    {
        double tax = 0.08;
        double totalBeforeTax = (price * quantity) - discount;
        double total = totalBeforeTax * (1 + 0.08);
        System.out.println("The total price for the bill is: " + total);
    }
    
    public static void main(String[] args) {
        Billing b = new Billing();

        b.computeBill(23.2);      
        b.computeBill(16.266644, 3);    
        b.computeBill(14.58, 5, 2); 
    }
}
