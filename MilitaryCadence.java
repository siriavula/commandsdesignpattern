/**
 * This class is subclass for Command and is specifically for the Everywhere Command.
 * 
 * @author Siri, Ali, Valerie, Maddie
 */

//import utilities for the buffered reader--want to read the song files line by line

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//Used reference for Buffered Reader: https://www.javatpoint.com/how-to-read-file-line-by-line-in-java

public class MilitaryCadence {

    public MilitaryCadence() {
    }

    public void singIDontKnow() {
        BufferedReader r;
        try {
            //create instance of the reader

            r = new BufferedReader(new FileReader("idontknow.txt"));

            String line = r.readLine();
            while (line != null) {

                //prints the line

                System.out.println(line);

                //Sleep causes a pause for the input milliseconds. The words should linger in the terminal

                TimeUnit.MILLISECONDS.sleep(100);

                //"Clear" should clear the terminal, so that it's ready to print the next line

                System.out.print("\033[H\033[2J");

                //reading the next line

                line = r.readLine();
            }
            //closes the reader
            System.out.flush();
        } 
        //catch exceptions
        catch (IOException e) {
            e.printStackTrace();
        } 
        //catch exception
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void singEverywhereWeGo() {
        BufferedReader r;
        try {
            r = new BufferedReader(new FileReader("everywhere.txt"));

            String line = r.readLine();
            while (line != null) {
                System.out.println(line);
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print("\033[H\033[2J");
                line = r.readLine();
            }
            System.out.flush();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void singInArmy() {
        BufferedReader r;
        try {
            r = new BufferedReader(new FileReader("inarmy.txt"));

            String line = r.readLine();
            while (line != null) {
                System.out.println(line);
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print("\033[H\033[2J");
                line = r.readLine();
            }
            System.out.flush();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
