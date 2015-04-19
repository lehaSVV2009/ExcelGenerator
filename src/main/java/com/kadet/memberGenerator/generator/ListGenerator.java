package com.kadet.memberGenerator.generator;

import com.kadet.memberGenerator.util.GeneratorUtil;

import java.util.List;

/**
 * Created by AlexSoroka on 4/19/2015.
 */
public class ListGenerator implements Generator {

    private List<String> allowedValues;

    public ListGenerator(List<String> allowedValues) {
        this.allowedValues = allowedValues;
    }

    @Override
    public String generate() {
        if (allowedValues == null) {
            return "";
        }
        return GeneratorUtil.getRandomValueFromList(allowedValues);
    }

}
