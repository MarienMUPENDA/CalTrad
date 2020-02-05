package com.caltrad.util;


import java.io.*;
import java.util.Scanner;

public class FileManager {


    public static void writeToFile(String path, String content) {
        writeToFile(new File(path), content);
    }


    public static String writeToFile(File file, String content) {

        FileWriter writer = null;
        try {
            if (!file.exists())
                file.createNewFile();

            writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            return file.getAbsolutePath();
        } catch (IOException e) {
            return e.toString();
        }

    }

    public static String readFromFile(String path) {
        return readFromFile(new File(path));
    }


    public static String readFromFile(File file) {
        BufferedReader reader = null;
        StringBuilder buffer = new StringBuilder();
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            reader.close();
        } catch (IOException ioe) {
        }
        return buffer.toString();
    }

}
