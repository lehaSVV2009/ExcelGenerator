package com.kadet.memberGenerator.generator;

import com.kadet.memberGenerator.util.GeneratorUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AlexSoroka on 4/19/2015.
 */
public class GeneratorFactory {

    public static Generator createGenerator (String text) {
        if (text == null || text.length() == 0) {
            return new EmptyGenerator();
        }
        if ("text".equals(text)) {
            return new TextGenerator();
        }
        if ("mandatoryText".equals(text)) {
            return new MandatoryTextGenerator();
        }
        if ("email".equals(text)) {
            return new EmailGenerator();
        }
        if (text.startsWith("list")) {
           return parseListText(text);
        }
        if (text.startsWith("multiList")) {
            return parseMultiListText(text);
        }
        return new EmptyGenerator();
    }


    private static Generator parseListText (String listText) {
        if ("list".equals(listText)) {
            return new ListGenerator(new ArrayList<String>());
        }
        if (listText.startsWith("list[") && listText.endsWith("]")) {
            return new ListGenerator(getAllowedValues(listText.substring(5, listText.length() - 1)));
        }
        return new EmptyGenerator();
    }


    private static Generator parseMultiListText (String listText) {
        if ("multiList".equals(listText)) {
            return new MultiListGenerator(new ArrayList<String>());
        }
        if (listText.startsWith("multiList[") && listText.endsWith("]")) {
            return new MultiListGenerator(getAllowedValues(listText.substring(10, listText.length() - 1)));
        }
        return new EmptyGenerator();
    }



    /**
     *
     * @param text      Group1 | grousv sdf 2 | sfdsf
     * @return
     */
    private static List<String> getAllowedValues (String text) {
        List<String> allowedValues = Arrays.asList(text.split("\\|"));
        allowedValues = GeneratorUtil.trimList(allowedValues);
        return allowedValues;
    }

}
