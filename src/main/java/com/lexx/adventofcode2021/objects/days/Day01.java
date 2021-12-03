package com.lexx.adventofcode2021.objects.days;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.lexx.adventofcode2021.objects.Day;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Day01 implements Day {

    final Logger LOGGER = LoggerFactory.getLogger(getClass());

    public void run() {
        //
    }

    @Override
    public void doChallenge1() {
        Long ping;
        Long nextPing;
        int deeperCount = 0;
        ArrayList<String> inputList = new ArrayList<String>();

        inputList.addAll(readInput());

        if (!inputList.isEmpty()) {
            for (int i = 0; i < inputList.size() - 1; i++) {
                ping = Long.parseLong(inputList.get(i));
                if (i != inputList.size()) {
                    nextPing = Long.parseLong(inputList.get(i + 1));
                    if (nextPing > ping) {
                        deeperCount++;
                    }
                }
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Number of ping measurements greater than the previous measurement: ");
        System.out.println(deeperCount);
        System.out.println("--------------------------------");

    }

    @Override
    public void doChallenge2() {
        Long firstPing;
        Long secondPing;
        Long thirdPing;
        Long sum1;
        Long sum2;
        int increasedCount = 0;
        ArrayList<String> inputList = new ArrayList<String>();

        inputList.addAll(readInput());

        sum1 = null;
        if (!inputList.isEmpty()) {
            for (int i = 0; i < inputList.size() - 1; i++) {
                firstPing = Long.parseLong(inputList.get(i));
                if (i <= (inputList.size() - 3)) {
                    secondPing = Long.parseLong(inputList.get(i + 1));
                    thirdPing = Long.parseLong(inputList.get(i + 2));

                    if (i > 0) {
                        sum2 = firstPing + secondPing + thirdPing;
                        if (sum2 > sum1) {
                            increasedCount++;
                        }
                        sum1 = sum2;
                    } else {
                        sum1 = firstPing + secondPing + thirdPing;
                    }
                }
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Number of ping combination increases: ");
        System.out.println(increasedCount);
        System.out.println("--------------------------------");

    }

    @Override
    public ArrayList<String> readInput() {
        ArrayList<String> inputList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/data/day01.txt"));
            String line = reader.readLine();
            while (line != null) {
                inputList.add(line);

                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (

        Exception e) {
            LOGGER.error("Exception", e);
        }
        return inputList;
    }
}
