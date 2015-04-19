package com.kadet.memberGenerator.generator;

import com.kadet.memberGenerator.util.GeneratorUtil;

/**
 * Created by AlexSoroka on 4/19/2015.
 */
public class TextGenerator implements Generator {

    @Override
    public String generate() {
        return GeneratorUtil.generateText();
    }
}
