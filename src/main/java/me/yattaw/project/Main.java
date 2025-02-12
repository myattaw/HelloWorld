package me.yattaw.project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Ensure you are using LocalDateTime here
        LocalDateTime now = LocalDateTime.now();

        // Format the current date and time
        String formattedDate = now.format(formatter);
        System.out.println("Current Time: " + formattedDate);

        // Get the runtime object
        Runtime runtime = Runtime.getRuntime();
        // Get the current amount of free memory in the JVM (in bytes)
        long freeMemory = runtime.freeMemory();
        // Convert bytes to megabytes for easier reading
        double freeMemoryInMB = freeMemory / (1024.0 * 1024.0);
        // Display the free memory in MB
        System.out.println("Current free memory: " + String.format("%.2f", freeMemoryInMB) + " MB");
    }
}