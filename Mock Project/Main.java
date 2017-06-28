
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList();
import java.io.IOException();
import java.io.FileReader();
import java.io.BufferedReader();

public class Main
{
    public static void main(String args[]) throws IOException {
        getDataFromTextFile();

        For 

    }

    public static void getDataFromTextFile() throws IOException {
        FileReader fr = new FileReader("code.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        
        while ((line = br.readLine()) != null) {
        String values[] = line.split(" ,")
    } 
}
