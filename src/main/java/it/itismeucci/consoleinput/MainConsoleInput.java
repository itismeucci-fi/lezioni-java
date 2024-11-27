package it.itismeucci.consoleinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainConsoleInput {

    public static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        

        System.out.println("Scrivi qualcosa");
        String input = keyboard.readLine();


        System.out.println("Hai digitato " + input);
    }


}
