class Billing
{
    public void computeBill(double price) 
    {
        double total = price + (price * 0.08);
        System.out.println("The total price for the bill is: " + total);
    }

    public void computeBill(double price, int quantity) 
    {
        double noTax = price * quantity;
        double total = noTax + (noTax * 0.08);
        System.out.println("The total price for the bill is: " + total);
    }


    public void computeBill(double price, int quantity, int discount) 
    {
        double withoutTax = (price * quantity) - discount;
        double total = withoutTax + (withoutTax * 0.08);
        System.out.println("The total price for the bill is: " + total);
    }
    
    public static void main(String[] args) {
        Billing b = new Billing();

        b.computeBill(23.2);      
        b.computeBill(16.266644, 3);    
        b.computeBill(14.58, 5, 2); 
    }
}
