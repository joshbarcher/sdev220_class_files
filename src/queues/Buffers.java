package queues;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Buffers
{
    private static final int BUFFER_SIZE = 5;
    private static Queue<String> messages = new LinkedList<>();

    public static void main(String[] args)
    {
        //The Road Not Taken - Robert Frost
        print("Two roads diverged in a yellow wood,");
        print("And sorry I could not travel both");
        print("And be one traveler, long I stood");
        print("And looked down one as far as I could");
        print("To where it bent in the undergrowth;");
        print("");

        print("Then took the other, as just as fair,");
        print("And having perhaps the better claim,");
        print("Because it was grassy and wanted wear;");
        print("Though as for that the passing there");
        print("Had worn them really about the same,");
        print("");

        print("And both that morning equally lay");
        print("In leaves no step had trodden black.");
        print("Oh, I kept the first for another day!");
        print("Yet knowing how way leads on to way,");
        print("I doubted if I should ever come back.");
        print("");

        print("I shall be telling this with a sigh");
        print("Somewhere ages and ages hence:");
        print("Two roads diverged in a wood, and I—");
        print("I took the one less traveled by,");
        print("And that has made all the difference.");
        print("");

        //clear the buffer
        logToFile();
    }

    //print message to console and log message
    private static void print(String message)
    {
        messages.add(message);
        if (messages.size() >= BUFFER_SIZE)
        {
            logToFile();
        }

        System.out.println(message);
    }

    private static void logToFile()
    {
        //open file and append to contents
        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("output.txt", true)))
        {
            while (!messages.isEmpty())
            {
                writer.println(messages.remove());
            }
        }
        catch (Exception ex)
        {
            System.out.println("Error writing to file");
        }
    }
}

