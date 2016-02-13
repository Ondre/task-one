package com.epam.ap.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomLineGetter {
    public static final String EQUIPMENT = "src/main/resources/equipment.txt";
    private List<String> lines;
    private Random rnd = new SecureRandom();

    public String getLineFrom(String fileName){
        if (lines == null) {
            readFileToList(fileName);
        }
        return getRandomLine();
    }

    private String getRandomLine() {
        return lines.get(rnd.nextInt(lines.size()));
    }

    private void readFileToList(String fileName) {
        lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileInputStream(fileName));
            while (scanner.hasNext()){
                lines.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
