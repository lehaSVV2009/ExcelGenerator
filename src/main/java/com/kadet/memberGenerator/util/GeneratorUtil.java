package com.kadet.memberGenerator.util;

import com.kadet.memberGenerator.generator.Generator;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * Created by AlexSoroka on 4/17/2015.
 */
public class GeneratorUtil {

    private final static Random random = new Random();

    public static String generateEmail () {
        return generateMandatoryText() + "@" + getRandomValueFromList(Constants.MAILS);
    }

    public static String generateMandatoryText () {
        String generated = generateText();
        while ("".equals(generated)) {
            generated = generateText();
        }
        return generated;
    }

    public static String generateText () {
        return RandomStringUtils.randomAlphanumeric(random.nextInt(20));
    }

    public static String getRandomValueFromList(List<String> list) {
        return list.get(random.nextInt(list.size()));
    }

    public static List<String> getRandomValuesFromList (List<String> list, int maxSize) {
        List<String> values = new ArrayList<String>();
        int randomSize = random.nextInt(maxSize);
        while (randomSize-- > 0) {
            values.add(getRandomValueFromList(list));
        }
        return (values);
    }

    public static String convertListToString (List<String> list) {
        if (list.size() == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size() - 1; ++i) {
            builder.append(list.get(i)).append(", ");
        }
        builder.append(list.get(list.size() - 1));
        return builder.toString();
    }

    public static List<String> getWithoutDuplicates (List<String> withDuplicates) {
        return new ArrayList<String>(new HashSet<String>(withDuplicates));
    }

    public static List<String> generateRandomTextValues(int maxNumber, Generator generator) {
        List<String> values = new ArrayList<String>();
        int randomSize = random.nextInt(maxNumber);
        while (randomSize-- > 0) {
            values.add(generator.generate());
        }
        return values;
    }

    public static List<String> trimList (List<String> list) {
        List<String> trimList = new ArrayList<String>();
        for (String text : list) {
            trimList.add(text.trim());
        }
        return trimList;
    }

}
