package console_io;

import java.util.Scanner;

public class AddressProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //get address from our user
        System.out.print("Number: ");
        int number = input.nextInt(); //integer

        System.out.print("Street: ");
        String street = input.nextLine(); //string

        System.out.print("City: ");
        String city = input.nextLine(); //string

        System.out.print("State: ");
        String state = input.nextLine(); //string

        System.out.print("Zip: ");
        int zip = input.nextInt(); //integer

        System.out.printf("%d %s %s, %s %d",
            number, street, city, state, zip);
    }
}
