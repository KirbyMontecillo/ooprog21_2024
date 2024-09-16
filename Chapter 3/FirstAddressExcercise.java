public class FirstAddressExcercise
{
    public static void main (String[] args) // In this program, the main method calls displayAddress() to print the address details of Samsung.
    {
        System.out.println("First Java application"); // Without this line, the program would automatically execute the displayAddress method.

        displayAddress(); // This method prints Samsung's address details to the console.
    }

    public static void displayAddress()
    {
        System.out.println("Samsung Company");
        System.out.println("129, Samsung-Ro, Yeongtong-Gu, Suwon");
        System.out.println("Seoul, 16677");
        System.out.println("Company: Samsung Electronics Co., Ltd.");
    }

}