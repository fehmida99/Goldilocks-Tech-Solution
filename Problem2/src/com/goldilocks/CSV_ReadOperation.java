package com.goldilocks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSV_ReadOperation {
	
	public static void main(String[] args) {
		String inputFile = "input.csv";
        String outputFile = "output.csv";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line;
            double sum = 0.0;
            
            while ((line = reader.readLine()) != null) {
                String[] val = line.split(",");
                if (val.length >= 3) {
                    double num1 = Double.parseDouble(val[0]);
                    double num2 = Double.parseDouble(val[1]);
                    double num3 = Double.parseDouble(val[2]);
                    sum += num1 + num2 + num3;

                    writer.write(line + "," + (num1 + num2 + num3));
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            System.out.println("Output written to the " + outputFile +" file Successfully!!!");
            System.out.println();
            System.out.println("Go and check "+ outputFile + "file");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}
}
