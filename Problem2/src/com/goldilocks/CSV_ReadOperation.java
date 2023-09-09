package com.goldilocks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//input output steam
public class CSV_ReadOperation {

	public static void main(String[] args) {
		String inputFile = "input.csv";
		String outputFile = "output.csv";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

			String header = reader.readLine();
			String line;

			while ((line = reader.readLine()) != null) {

				String[] val = line.split(",");
				int sum = 0;
				for (int i = 0; i < val.length; i++) {
					
					int num = Integer.parseInt(val[i].trim());
					sum += num;
				}
				
                if(null != header && !header.isEmpty()) {
    				writer.write(header + "," + "Sum");
    				writer.newLine();
    				header = "";
                }  
				writer.write(line + "," + sum);
				writer.newLine();
			}

			reader.close();
			writer.close();

			System.out.println("Output written to the " + outputFile + " file Successfully!!!");
			System.out.println();
			System.out.println("Go and check " + outputFile + "file");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
