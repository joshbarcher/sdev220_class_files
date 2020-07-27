package console_io;

import java.util.Scanner;

public class Console
{
    private static Scanner console = new Scanner(System.in);

    public static String readLine(String prompt)
    {
        System.out.println(prompt);
        return console.nextLine();
    }

    public static int readInt(String prompt)
    {
        System.out.print(prompt);
        while (!console.hasNextInt())
        {
            System.out.print(prompt);
            console.nextLine(); //clear the new line...
        }

        int result = console.nextInt();
        console.nextLine(); //clear the new line...
        return result;
    }

    public static double readDouble(String prompt)
    {
        System.out.print(prompt);
        while (!console.hasNextDouble())
        {
            System.out.print(prompt);
            console.nextLine(); //clear the new line...
        }

        double result = console.nextDouble();
        console.nextLine(); //clear the new line...
        return result;
    }

    public static boolean readBoolean(String prompt)
    {
        System.out.print(prompt);
        while (!console.hasNextBoolean())
        {
            System.out.print(prompt);
            console.nextLine(); //clear the new line...
        }

        boolean result = console.nextBoolean();
        console.nextLine(); //clear the new line...
        return result;
    }
}

