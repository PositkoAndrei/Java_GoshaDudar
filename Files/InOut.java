package Files;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class InOut {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("NewFile.txt");
            //File file2 = new File("C:\\Users\\andrew\\Desktop\\Михайлик нов.docx");

            if (!file.exists())
                file.createNewFile();


            PrintWriter pw = new PrintWriter(file);
            pw.println("Everithing is working");
            pw.println("Hello World");
            pw.close();

            br = new BufferedReader(new FileReader("NewFile.txt"));
            //br = new BufferedReader(new FileReader("C:\\Users\\andrew\\Desktop\\Михайлик нов.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error" + e);
            }
        }
    }
}
