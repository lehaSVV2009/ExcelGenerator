package com.kadet.memberGenerator.generator;

import com.kadet.memberGenerator.util.GeneratorUtil;

import java.util.List;

/**
 * Created by AlexSoroka on 4/19/2015.
 */
public class MultiListGenerator implements Generator {

    private List<String> allowedValues;

    public MultiListGenerator(List<String> allowedValues) {
        this.allowedValues = allowedValues;
    }


    @Override
    public String generate() {
        if (allowedValues == null) {
            return "";
        }
        List<String> randomValues = GeneratorUtil.getRandomValuesFromList(allowedValues, 5);
        return GeneratorUtil.convertListToString(GeneratorUtil.getWithoutDuplicates(randomValues));
    }
}
