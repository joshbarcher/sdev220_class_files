package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Treats
{
    public static void main(String[] args)
    {
        //create a list of treats
        ArrayList<String> treats = new ArrayList<>();

        treats.add("pumpkin bread");
        treats.add("banana bread");
        treats.add("skittles");
        treats.add("cupcakes");
        treats.add("lemon cookie");

        //ask the user for a treat
        Scanner console = new Scanner(System.in);
    }
}
